package es.florida.Tema2;

public class Matrix {

	String nombreNeo;
	int posicionNEO;
	int velocidadNEO;
	double colision;
	
	public Matrix(String n, int p, int v) {
		nombreNeo = n;
		posicionNEO = p;
		velocidadNEO = v;
	}
	
	public String getNombreNeo() {
		return nombreNeo;
	}


	public void setNombreNeo(String nombreNeo) {
		this.nombreNeo = nombreNeo;
	}


	public int getPosicionNEO() {
		return posicionNEO;
	}


	public void setPosicionNEO(int posicionNEO) {
		this.posicionNEO = posicionNEO;
	}


	public int getVelocidadNEO() {
		return velocidadNEO;
	}


	public void setVelocidadNEO(int velocidadNEO) {
		this.velocidadNEO = velocidadNEO;
	}

	public double getColision() {
		return colision;
	}

	public void setColision(double colision) {
		this.colision = colision;
	}

	
	public double calcColision() {
		double posicionTierra = 1;
		double velocidadTierra = 100;
		for (int i = 0; i < (50 * 365 * 24 * 60 * 60); i++) {
		posicionNEO = posicionNEO + velocidadNEO * i;
		posicionTierra = posicionTierra + velocidadTierra * i;
		}
		double resultado = 100 * Math.random() * Math.pow(((posicionNEO-posicionTierra)/(posicionNEO+posicionTierra)), 2);
		return resultado;
	}
	
}
