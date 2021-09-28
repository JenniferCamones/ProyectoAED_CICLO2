package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JdRegRetiro extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JLabel label_1;
	private JComboBox comboBox_1;
	private JLabel lblCurso;
	private JLabel lblActivo;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton button;
	private JButton button_1;
	private JButton button_3;
	private JButton button_4;
	private JButton button_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdRegRetiro dialog = new JdRegRetiro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdRegRetiro() {
		setBounds(100, 100, 605, 373);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("N\u00FAmero de Matricula:");
			label.setBounds(10, 64, 120, 14);
			label.setFont(new Font("Tahoma", Font.BOLD, 11));
			contentPanel.add(label);
		}
		{
			JLabel lblNmeroDeRetiro = new JLabel("N\u00FAmero de retiro:");
			lblNmeroDeRetiro.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNmeroDeRetiro.setBounds(10, 22, 120, 14);
			contentPanel.add(lblNmeroDeRetiro);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(156, 19, 141, 20);
			contentPanel.add(comboBox);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(156, 61, 141, 20);
			contentPanel.add(comboBox);
		}
		{
			JLabel lblAlumno = new JLabel("Alumno:");
			lblAlumno.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblAlumno.setBounds(10, 111, 46, 14);
			contentPanel.add(lblAlumno);
		}
		
		panel = new JPanel();
		panel.setBounds(88, 111, 209, 20);
		contentPanel.add(panel);
		
		label_1 = new JLabel("C\u00F3digo de curso:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(10, 158, 109, 14);
		contentPanel.add(label_1);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(156, 155, 141, 20);
		contentPanel.add(comboBox_1);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCurso.setBounds(10, 200, 46, 14);
		contentPanel.add(lblCurso);
		
		lblActivo = new JLabel("Activo:");
		lblActivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivo.setBounds(10, 243, 46, 14);
		contentPanel.add(lblActivo);
		
		panel_1 = new JPanel();
		panel_1.setBounds(88, 200, 209, 20);
		contentPanel.add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBounds(88, 237, 78, 20);
		contentPanel.add(panel_2);
		
		button = new JButton("Aceptar");
		button.setBounds(10, 287, 141, 36);
		contentPanel.add(button);
		
		button_1 = new JButton("Cancelar");
		button_1.setBounds(163, 287, 134, 36);
		contentPanel.add(button_1);
		
		button_3 = new JButton("Modificar");
		button_3.addActionListener(this);
		button_3.setBounds(464, 71, 102, 32);
		contentPanel.add(button_3);
		
		button_4 = new JButton("Eliminiar");
		button_4.setBounds(464, 125, 102, 35);
		contentPanel.add(button_4);
		
		button_2 = new JButton("Adicionar");
		button_2.setBounds(464, 18, 102, 32);
		contentPanel.add(button_2);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button_3) {
			actionPerformedButton_3(arg0);
		}
	}
	protected void actionPerformedButton_3(ActionEvent arg0) {
	}
}
