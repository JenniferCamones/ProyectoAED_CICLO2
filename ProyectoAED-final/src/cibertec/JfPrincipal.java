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
public class JfPrincipal extends JFrame implements ActionListener   {
//jeni
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
	private JMenuItem mntmConsutAlumno;
	private JMenuItem mntmConsutCurso;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsutMatricula;
	private JMenuItem mntmConsutRetiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfPrincipal frame = new JfPrincipal();
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
	public JfPrincipal() {
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
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
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
		
		mntmConsutAlumno = new JMenuItem("Alumno");
		mntmConsutAlumno.addActionListener(this);
		mnconsulta.add(mntmConsutAlumno);
		
		mntmConsutCurso = new JMenuItem("Curso");
		mntmConsutCurso.addActionListener(this);
		mnconsulta.add(mntmConsutCurso);
		
		mntmConsutMatricula = new JMenuItem("Matricula");
		mntmConsutMatricula.addActionListener(this);
		mnconsulta.add(mntmConsutMatricula);
		
		mntmConsutRetiro = new JMenuItem("Retiro");
		mntmConsutRetiro.addActionListener(this);
		mnconsulta.add(mntmConsutRetiro);
		
		mnreporte = new JMenu("Reporte");
		menuBar.add(mnreporte);
		
		mntmalumnosmatrículapendiente = new JMenuItem("Alumnos con matr\u00EDcula pendiente");
		mntmalumnosmatrículapendiente.addActionListener(this);
		mnreporte.add(mntmalumnosmatrículapendiente);
		
		mntmalumnosmatrículavigente = new JMenuItem("Alumnos con matr\u00EDcula vigente");
		mntmalumnosmatrículavigente.addActionListener(this);
		mnreporte.add(mntmalumnosmatrículavigente);
		
		mntmalumnosmatriculadoscurso = new JMenuItem("Alumnos matriculados por curso");
		mntmalumnosmatriculadoscurso.addActionListener(this);
		mnreporte.add(mntmalumnosmatriculadoscurso);
		
		mnayuda = new JMenu("Ayuda");
		menuBar.add(mnayuda);
		
		mntmAcercaDelSistema = new JMenuItem("Acerca del sistema");
		mntmAcercaDelSistema.addActionListener(this);
		mnayuda.add(mntmAcercaDelSistema);
	}
	// 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(mntmAlumno == e.getSource() ) {
			JdMantAlumno a = new JdMantAlumno();//instanciamos AdicionarAlumno 
			a.setLocationRelativeTo(this);
			a.setVisible(true);
		}
		
		if(mntmCurso == e.getSource() ) {
			JdMantCurso c = new JdMantCurso(); 
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		if(mntmMatricula == e.getSource() ) {
			JdRegMatricula c = new JdRegMatricula(); 
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		if(mntmRetiro == e.getSource() ) {
			JdRegRetiro c = new JdRegRetiro();
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		if(mntmConsutAlumno == e.getSource() ) {
			JdConsulAlumno c = new JdConsulAlumno();
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		if(mntmConsutCurso == e.getSource() ) {
			JdConsulCurso c = new JdConsulCurso(); 
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		if(mntmConsutMatricula == e.getSource() ) {
			JdConsulMatricula c = new JdConsulMatricula(); 
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		if(mntmConsutRetiro == e.getSource() ) {
			JdConsulRetiros c = new JdConsulRetiros();
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		if(mntmalumnosmatrículapendiente == e.getSource() ) {
			JdReportAlumnoMatPend c = new JdReportAlumnoMatPend();
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		if(mntmalumnosmatrículavigente == e.getSource() ) {
			JdReporteAlumnoMatVigente c = new JdReporteAlumnoMatVigente();
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		if(mntmalumnosmatriculadoscurso == e.getSource() ) {
			JdReportAlumnoMatCurso c = new JdReportAlumnoMatCurso();
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		if(mntmAcercaDelSistema == e.getSource() ) {
			JdAcercaDelSistema c = new JdAcercaDelSistema();
			c.setLocationRelativeTo(this);
			c.setVisible(true);
		}
		
	}
	
	//prueva
}
