package cibertec;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JProgressBar;


public class JdRegMatricula extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNmeroDeMatricula;
	private JLabel lblCdigoDelAlumno;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminiar;
	private JComboBox comboBox;
	private JLabel lblEstado;
	private JLabel lblCdigoDeCurso;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JPanel panel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdRegMatricula dialog = new JdRegMatricula();
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
	public JdRegMatricula() {
		setBounds(100, 100, 608, 393);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNmeroDeMatricula = new JLabel("N\u00FAmero de Matricula:");
		lblNmeroDeMatricula.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNmeroDeMatricula.setBounds(10, 22, 120, 14);
		contentPanel.add(lblNmeroDeMatricula);
		
		lblCdigoDelAlumno = new JLabel("C\u00F3digo del alumno:");
		lblCdigoDelAlumno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCdigoDelAlumno.setBounds(10, 57, 109, 14);
		contentPanel.add(lblCdigoDelAlumno);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(467, 30, 102, 32);
		contentPanel.add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(467, 87, 102, 32);
		contentPanel.add(btnModificar);
		
		btnEliminiar = new JButton("Eliminiar");
		btnEliminiar.addActionListener(this);
		btnEliminiar.setBounds(467, 143, 102, 35);
		contentPanel.add(btnEliminiar);
		
		comboBox = new JComboBox();
		comboBox.setBounds(151, 19, 136, 20);
		contentPanel.add(comboBox);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstado.setBounds(10, 128, 46, 14);
		contentPanel.add(lblEstado);
		
		lblCdigoDeCurso = new JLabel("C\u00F3digo de curso:");
		lblCdigoDeCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCdigoDeCurso.setBounds(10, 164, 109, 14);
		contentPanel.add(lblCdigoDeCurso);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(151, 54, 136, 20);
		contentPanel.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(151, 158, 136, 20);
		contentPanel.add(comboBox_2);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(21, 207, 120, 32);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(151, 207, 136, 32);
		contentPanel.add(btnCancelar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 311, 208, -42);
		contentPanel.add(scrollPane);
		
		panel = new JPanel();
		panel.setBounds(151, 119, 136, 28);
		contentPanel.add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 88, 277, 20);
		contentPanel.add(panel_1);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnEliminiar) {
			actionPerformedBtnEliminiar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnEliminiar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
	}
}
