package es.florida.Tema3;

public class Caracol implements Runnable {
	private String nombre;
	private double velocidad;
	
	public Caracol (String n, double v) {
		nombre = n;
		velocidad = v;
	}
	
	public void run() {
		String res;
		double i = 0;
		do {
			i += velocidad;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i > 1000) {
				i = 1000;
			}
			res = "Soy el caracol " + this.nombre;
			res += ", Porcentaje completado = " + i/10 + "%";
			System.out.println(res);
			
		} while (i < 1000);
	}
}
