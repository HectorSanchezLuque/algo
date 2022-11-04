package es.florida.Tema3;

public class Ej3Sec {

	public static void main(String[] args) {
		int NUM_HILOS = 5;
		Caracol op;
		int[] velocidades = {14, 12, 13, 11, 15};
		Thread [] hilos = new Thread [5];
		for (int i = 0; i < NUM_HILOS; i++) {
			op = new Caracol(Integer.toString(i), velocidades[i]);
			Thread hilo = new Thread(op);
			hilo.start();
			hilos [i] = hilo;
		}
		hilos[2].setPriority(10);
		
	}
}
