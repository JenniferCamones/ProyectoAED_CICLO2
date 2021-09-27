package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class JdReporteAMC extends JDialog {

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
		setBounds(180, 100, 553, 373);

	}

}
