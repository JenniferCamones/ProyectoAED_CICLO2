package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;

public class Curso extends JDialog {
	private JButton btnConsultarCurso;
	private JButton btnAdicionarCurso;
	private JButton btnModificarCurso;
	private JButton btnEliminarCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Curso dialog = new Curso();
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
	public Curso() {
		setTitle("Curso");
		setBounds(180, 100, 494, 223);
		getContentPane().setLayout(null);
		
		btnAdicionarCurso = new JButton("Adicionar");
		btnAdicionarCurso.setBounds(10, 11, 89, 23);
		getContentPane().add(btnAdicionarCurso);
		
		btnConsultarCurso = new JButton("Consultar");
		btnConsultarCurso.setBounds(122, 11, 89, 23);
		getContentPane().add(btnConsultarCurso);
		
		btnModificarCurso = new JButton("Modificar");
		btnModificarCurso.setBounds(233, 11, 89, 23);
		getContentPane().add(btnModificarCurso);
		
		btnEliminarCurso = new JButton("Eliminar");
		btnEliminarCurso.setBounds(344, 11, 89, 23);
		getContentPane().add(btnEliminarCurso);

	}

}
