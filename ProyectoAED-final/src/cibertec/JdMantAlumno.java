package cibertec;
import modelo.*;
import array.*;
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
import javax.swing.JComboBox;


public class JdMantAlumno extends JDialog {
	private JButton btnAdicionarAlumno;
	private JButton btnAceptar;
	private JButton btnModificarAlumno;
	private JButton btnEliminarAlumno;
	private JButton btnCancelar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JLabel lblCodigo;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblDNI;
	private JLabel lblCelular;
	private JLabel lblEstados;
	private JLabel lblEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdMantAlumno dialog = new JdMantAlumno();
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
	public JdMantAlumno() {
		setTitle("Alumno");
		setBounds(180, 100, 537, 467);
		getContentPane().setLayout(null);
		
		btnAdicionarAlumno = new JButton("Adicionar");
		btnAdicionarAlumno.setBounds(408, 11, 89, 23);
		getContentPane().add(btnAdicionarAlumno);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(27, 254, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnModificarAlumno = new JButton("Modificar");
		btnModificarAlumno.setBounds(408, 58, 89, 23);
		getContentPane().add(btnModificarAlumno);
		
		btnEliminarAlumno = new JButton("Eliminar");
		btnEliminarAlumno.setBounds(408, 102, 89, 23);
		getContentPane().add(btnEliminarAlumno);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(147, 254, 89, 23);
		getContentPane().add(btnCancelar);
		
		lblCodigo = new JLabel("Codigo :");
		lblCodigo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblCodigo);
		
		lblNombres = new JLabel("Nombres :");
		lblNombres.setBounds(10, 49, 57, 14);
		getContentPane().add(lblNombres);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(10, 88, 46, 14);
		getContentPane().add(lblApellidos);
		
		lblDNI = new JLabel("DNI :");
		lblDNI.setBounds(10, 129, 46, 14);
		getContentPane().add(lblDNI);
		
		lblCelular = new JLabel("Celular :");
		lblCelular.setBounds(10, 165, 46, 14);
		getContentPane().add(lblCelular);
		
		lblEstados = new JLabel("Estados");
		lblEstados.setBounds(10, 205, 57, 14);
		getContentPane().add(lblEstados);
		
		lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(199, 129, 37, 14);
		getContentPane().add(lblEdad);
		
		textField = new JTextField();
		textField.setBounds(76, 46, 249, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 85, 249, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 126, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 162, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(239, 126, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(76, 11, 211, 22);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(77, 197, 210, 22);
		getContentPane().add(comboBox_1);

	}
}
