package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class JdConsulRetiros extends JDialog {
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextPane txtJtexAreaResultado;
	private JButton btnConsultar;
	private JLabel lblNumeroRetiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdConsulRetiros dialog = new JdConsulRetiros();
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
	public JdConsulRetiros() {
		setBounds(180, 100, 553, 373);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 517, 238);
		getContentPane().add(scrollPane);
		
		txtJtexAreaResultado = new JTextPane();
		scrollPane.setViewportView(txtJtexAreaResultado);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(438, 29, 89, 23);
		getContentPane().add(btnConsultar);
		
		lblNumeroRetiro = new JLabel("N\u00FAmero de Retiro :");
		lblNumeroRetiro.setBounds(10, 33, 108, 14);
		getContentPane().add(lblNumeroRetiro);
		
		textField = new JTextField();
		textField.setBounds(128, 30, 113, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

	}

}
