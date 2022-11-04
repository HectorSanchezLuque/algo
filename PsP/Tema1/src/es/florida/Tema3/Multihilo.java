package es.florida.Tema3;

public class Multihilo implements Runnable {
	int entradasDisponibles = 100;
	static int entradasVendidas = 0;

	synchronized public void reservaEntrada(String nombre, int entradas) {
		if (entradas <= entradasDisponibles) {
			System.out.println(entradas + " reservadas para " + nombre);
			entradasDisponibles = entradasDisponibles - entradas;
			entradasVendidas = entradasVendidas + entradas;
		} else {
			System.out.println("No quedan entradas");
		}
	}

	public void run() {
		String nombre = Thread.currentThread().getName();
		int entradas = (int) (Math.random() * 10 + 1);
		reservaEntrada(nombre, entradas);
	}
}
