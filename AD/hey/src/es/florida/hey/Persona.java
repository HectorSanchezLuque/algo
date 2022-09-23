package es.florida.hey;

public class Persona {

	String nom;
	String cognom;
	int edat;

	Persona(String n, String c, int e) {
		this.nom = n;
		this.cognom = c;
		this.edat = e;
	}

	public Persona() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", edat=" + edat + "]";
	}

	
}
