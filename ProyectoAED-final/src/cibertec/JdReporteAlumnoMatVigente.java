package cibertec;

import array.*;
import modelo.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class JdReporteAlumnoMatVigente extends JDialog implements ActionListener {
	private JButton btnListar;
	private JScrollPane scrollPane;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdReporteAlumnoMatVigente dialog = new JdReporteAlumnoMatVigente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdReporteAlumnoMatVigente() {
		setTitle("ALUMNOS CON MATR\u00CDCULA VIGENTE");
		setBounds(100, 100, 624, 592);
		getContentPane().setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnListar.setBounds(254, 10, 103, 28);
		getContentPane().add(btnListar);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 48, 590, 497);
		getContentPane().add(scrollPane);
		
		txtResultado = new JTextArea();
		txtResultado.setFont(new Font("Monospaced", Font.BOLD, 13));
		scrollPane.setViewportView(txtResultado);
	}
	
	//DECLARACION GLOBAL
	ArrayAlumno aa = new ArrayAlumno();
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		txtResultado.setText("");
		for (int i = 0; i < aa.tama�o(); i++) {
			if (aa.obtener(i).getEstado() == 1) {
				imprimir(" C�DIGO    : " + aa.obtener(i).getalumno());
				imprimir(" NOMBRES   : " + aa.obtener(i).getnombres());
				imprimir(" APELLIDOS : " + aa.obtener(i).getApellidos());
				imprimir(" DNI       : " + aa.obtener(i).getDni());
				imprimir(" EDAD      : " + aa.obtener(i).getEdad());
				imprimir(" CELULAR   : " + aa.obtener(i).getCelular());
				imprimir(" ESTADO    : " + nombreEstado(aa.obtener(i).getEstado()));
				imprimir("-------------------------------------------------------------------------");
			}
		}
	}
	
	String nombreEstado(int i) {
		switch (i) {
		case 0: return "REGISTRADO";
		case 1: return "MATRICULADO";
		case 2: return "RETIRADO";
		default: return null;
		}
	}
	
	void imprimir(String s) {
		txtResultado.append(s + "\n");
	}
}
