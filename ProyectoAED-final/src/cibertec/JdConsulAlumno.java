package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JdConsulAlumno extends JDialog {
	private JLabel lblCodigoAlumno;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextPane txtJtexAreaResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdConsulAlumno dialog = new JdConsulAlumno();
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
	public JdConsulAlumno() {
		setBounds(180, 100, 553, 373);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 85, 517, 239);
		getContentPane().add(scrollPane);
		
		txtJtexAreaResultado = new JTextPane();
		scrollPane.setViewportView(txtJtexAreaResultado);
		
		lblCodigoAlumno = new JLabel("Codigo de Alumno :");
		lblCodigoAlumno.setBounds(10, 29, 115, 14);
		getContentPane().add(lblCodigoAlumno);
		
		textField = new JTextField();
		textField.setBounds(135, 26, 120, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Consultar");
		btnNewButton.setBounds(438, 25, 89, 23);
		getContentPane().add(btnNewButton);

	}
}
