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

public class JdReportAlumnoMatCurso extends JDialog implements ActionListener {
	private JButton btnListar;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdReportAlumnoMatCurso dialog = new JdReportAlumnoMatCurso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdReportAlumnoMatCurso() {
		setTitle("ALUMNOS MATRICULADOS POR CURSO");
		setBounds(100, 100, 624, 592);
		getContentPane().setLayout(null);
		{
			btnListar = new JButton("Listar");
			btnListar.addActionListener(this);
			btnListar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnListar.setBounds(254, 10, 103, 28);
			getContentPane().add(btnListar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 48, 590, 497);
			getContentPane().add(scrollPane);
			
			txtResultado = new JTextArea();
			txtResultado.setFont(new Font("Monospaced", Font.BOLD, 13));
			scrollPane.setViewportView(txtResultado);
		}
	}
	
	//DECLARACION GLOBAL
	ArrayAlumno aa = new ArrayAlumno();
	ArrayCursos ac = new ArrayCursos();
	ArrayMatriculas am = new ArrayMatriculas();

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		txtResultado.setText("");
		for (int i = 0; i < ac.tama�o(); i++) {
			boolean x = false;
			imprimir(" " + ac.obtener(i).getAsignatura());
			imprimir("");
			int CodCurso = ac.obtener(i).getCodigo();
			for (int j = 0; j < am.tama�o(); j++) {
				Matricula m = am.obtener(j);
				if (m.getCodigoCurso() == CodCurso) {
					int estado = aa.buscar(m.getCodigoAlumno()).getEstado();
					if (estado == 1) {
						if (!x) x = true;
						imprimir(" * ALUMNO : " + aa.buscar(m.getCodigoAlumno()).getnombres() +
								" " + aa.buscar(m.getCodigoAlumno()).getApellidos());
					}
				}
			}
			if (!x) imprimir(" NO EXISTEN ALUMNOS MATRICULADOS EN ESTE CURSO");
			imprimir("-------------------------------------------------------------------------");
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
