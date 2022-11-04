package es.florida.Tema3;

public class Ej2Sec {

	public static void main(String[] args) {
		int NUM_HILOS = 5;
		Contador op;
		int limite = 10;
		int inicio = 1;
		for (int i = 0; i < NUM_HILOS; i++) {
			op = new Contador("Op. " + i, inicio, limite);
			Thread hilo = new Thread(op);
			hilo.start();
			
			limite += 1;
			inicio +=1;
		}

	}
}
