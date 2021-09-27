
/*
 * 
 * Comentario para la prueba de github
 */

package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JMenu;

public class Alumno extends JDialog {
	private JButton btnAdicionarAlumno;
	private JButton btnConsultarAlumno;
	private JButton btnModificarAlumno;
	private JButton btnEliminarAlumno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alumno dialog = new Alumno();
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
	public Alumno() {
		setTitle("Alumno");
		setBounds(180, 100, 537, 246);
		getContentPane().setLayout(null);
		
		btnAdicionarAlumno = new JButton("Adicionar");
		btnAdicionarAlumno.setBounds(10, 11, 89, 23);
		getContentPane().add(btnAdicionarAlumno);
		
		btnConsultarAlumno = new JButton("Consultar");
		btnConsultarAlumno.setBounds(109, 11, 89, 23);
		getContentPane().add(btnConsultarAlumno);
		
		btnModificarAlumno = new JButton("Modificar");
		btnModificarAlumno.setBounds(211, 11, 89, 23);
		getContentPane().add(btnModificarAlumno);
		
		btnEliminarAlumno = new JButton("Eliminar");
		btnEliminarAlumno.setBounds(310, 11, 89, 23);
		getContentPane().add(btnEliminarAlumno);

	}
}
