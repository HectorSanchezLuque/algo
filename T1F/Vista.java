package es.florida.T1F;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscar;
	private JTextField txtContar;
	JButton btnBuscar;
	JButton btnReemplazar;
	JTextPane txt1;
	JTextPane txt2;
	private JTextField txtReemplazar;
	
	
	

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public JPanel getContentPane() {
		return contentPane;
	}




	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}




	public JTextField getTxtBuscar() {
		return txtBuscar;
	}




	public void setTxtBuscar(JTextField txtBuscar) {
		this.txtBuscar = txtBuscar;
	}




	public JTextField getTxtReemplazar() {
		return txtContar;
	}




	public void setTxtReemplazar(JTextField txtReemplazar) {
		this.txtContar = txtReemplazar;
	}




	public JButton getBtnBuscar() {
		return btnBuscar;
	}




	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}




	public JButton getBtnReemplazar() {
		return btnReemplazar;
	}




	public void setBtnReemplazar(JButton btnReemplazar) {
		this.btnReemplazar = btnReemplazar;
	}

	public JTextPane getTxt1() {
		return txt1;
	}




	public void setTxt1(JTextPane txt1) {
		this.txt1 = txt1;
	}




	public JTextPane getTxt2() {
		return txt2;
	}




	public void setTxt2(JTextPane txt2) {
		this.txt2 = txt2;
	}


	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextPane();
		txt1.setBounds(10, 11, 764, 193);
		contentPane.add(txt1);
		
		txt2 = new JTextPane();
		txt2.setBounds(10, 292, 764, 193);
		contentPane.add(txt2);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(10, 242, 123, 20);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		txtContar = new JTextField();
		txtContar.setColumns(10);
		txtContar.setBounds(257, 242, 146, 20);
		contentPane.add(txtContar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(143, 241, 89, 23);
		contentPane.add(btnBuscar);
		
		btnReemplazar = new JButton("Reemplazar");
		btnReemplazar.setBounds(685, 241, 89, 23);
		contentPane.add(btnReemplazar);
		
		txtReemplazar = new JTextField();
		txtReemplazar.setColumns(10);
		txtReemplazar.setBounds(529, 242, 146, 20);
		contentPane.add(txtReemplazar);
		
		JButton btnContar = new JButton("Contar");
		btnContar.setBounds(413, 241, 89, 23);
		contentPane.add(btnContar);
		
		this.setVisible(true);
	}
}
