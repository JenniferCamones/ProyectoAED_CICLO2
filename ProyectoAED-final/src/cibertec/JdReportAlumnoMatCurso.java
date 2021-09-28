package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;

//Prueba de Aron
//no
//iefioewhnfoi
public class JdReportAlumnoMatCurso extends JDialog {
	private JTextField txtAreaAMC;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdReportAlumnoMatCurso dialog = new JdReportAlumnoMatCurso();
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
	public JdReportAlumnoMatCurso() {
		getContentPane().setLayout(null);
		
		JButton btnReporteAMC = new JButton("Listar");
		btnReporteAMC.setBounds(146, 11, 89, 23);
		getContentPane().add(btnReporteAMC);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 51, 414, 199);
		getContentPane().add(scrollPane);
		
		txtAreaAMC = new JTextField();
		scrollPane.setViewportView(txtAreaAMC);
		txtAreaAMC.setColumns(10);

	}
}
