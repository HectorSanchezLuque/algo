package es.florida.Tema3;

public class ShowASCII implements Runnable {
	private String nombre;
	private int numHilo;

	public ShowASCII(String n, int num) {
		nombre = n;
		numHilo = num;
	}
	public void run() {
		String res;
		for (int i = 0; i < 254; i += 1) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i % 2 == 0 && numHilo == 1) {
				res = "Soy el hilo " + this.nombre;
				res += ", Carácter ASCII = " + (char) i;
				System.out.println(res);
			} else if (i % 2 != 0 && numHilo == 2) {
				res = "Soy el hilo " + this.nombre;
				res += ", Carácter ASCII = " + (char) i;
				System.out.println(res);
			}
		}

	}
}
