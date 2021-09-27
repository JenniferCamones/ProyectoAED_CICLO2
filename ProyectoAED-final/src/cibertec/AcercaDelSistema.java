package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

public class AcercaDelSistema extends JDialog {
	private JLabel lblJenniferCarolayCamonesQuiroz;
	private JLabel lblAndreRicardoLozanoPalomino;
	private JLabel lblAaronJonasCalderonLozan;
	private JLabel lblAngeloJairAnguloCuaquira;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercaDelSistema dialog = new AcercaDelSistema();
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
	public AcercaDelSistema() {
		setTitle("Acerca del Sistema");
		setBounds(100, 100, 482, 204);
		getContentPane().setLayout(null);
		
		lblJenniferCarolayCamonesQuiroz = new JLabel("Jennifer Carolay Camones Quiroz");
		lblJenniferCarolayCamonesQuiroz.setBounds(131, 34, 256, 14);
		getContentPane().add(lblJenniferCarolayCamonesQuiroz);
		
		lblAndreRicardoLozanoPalomino = new JLabel("Andre Ricardo Lozano Palomino");
		lblAndreRicardoLozanoPalomino.setBounds(131, 59, 194, 14);
		getContentPane().add(lblAndreRicardoLozanoPalomino);
		
		lblAaronJonasCalderonLozan = new JLabel("Aaron Jonas Calderon Lozan");
		lblAaronJonasCalderonLozan.setForeground(Color.BLACK);
		lblAaronJonasCalderonLozan.setBounds(133, 84, 223, 14);
		getContentPane().add(lblAaronJonasCalderonLozan);
		
		lblAngeloJairAnguloCuaquira = new JLabel("Angelo Jair Angulo Cuaquira");
		lblAngeloJairAnguloCuaquira.setForeground(Color.BLACK);
		lblAngeloJairAnguloCuaquira.setBounds(133, 115, 223, 14);
		getContentPane().add(lblAngeloJairAnguloCuaquira);
		
		JLabel lblNewLabel = new JLabel("_______________________________________________________");
		lblNewLabel.setBounds(47, 140, 371, 14);
		getContentPane().add(lblNewLabel);

	}
}
