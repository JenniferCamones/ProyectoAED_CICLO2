package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class JdReporteAMC extends JDialog {
	private JButton btnAMC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdReporteAMC dialog = new JdReporteAMC();
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
	public JdReporteAMC() {
		setBounds(180, 100, 513, 373);
		getContentPane().setLayout(null);
		
		btnAMC = new JButton("Listar");
		btnAMC.setBounds(191, 11, 89, 23);
		getContentPane().add(btnAMC);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 55, 32463, 32305);
		getContentPane().add(scrollPane);

	}
}
