package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import array.*;
import modelo.*;

public class JdConsulMatricula extends JDialog implements ActionListener {
	private JScrollPane scrollPane;
	private JButton btnConsultar;
	private JLabel lblNumeroMatricula;
	private JTextArea txtResultado;
	private JComboBox cboCodigo;

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
		
		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
		
		lblNumeroMatricula = new JLabel("N\u00FAmerode matr\u00EDcula :");
		lblNumeroMatricula.setBounds(10, 33, 129, 14);
		getContentPane().add(lblNumeroMatricula);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(438, 29, 89, 23);
		getContentPane().add(btnConsultar);
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(149, 30, 129, 21);
		getContentPane().add(cboCodigo);
		
		listarCboCodigo();

	}
	
	//declaraciones intento
	
	ArrayAlumno aa = new ArrayAlumno();
	ArrayCursos ac = new ArrayCursos();
	ArrayMatriculas am = new ArrayMatriculas();
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(e);
		}
		
	}
	
	protected void actionPerformedBtnConsultar(ActionEvent e) {
		try {
			txtResultado.setText("");
			listar();
			cboCodigo.requestFocus();
		}
		catch (Exception error) {
			imprimir("Seleccione un número de matrícula");
		}
	}
	
	void imprimir(){
		imprimir("");
	}
	//metodo Listar
	void listar() {
		Matricula m = am.buscar(leerCodigo());
		Alumno x = aa.buscar(m.getCodigoAlumno());
		Curso c = ac.buscar(m.getCodigoCurso());
		imprimir("CÓDIGO        : " + m.getNumeroMatricula());
		switch(x.getEstado()) {
		case 0: imprimir("ESTADO        : REGISTRADO");break;
		case 1: imprimir("ESTADO        : MATRICULADO");break;
		default:imprimir("ESTADO        : RETIRADO");
		}
		imprimir("");
		imprimir("COD. ALUMNO   : " + x.getalumno());
		imprimir("NOMBRES       : " + x.getnombres());
		imprimir("APELLIDOS     : " + x.getApellidos());
		imprimir("DNI           : " + x.getDni());
		imprimir("EDAD          : " + x.getEdad());
		imprimir("CELULAR       : " + x.getCelular());
		imprimir("");
		imprimir("COD. CURSO    : " + c.getCodigo());
		imprimir("ASIGNATURA    : " + c.getAsignatura());
		imprimir("CICLO         : " + nombreCiclo(c.getCiclo()));
		imprimir("CRÉDITOS      : " + c.getNumeroCredito());
		imprimir("HORAS         : " + c.getCamtidadHora());
	}
	void listarCboCodigo() {
		cboCodigo.removeAllItems();
		for (int i = 0; i < am.tamaño(); i++) {
			cboCodigo.addItem(am.obtener(i).getNumeroMatricula());
		}
		cboCodigo.setSelectedIndex(-1);
	}
	String nombreCiclo(int i) {
		switch (i) {
			case 0: return "PRIMERO";
			case 1: return "SEGUNDO";
			case 2: return "TERCERO";
			case 3: return "CUARTO";
			case 4: return "QUINTO";
			case 5: return "SEXTO";
			default:return null;
		}
	}
	void imprimir(String s){
		txtResultado.append(s + "\n"); 
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	public int leerCodigo() {
		return Integer.parseInt(cboCodigo.getSelectedItem().toString());
	}

	
}
