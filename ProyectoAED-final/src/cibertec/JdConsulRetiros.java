package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import array.*;
import modelo.*;

public class JdConsulRetiros extends JDialog implements ActionListener {
	private JScrollPane scrollPane;
	private JButton btnConsultar;
	private JLabel lblNumeroRetiro;
	private JTextArea txtResultado;
	private JComboBox cboCodigo;

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
		
		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(438, 29, 89, 23);
		getContentPane().add(btnConsultar);
		
		lblNumeroRetiro = new JLabel("N\u00FAmero de Retiro :");
		lblNumeroRetiro.setBounds(10, 33, 108, 14);
		getContentPane().add(lblNumeroRetiro);
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(135, 30, 115, 21);
		getContentPane().add(cboCodigo);
		listarCboCodigo();

	}
	
	//declaraciones intento
	    ArrayAlumno aa = new ArrayAlumno();
		ArrayCursos ac = new ArrayCursos();
		ArrayMatriculas am = new ArrayMatriculas();
		ArrayRetiro ar = new ArrayRetiro();
	
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
			mensaje("Seleccione un número de retiro");
		}
	}
		
	void imprimir(){
		imprimir("");
	}
	//metodo Listar
	void listar() {
		Retiro r = ar.buscar(leerCodigo());
		Matricula m = am.buscar(r.getNumeroMatricula());
		Alumno x = aa.buscar(m.getCodigoAlumno());
		Curso c = ac.buscar(m.getCodigoCurso());
		imprimir("CÓDIGO         : " + r.getNumeroRetiro());
		imprimir("NUM. MATRÍCULA : " + m.getNumeroMatricula());
		imprimir("");
		imprimir("COD. ALUMNO    : " + x.getalumno());
		imprimir("NOMBRES        : " + x.getnombres());
		imprimir("APELLIDOS      : " + x.getApellidos());
		imprimir("DNI            : " + x.getDni());
		imprimir("EDAD           : " + x.getEdad());
		imprimir("CELULAR        : " + x.getCelular());
		imprimir("");
		imprimir("COD. CURSO     : " + c.getAsignatura());
		imprimir("CICLO          : " + nombreCiclo(c.getCiclo()));
		imprimir("CRÉDITOS       : " + c.getNumeroCredito());
		imprimir("HORAS          : " + c.getCamtidadHora());
	}
	void listarCboCodigo() {
		cboCodigo.removeAllItems();
		for (int i = 0; i < ar.tamaño(); i++) {
			cboCodigo.addItem(ar.obtener(i).getNumeroRetiro());
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
