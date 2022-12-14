package es.florida.AEV1;

import java.awt.EventQueue;

public class Procesadora implements Runnable {

	private int tipo;
	int hilosEjecutados = 0;

	public Procesadora(int t) {
		tipo = t;
	}

	public void run() {

		while (hilosEjecutados == 100) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		switch (tipo) {
		case 0: {
			try {
				hilosEjecutados += 1;
				Thread.sleep(5000);
				System.out.println("Croqueta de jamón hecha");
				hilosEjecutados -= 1;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		case 1: {
			try {
				hilosEjecutados += 1;
				Thread.sleep(6000);
				System.out.println("Croqueta de pollo hecha");
				hilosEjecutados -= 1;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		case 2: {
			try {
				hilosEjecutados += 1;
				Thread.sleep(7000);
				System.out.println("Croqueta de bacalao hecha");
				hilosEjecutados -= 1;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		case 3: {
			try {
				hilosEjecutados += 1;
				Thread.sleep(8000);
				System.out.println("Croqueta de queso hecha");
				hilosEjecutados -= 1;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		}
	}

	public static void main(String[] args) {
		int[] total = { Integer.parseInt(args[0]), Integer.parseInt(args[1]),
				Integer.parseInt(args[2], Integer.parseInt(args[3])) };
		Procesadora op;
		for (int i = 0; i < total.length; i++) {
			int num = total[i];
			for (int j = 0; j < num; j++) {
				op = new Procesadora(i);
				Thread hilo = new Thread(op);
				hilo.start();
			}
		}

	}

}
