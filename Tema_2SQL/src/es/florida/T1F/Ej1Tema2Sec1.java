package es.florida.T1F;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Ej1Tema2Sec1 {
	public static Canciones addSong() {
		Canciones c = new Canciones();
		Scanner s = new Scanner(System.in);
		String r;
		System.out.println("ID");
		r = s.nextLine();
		c.setId(Integer.parseInt(r));
		System.out.println("Titulo");
		r = s.nextLine();
		c.setTitle(r);
		System.out.println("Album");
		r = s.nextLine();
		c.setAlbum(r);
		System.out.println("Artista");
		r = s.nextLine();
		c.setAuthor(r);
		System.out.println("Año");
		r = s.nextLine();
		c.setYear(Integer.parseInt(r));

		return c;
	}

	public static void writeXmlFile(List<Canciones> lista) {
		try {
			DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
			DocumentBuilder build = dFact.newDocumentBuilder();
			Document doc = build.newDocument();
			Element raiz = doc.createElement("canciones");
			doc.appendChild(raiz);
			for (Canciones can : lista) {
				Element cancion = doc.createElement("cancion");
				String id = String.valueOf(can.getId());
				cancion.setAttribute("id", id);
				raiz.appendChild(cancion);
				Element titulo = doc.createElement("titol");
				titulo.appendChild(doc.createTextNode(String.valueOf(can.getTitle())));
				cancion.appendChild(titulo);
				Element album = doc.createElement("album");
				album.appendChild(doc.createTextNode(String.valueOf(can.getAlbum())));
				cancion.appendChild(album);
				Element artista = doc.createElement("artista");
				artista.appendChild(doc.createTextNode(String.valueOf(can.getAuthor())));
				cancion.appendChild(artista);
				Element anyo = doc.createElement("any");
				anyo.appendChild(doc.createTextNode(String.valueOf(can.getYear())));
				cancion.appendChild(anyo);
			}
			TransformerFactory tranFactory = TransformerFactory.newInstance(); // Crear serialitzador
			Transformer aTransformer = tranFactory.newTransformer();
			aTransformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1"); // Formato al document
			aTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			aTransformer.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource source = new DOMSource(doc);
			try {
				FileWriter fw = new FileWriter("canciones2.xml"); // Definir el nom del fitxer i guardar
				StreamResult result = new StreamResult(fw);
				aTransformer.transform(source, result);
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (TransformerException ex) {
			System.out.println("Error escrivint el documento");
		} catch (ParserConfigurationException ex) {
			System.out.println("Error construint el document");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String r;
		List<Canciones> lista = new ArrayList<>();
		boolean pregunta = true;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canciones", "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM cancion");

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(new File("canciones.xml"));
			Element raiz = document.getDocumentElement();
			System.out.println("Contenido XML " + raiz.getNodeName() + ":");
			NodeList nodeList = document.getElementsByTagName("song");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				System.out.println("");
				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) node;
					int id = Integer.parseInt(eElement.getAttribute("id"));
					String t = eElement.getElementsByTagName("title").item(0).getTextContent();
					String alb = eElement.getElementsByTagName("album").item(0).getTextContent();
					String art = eElement.getElementsByTagName("author").item(0).getTextContent();
					int year = Integer.parseInt(eElement.getElementsByTagName("year").item(0).getTextContent());

					System.out.println("ID : " + eElement.getAttribute("id"));
					System.out.println("Título : " + eElement.getElementsByTagName("title").item(0).getTextContent());
					System.out.println("Álbum : " + eElement.getElementsByTagName("album").item(0).getTextContent());
					System.out.println("Artista : " + eElement.getElementsByTagName("author").item(0).getTextContent());
					System.out.println("Año : " + eElement.getElementsByTagName("year").item(0).getTextContent());

					Canciones c = new Canciones(id, t, alb, art, year);

					PreparedStatement psInsertar = con.prepareStatement("INSERT INTO cancion (titulo,album,autor,year) VALUES (?,?,?,?)");
					psInsertar.setString(1, c.getTitle());
					psInsertar.setString(2, c.getAlbum());
					psInsertar.setString(3, c.getAuthor());
					psInsertar.setInt(4, c.getYear());

					int resultadoInsertar = psInsertar.executeUpdate();

					lista.add(c);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		while (pregunta) {
			System.out.println("¿Desea añadir canciones a la lista?");
			r = sc.nextLine();
			if (r.toLowerCase().equals("si")) {
				pregunta = true;
				lista.add(addSong());
			} else if (r.toLowerCase().equals("no")) {
				pregunta = false;
			}
		}
		writeXmlFile(lista);

	}

}
