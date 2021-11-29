package cibertec;

import java.awt.EventQueue;
import java.awt.Font;

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

public class JdConsulCurso extends JDialog implements ActionListener {
	private JLabel lblNewLabel;
	private JButton btnConsultar;
	private JComboBox cboCodigo;
	private JScrollPane scrollPane;
	private JTextArea txtResultado;

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
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 93, 517, 231);
		getContentPane().add(scrollPane);
		
		txtResultado = new JTextArea();
		txtResultado.setFont(new Font("Monospaced", Font.BOLD, 13));
		scrollPane.setViewportView(txtResultado);
		
		lblNewLabel = new JLabel("Codigo de Curso :");
		lblNewLabel.setBounds(10, 33, 108, 14);
		getContentPane().add(lblNewLabel);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(438, 29, 89, 23);
		getContentPane().add(btnConsultar);
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(128, 30, 122, 21);
		getContentPane().add(cboCodigo);
		
		listarCboCodigo();

	}
	
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
		} catch (Exception error) {
			mensaje("Seleccione un código de curso");
		}
	}
	
	//Métodos tipo void (sin parámetros)
	void imprimir(){
		imprimir("");
	}
	
	void listar(){
		Curso c = ac.buscar(leerCurso());
		imprimir("CÓDIGO               : " + c.getCodigo());
		imprimir("ASIGNATURA           : " + c.getAsignatura());
		imprimir("CICLO                : " + nombreCiclo(c.getCiclo()));
		imprimir("CANTIDAD DE CRÉDITOS : " + c.getNumeroCredito());
		imprimir("CANTIDAD DE HORAS    : " + c.getCamtidadHora());
		imprimir();
		int x = 0;
		for (int i = 0; i < am.tamaño(); i++) {
			if (am.obtener(i).getCodigoCurso() == c.getCodigo())
				x++;
		}
		if (x == 0) imprimir("NO HAY ALUMNOS MATRICULADOS");
		else if (x == 1) imprimir("HAY " + x + " ALUMNO MATRICULADO");
		else imprimir("HAY " + x + " ALUMNOS MATRICULADOS");
	}
	void listarCboCodigo() {
		cboCodigo.removeAllItems();
		for (int i = 0; i < ac.tamaño(); i++) {
			cboCodigo.addItem(ac.obtener(i).getCodigo());
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
//  Métodos tipo void 
	void imprimir(String s){
		txtResultado.append(s + "\n"); 
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	//otros metodos
	public int leerCurso() {
		return Integer.parseInt(cboCodigo.getSelectedItem().toString());
	}

}
