package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JdReporteAMP extends JDialog {
	private JButton btnReporteAMP;
	private JTextArea txtAreaAMP;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdReporteAMP dialog = new JdReporteAMP();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdReporteAMP() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btnReporteAMP = new JButton("Listar");
		btnReporteAMP.setBounds(164, 11, 89, 23);
		getContentPane().add(btnReporteAMP);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 414, 207);
		getContentPane().add(scrollPane);
		
		txtAreaAMP = new JTextArea();
		scrollPane.setViewportView(txtAreaAMP);
	}
}
