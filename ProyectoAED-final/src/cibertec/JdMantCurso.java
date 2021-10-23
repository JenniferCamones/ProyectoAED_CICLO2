package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class JdMantCurso extends JDialog {
	private JButton btnAdicionarCurso;
	private JButton btnModificarCurso;
	private JButton btnEliminarCurso;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblCodigo;
	private JLabel lblAsignatura;
	private JLabel lblCiclo;
	private JLabel lblNCredito;
	private JLabel lblHora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdMantCurso dialog = new JdMantCurso();
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
	public JdMantCurso() {
		setTitle("Curso");
		setBounds(180, 100, 578, 322);
		getContentPane().setLayout(null);
		
		btnAdicionarCurso = new JButton("Adicionar");
		btnAdicionarCurso.setBounds(436, 11, 89, 23);
		getContentPane().add(btnAdicionarCurso);
		
		btnModificarCurso = new JButton("Modificar");
		btnModificarCurso.setBounds(436, 65, 89, 23);
		getContentPane().add(btnModificarCurso);
		
		btnEliminarCurso = new JButton("Eliminar");
		btnEliminarCurso.setBounds(436, 121, 89, 23);
		getContentPane().add(btnEliminarCurso);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(70, 172, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(219, 172, 89, 23);
		getContentPane().add(btnCancelar);
		
		lblCodigo = new JLabel("Codigo :");
		lblCodigo.setBounds(10, 11, 61, 14);
		getContentPane().add(lblCodigo);
		
		lblAsignatura = new JLabel("Asignatura :");
		lblAsignatura.setBounds(10, 47, 68, 14);
		getContentPane().add(lblAsignatura);
		
		lblHora = new JLabel("Camtidad de Hora :");
		lblHora.setBounds(182, 125, 126, 14);
		getContentPane().add(lblHora);
		
		lblCiclo = new JLabel("Ciclo :");
		lblCiclo.setBounds(10, 85, 46, 14);
		getContentPane().add(lblCiclo);
		
		lblNCredito = new JLabel("N\u00B0Credito :");
		lblNCredito.setBounds(10, 125, 61, 14);
		getContentPane().add(lblNCredito);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(81, 81, 177, 22);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(81, 7, 177, 22);
		getContentPane().add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(81, 39, 257, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 122, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(318, 122, 61, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

	}
}
