package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JdConsulMatricula extends JDialog {
	private JScrollPane scrollPane;
	private JTextPane txtJtexAreaResultado;
	private JTextField textField;
	private JButton btnConsultar;
	private JLabel lblNumeroMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdConsulMatricula dialog = new JdConsulMatricula();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public JdConsulMatricula() {
		setBounds(180, 100, 553, 373);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 517, 238);
		getContentPane().add(scrollPane);
		
		txtJtexAreaResultado = new JTextPane();
		scrollPane.setViewportView(txtJtexAreaResultado);
		
		lblNumeroMatricula = new JLabel("N\u00FAmerode matr\u00EDcula :");
		lblNumeroMatricula.setBounds(10, 33, 129, 14);
		getContentPane().add(lblNumeroMatricula);
		
		textField = new JTextField();
		textField.setBounds(149, 30, 114, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(438, 29, 89, 23);
		getContentPane().add(btnConsultar);

	}
}
