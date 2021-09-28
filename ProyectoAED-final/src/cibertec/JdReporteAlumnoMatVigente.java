package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JdReporteAlumnoMatVigente extends JDialog {
	private JButton btnReporteAMV;
	private JTextArea txtAreaAMV;
	private JScrollPane scrollPane;

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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			btnReporteAMV = new JButton("Listar");
			btnReporteAMV.setBounds(153, 11, 89, 23);
			getContentPane().add(btnReporteAMV);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 49, 414, 201);
			getContentPane().add(scrollPane);
			
			txtAreaAMV = new JTextArea();
			scrollPane.setViewportView(txtAreaAMV);
		}
	}
}
