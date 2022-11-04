package es.florida.Tema3;

public class Ej1Sec {

	public static void main(String[] args) {
		int NUM_HILOS = 500;
		ShowASCII op;
		for (int i = 0; i < NUM_HILOS; i++) {
			op = new ShowASCII("Op. " + i, i);
			Thread hilo = new Thread(op);
			hilo.start();
		}
		

	}
}
