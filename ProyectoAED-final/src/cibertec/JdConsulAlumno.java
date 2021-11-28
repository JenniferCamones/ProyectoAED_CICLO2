package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import array.*;

import modelo.*;
import javax.swing.JTextArea;

public class JdConsulAlumno extends JDialog implements ActionListener {
	private JLabel lblCodigoAlumno;
	private JButton btnConsultar;
	private JComboBox cboCodigo;

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
		
		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
		
		lblCodigoAlumno = new JLabel("Codigo de Alumno :");
		lblCodigoAlumno.setBounds(10, 29, 115, 14);
		getContentPane().add(lblCodigoAlumno);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(438, 25, 89, 23);
		btnConsultar.addActionListener(this);
		getContentPane().add(btnConsultar);
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(135, 26, 115, 21);
		getContentPane().add(cboCodigo);
		
		listarCboCodigo();

	}
	
	ArrayAlumno aa = new ArrayAlumno();
	ArrayCursos ac = new ArrayCursos();
	ArrayMatriculas am = new ArrayMatriculas();
	private JTextArea txtResultado;
	
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
			mensaje("Seleccione un código de alumno");
		}
	}
	//imprimir	
	void imprimir(){
		imprimir("");
	}
	
	
	//metodo Listar
	void listar() {
		Alumno x = aa.buscar(leerCodigo());
		imprimir("CÓDIGO               : " + x.getalumno());
		imprimir("NOMBRES              : " + x.getnombres());
		imprimir("APELLIDOS            : " + x.getApellidos());
		imprimir("DNI                  : " + x.getDni());
		imprimir("EDAD                 : " + x.getEdad());
		imprimir("CELULAR              : " + x.getCelular());
		imprimir("ESTADO               : " + nombreEstado(x.getEstado()));
		imprimir();
		if (x.getEstado() != 0) {
			Matricula m = am.buscarCod(leerCodigo());
			Curso c = ac.buscar(m.getCodigoCurso());
			imprimir("ASIGNATURA           : " + c.getAsignatura());
			imprimir("CICLO                : " + nombreCiclo(c.getCiclo()));
			imprimir("CANTIDAD DE CRÉDITOS : " + c.getNumeroCredito());
			imprimir("HORAS                : " + c.getCamtidadHora());
		}
	}
	
	void listarCboCodigo() {
		cboCodigo.removeAllItems();
		for (int i = 0; i < aa.tamaño(); i++) {
			cboCodigo.addItem(aa.obtener(i).getalumno());
		}
		cboCodigo.setSelectedIndex(-1);
	}
	String nombreEstado(int i) {
		switch (i) {
			case 0: return "REGISTRADO";
			case 1: return "MATRICULADO";
			case 2: return "RETIRADO";
			default:return null;
		}
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
	//otros metodos
	public int leerCodigo() {
		return Integer.parseInt(cboCodigo.getSelectedItem().toString());
	}
	
}
