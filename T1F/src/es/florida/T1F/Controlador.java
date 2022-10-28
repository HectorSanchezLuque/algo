package es.florida.T1F;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.io.File;

public class Controlador {
	private Vista vista;
	private Modelo modelo;

	public Controlador(Vista vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		initEventHandlers();
	}

	private void initEventHandlers() {
		vista.getBtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File f = new File(vista.getTxtBuscar().getText());
				vista.getTxt1().setText(modelo.leerFich(f));
			}
		});
		
	}
}
