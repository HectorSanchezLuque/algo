package es.florida.AEV1;

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
					hilosEjecutados +=1;
					Thread.sleep(5000);
					System.out.println("Croqueta de jamón hecha");
					hilosEjecutados -=1;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			case 1: {
				try {
					hilosEjecutados +=1;
					Thread.sleep(6000);
					System.out.println("Croqueta de pollo hecha");
					hilosEjecutados -=1;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			case 2: {
				try {
					hilosEjecutados +=1;
					Thread.sleep(7000);
					System.out.println("Croqueta de bacalao hecha");
					hilosEjecutados -=1;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			case 3: {
				try {
					hilosEjecutados +=1;
					Thread.sleep(8000);
					System.out.println("Croqueta de queso hecha");
					hilosEjecutados -=1;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			}
		

	}

}
