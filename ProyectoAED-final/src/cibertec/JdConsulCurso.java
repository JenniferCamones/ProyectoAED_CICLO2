package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JdConsulCurso extends JDialog {
	private JTextPane txtJtexAreaResultado;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdConsulCurso dialog = new JdConsulCurso();
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
	public JdConsulCurso() {
		setBounds(180, 100, 553, 373);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 93, 517, 231);
		getContentPane().add(scrollPane);
		
		txtJtexAreaResultado = new JTextPane();
		scrollPane.setViewportView(txtJtexAreaResultado);
		
		lblNewLabel = new JLabel("Codigo de Curso :");
		lblNewLabel.setBounds(10, 33, 108, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(128, 30, 132, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(438, 29, 89, 23);
		getContentPane().add(btnConsultar);

	}

}
