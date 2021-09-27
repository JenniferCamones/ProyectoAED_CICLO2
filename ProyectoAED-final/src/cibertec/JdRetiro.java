package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class JdRetiro extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdRetiro dialog = new JdRetiro();
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
	public JdRetiro() {
		setBounds(180, 100, 553, 373);

	}

}
