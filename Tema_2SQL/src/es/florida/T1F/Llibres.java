package es.florida.T1F;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Llibres {
	private String titol;
	private String autor;
	private int anyNac;
	private int anyPubl;
	private String editorial;
	private int nPagines;

	public String getTitol() {
		return titol;
	}

	public void setTitol(String titol) {
		this.titol = titol;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnyNac() {
		return anyNac;
	}

	public void setAnyNac(int anyNac) {
		this.anyNac = anyNac;
	}

	public int getAnyPubl() {
		return anyPubl;
	}

	public void setAnyPubl(int anyPubl) {
		this.anyPubl = anyPubl;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getnPagines() {
		return nPagines;
	}

	public void setnPagines(int nPagines) {
		this.nPagines = nPagines;
	}

	public Llibres(String t, String a, int aN, int aP, String e, int nP) {
		titol = t;
		autor = a;
		anyNac = aN;
		anyPubl = aP;
		editorial = e;
		nPagines = nP;
	}

	public Llibres() {

	}

	public void addLlibre() throws SQLException {
		Llibres l = new Llibres();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
		Statement stmt = con.createStatement();
		PreparedStatement psInsertar = con.prepareStatement(
				"INSERT INTO llibres (titol,autor,anyNac, anyPubl, editorial, nPagines) VALUES (?,?,?,?,?,?)");
		psInsertar.setString(1, l.getTitol());
		psInsertar.setString(2, l.getAutor());
		psInsertar.setInt(3, l.getAnyNac());
		psInsertar.setInt(4, l.getAnyPubl());
		psInsertar.setString(5, l.getEditorial());
		psInsertar.setInt(6, l.getnPagines());

		int resultadoInsertar = psInsertar.executeUpdate();
	}

	@SuppressWarnings("null")
	public static void convertCSV() throws IOException, SQLException {

		BufferedReader input = new BufferedReader(
				new FileReader(new File("C:\\Users\\hesalu\\Desktop\\Exercicis_T2_MySQL_Dades.csv")));
		try {
			String line = null;
			String[] contingut = null;

			while ((line = input.readLine()) != null) {
				contingut = line.split(";");
				if (contingut[0].equals("Titol")) {

				} else {

					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
					Statement stmt = con.createStatement();
					PreparedStatement psInsertar = con.prepareStatement(
							"INSERT INTO llibres (titol,autor,anyNac, anyPubl, editorial, nPagines) VALUES (?,?,?,?,?,?)");
					psInsertar.setString(1, contingut[0]);
					psInsertar.setString(2, contingut[1]);
					if (contingut[2].equals("")) {
						psInsertar.setInt(3, 0);
					} else {
						psInsertar.setInt(3, Integer.parseInt(contingut[2]));
					}
					psInsertar.setInt(4, Integer.parseInt(contingut[3]));
					psInsertar.setString(5, contingut[4]);
					psInsertar.setInt(6, Integer.parseInt(contingut[5]));

					int resultadoInsertar = psInsertar.executeUpdate();
				}
			}
		} finally

		{
			input.close();
		}
	}
}
