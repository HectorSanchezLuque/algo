package es.florida.AEV1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class Lanzadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lanzadora frame = new Lanzadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lanzadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSpinner spnCroquetasJamon = new JSpinner();
		spnCroquetasJamon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spnCroquetasJamon.setBounds(56, 128, 54, 32);
		contentPane.add(spnCroquetasJamon);

		JLabel lblCroquetas = new JLabel("Seleccione las croquetas que desee");
		lblCroquetas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCroquetas.setBounds(103, 22, 325, 23);
		contentPane.add(lblCroquetas);

		JLabel lblNewLabel = new JLabel("Jamón");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(56, 92, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblPollo = new JLabel("Pollo");
		lblPollo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPollo.setBounds(166, 92, 46, 14);
		contentPane.add(lblPollo);

		JSpinner spnCroquetasPollo = new JSpinner();
		spnCroquetasPollo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spnCroquetasPollo.setBounds(158, 128, 54, 32);
		contentPane.add(spnCroquetasPollo);

		JLabel lblBacalao = new JLabel("Bacalao");
		lblBacalao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBacalao.setBounds(281, 92, 59, 14);
		contentPane.add(lblBacalao);

		JSpinner spnCroquetasBacalao = new JSpinner();
		spnCroquetasBacalao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spnCroquetasBacalao.setBounds(281, 128, 54, 32);
		contentPane.add(spnCroquetasBacalao);

		JLabel lblQueso = new JLabel("Queso");
		lblQueso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQueso.setBounds(390, 87, 54, 25);
		contentPane.add(lblQueso);

		JSpinner spnCroquetasQueso = new JSpinner();
		spnCroquetasQueso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spnCroquetasQueso.setBounds(390, 128, 54, 32);
		contentPane.add(spnCroquetasQueso);

		JButton btnComenzar = new JButton("Croquetear");
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total[] = { (int) spnCroquetasJamon.getValue(), (int) spnCroquetasPollo.getValue(),
						(int) spnCroquetasBacalao.getValue(), (int) spnCroquetasQueso.getValue() };
				Procesadora op;
				for (int i = 0; i < total.length; i++) {
					int num = total[i];
					for (int j = 0; j < num; j++) {
						op = new Procesadora(i);
						Thread hilo = new Thread(op);
						hilo.start();
					}
				}
			};
		});
		btnComenzar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnComenzar.setBounds(181, 211, 131, 32);
		contentPane.add(btnComenzar);
	}
}
