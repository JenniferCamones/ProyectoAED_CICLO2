package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

//implement actionli
public class Principal extends JFrame implements ActionListener   {

	private JPanel contentPane;
	private JMenu mnmantenimiento;
	private JMenu mnregistro;
	private JMenu mnconsulta;
	private JMenu mnreporte;
	private JMenuItem mntmalumnosmatrículapendiente;
	private JMenuItem mntmalumnosmatrículavigente;
	private JMenuItem mntmalumnosmatriculadoscurso;
	private JMenu mnayuda;
	private JMenuItem mntmAcercaDelSistema;
	private JMenuItem mntmAlumno;
	private JMenuItem mntmCurso;
	private JMenuItem mntmMatricula;
	private JMenuItem mntmRetiro;
	private JMenuItem mntmAlumnoCurso;
	private JMenuItem mntmMatriculasRetiros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("REGISTRO Y MATR\u00CDCULA DE ALUMNOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		mnmantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnmantenimiento);
		
		mntmAlumno = new JMenuItem("Alumno");
		mntmAlumno.addActionListener(this);
		mnmantenimiento.add(mntmAlumno);
		
		mntmCurso = new JMenuItem("Curso");
		mntmCurso.addActionListener(this);
		mnmantenimiento.add(mntmCurso);
		
		mnregistro = new JMenu("Registro");
		
		menuBar.add(mnregistro);
		
		mntmMatricula = new JMenuItem("Matricula");
		mntmMatricula.addActionListener(this);
		mnregistro.add(mntmMatricula);
		
		mntmRetiro = new JMenuItem("Retiro");
		mntmRetiro.addActionListener(this);
		mnregistro.add(mntmRetiro);
		
		mnconsulta = new JMenu("Consulta");
		menuBar.add(mnconsulta);
		
		mntmAlumnoCurso = new JMenuItem("Alumno y curso");
		mntmAlumnoCurso.addActionListener(this);
		mnconsulta.add(mntmAlumnoCurso);
		
		mntmMatriculasRetiros = new JMenuItem("Matriculas y retiros");
		mntmMatriculasRetiros.addActionListener(this);
		mnconsulta.add(mntmMatriculasRetiros);
		
		mnreporte = new JMenu("Reporte");
		menuBar.add(mnreporte);
		
		mntmalumnosmatrículapendiente = new JMenuItem("Alumnos con matr\u00EDcula pendiente");
		mntmalumnosmatrículapendiente.addActionListener(this);
		mnreporte.add(mntmalumnosmatrículapendiente);
		
		mntmalumnosmatrículavigente = new JMenuItem("Alumnos con matr\u00EDcula vigente");
		mnreporte.add(mntmalumnosmatrículavigente);
		
		mntmalumnosmatriculadoscurso = new JMenuItem("Alumnos matriculados por curso");
		mnreporte.add(mntmalumnosmatriculadoscurso);
		
		mnayuda = new JMenu("Ayuda");
		menuBar.add(mnayuda);
		
		mntmAcercaDelSistema = new JMenuItem("Acerca del sistema");
		mnayuda.add(mntmAcercaDelSistema);
	}
	// 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(mntmAlumno == e.getSource() ) {
			Alumno a = new Alumno();//instanciamos AdicionarAlumno 
			a.setLocationRelativeTo(this);
			a.setVisible(true);
		}
		
		if(mntmCurso == e.getSource() ) {
			Curso c = new Curso();//instanciamos AdicionarAlumno 
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
