package es.florida.Tema3;

public class Contador implements Runnable {
	private String nombreHilo;
	private int inicioContador;
	private int limiteContador;
	
	public Contador (String nom, int in, int li) {
		nombreHilo = nom;
		inicioContador = in;
		limiteContador = li;
	}
	
	public void run() {
		String res;
		for (int i = inicioContador; i <= limiteContador; i += 1) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			res = "Soy el hilo " + this.nombreHilo;
			res += ", Número = " + i;
			System.out.println(res);
			
		}

	}
}
