package cibertec;

import modelo.*;
import array.*;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.Font;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
public class JdMantAlumno extends JDialog implements ItemListener, ActionListener, MouseListener {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox<Integer> cboCodigo;
	private JTextField txtnombress;
	private JComboBox<String> cboEstado;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_2;
	private JTextField txtApellidos;
	private JTextField txtDNI;
	private JLabel lblNewLabel_3;
	private JTextField txtEdad;
	private JLabel lblNewLabel_4;
	private JTextField txtCelular;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTable tblAlumno;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdMantAlumno dialog = new JdMantAlumno();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdMantAlumno() {
		setTitle("MANTENIMIENTO DE ALUMNOS");
		setBounds(100, 100, 700, 502);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 21, 77, 15);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("nombress:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 56, 77, 15);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Apellidos:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 89, 77, 15);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("DNI:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 120, 77, 15);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Edad:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(223, 120, 39, 15);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Celular:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 151, 77, 15);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Estado:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 182, 77, 15);
		getContentPane().add(lblNewLabel_6);
		
		cboCodigo = new JComboBox<Integer>();
		cboCodigo.addItemListener(this);
		cboCodigo.setBounds(97, 19, 115, 21);
		getContentPane().add(cboCodigo);
		
		txtnombress = new JTextField();
		txtnombress.setColumns(10);
		txtnombress.setBounds(97, 55, 211, 19);
		getContentPane().add(txtnombress);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(97, 88, 211, 19);
		getContentPane().add(txtApellidos);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(97, 119, 115, 19);
		getContentPane().add(txtDNI);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(272, 119, 36, 19);
		getContentPane().add(txtEdad);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(97, 150, 115, 19);
		getContentPane().add(txtCelular);
		
		cboEstado = new JComboBox<String>();
		cboEstado.setModel(new DefaultComboBoxModel<String>(new String[] {"REGISTRADO", "MATRICULADO", "RETIRADO"}));
		cboEstado.setBounds(97, 180, 115, 21);
		getContentPane().add(cboEstado);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAceptar.setBounds(10, 215, 142, 27);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelar.setBounds(166, 215, 142, 27);
		getContentPane().add(btnCancelar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdicionar.setBounds(572, 21, 104, 33);
		getContentPane().add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModificar.setBounds(572, 79, 104, 33);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminar.setBounds(572, 141, 104, 33);
		getContentPane().add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 252, 666, 203);
		getContentPane().add(scrollPane);
		
		tblAlumno = new JTable();
		tblAlumno.addMouseListener(this);
		tblAlumno.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblAlumno);
		modelo = new DefaultTableModel();
		modelo.addColumn("C�DIGO");
		modelo.addColumn("nombresS");
		modelo.addColumn("APELLIDOS");
		modelo.addColumn("DNI");
		modelo.addColumn("EDAD");
		modelo.addColumn("CELULAR");
		modelo.addColumn("ESTADO");
		tblAlumno.setModel(modelo);
		
		ajustarColumnas();
		listar();
		deshabilitarTodo();
		
	}
	//DECLARACI�N GLOBAL
	ArrayAlumno aa = new ArrayAlumno();

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboCodigo) {
			itemStateChangedCboCodigo(e);
		}
	}
	protected void itemStateChangedCboCodigo(ItemEvent e) {
		try {
			int codAlumno = leerCodigo();
			Alumno buscado = aa.buscar(codAlumno);
			txtnombress.setText(buscado.getnombres());
			txtApellidos.setText(buscado.getApellidos());
			txtDNI.setText(buscado.getDni());
			txtEdad.setText("" + buscado.getEdad());
			txtCelular.setText("" + buscado.getCelular());
			cboEstado.setSelectedIndex(buscado.getEstado());
			tblAlumno.setRowSelectionInterval(cboCodigo.getSelectedIndex(), cboCodigo.getSelectedIndex());
		} catch (Exception error) {
			
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnModificar) {
			actionPerformedBtnModificar(e);
		}
		if (e.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		try {
			int codAlumno = leerCodigo();
			String nombres = leernombress();
			if (nombres.length() != 0) {
				String apellidos = leerApellidos();
				if (apellidos.length() != 0) {
					String dni = leerDNI();
					try {
						if (Integer.parseInt(dni) > 0 && Integer.parseInt(dni) < 100000000) {
							try {
								int edad = leerEdad();
								try {
									int celular = leerCelular();
									int estado = leerEstado();
									if (estado != -1) {
										if (!btnAdicionar.isEnabled()) {
											if (!existeDNI(dni)) {
												Alumno nuevo = new Alumno(codAlumno, nombres, apellidos, dni, edad, celular, estado);
												aa.adicionar(nuevo);
												listar();
												mensaje("Nuevo alumno a�adido exitosamente");
												deshabilitarTodo();	
											} else {
												error("No puede ingresar un DNI ya existente", txtDNI);
											}
										} else if (!btnModificar.isEnabled()) {
											Alumno buscado = aa.buscar(codAlumno);
											buscado.setnombres(nombres);
											buscado.setApellidos(apellidos);
											buscado.setEdad(edad);
											buscado.setCelular(celular);
											aa.ActualizarArchivo();
											listar();
											mensaje("Alumno modificado exitosamente");
											deshabilitarTodo();
										}
									} else {
										error("Especifique el estado del alumno", cboEstado);
									}
								} catch (Exception error) {
									error("Ingrese un n�mero de celular v�lido", txtCelular);
								}
							} catch (Exception error) {
								error("Ingrese una edad v�lida", txtEdad);
							}
						} else {
							error("Ingrese un DNI v�lido", txtDNI);
						}	
					} catch (Exception error) {
						error("Ingrese un DNI v�lido", txtDNI);
					}
				} else {
					error("Ingrese los apellidos del alumno", txtApellidos);
				}
			} else {
				error("Ingrese el nombres del alumno", txtnombress);
			}
		} catch (Exception error) {
			error("Seleccione un c�digo de alumno", cboCodigo);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		deshabilitarTodo();
	}
	protected void actionPerformedBtnAdicionar(ActionEvent e) {
		limpiar();
		habilitar(false, true, true, true, true, true, false, true, true, false, true, false);
		cboEstado.setSelectedIndex(0);
		cboCodigo.addItem(aa.codigoCorrelativo());
		cboCodigo.setSelectedIndex(aa.tama�o());
		txtnombress.requestFocus();
	}
	protected void actionPerformedBtnModificar(ActionEvent e) {
		if (!btnAdicionar.isEnabled()) deshabilitarTodo();
		habilitar(true, true, true, false, true, true, false, true, true, true, false, false);
		cboCodigo.requestFocus();
	}
	
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		try {
			int codAlumno = leerCodigo();
			Alumno buscado = aa.buscar(codAlumno);
			if (buscado.getEstado() == 0) {
				if (confirmar() == 0) {
					aa.eliminar(buscado);
					listar();
					mensaje("Alumno eliminado exitosamente");
					deshabilitarTodo();
				}
			} else {
				error("No puede eliminar a un alumno ya matriculado", cboCodigo);
			}
		} catch (Exception error) {
			error("Seleccione un c�digo de alumno", cboCodigo);
		}
	}
	
	void habilitar(boolean codigo,boolean nombres, boolean apellidos, boolean dni, boolean edad, boolean celular,
			boolean estado, boolean aceptar, boolean cancelar, boolean adicionar, boolean modificar, boolean eliminar) {
		cboCodigo.setEnabled(codigo);
		txtnombress.setEditable(nombres);
		txtApellidos.setEditable(apellidos);
		txtDNI.setEditable(dni);
		txtEdad.setEditable(edad);
		txtCelular.setEditable(celular);
		cboEstado.setEnabled(estado);
		btnAceptar.setEnabled(aceptar);
		btnCancelar.setEnabled(cancelar);
		btnAdicionar.setEnabled(adicionar);
		btnModificar.setEnabled(modificar);
		btnEliminar.setEnabled(eliminar);
	}
	void deshabilitarTodo() {
		listarCboCodigo();
		habilitar(false, false, false, false, false, false, false, false, false, true, true, true);
		limpiar();
	}
	void limpiar() {
		cboCodigo.setSelectedIndex(-1);
		txtnombress.setText("");
		txtApellidos.setText("");
		txtDNI.setText("");
		txtEdad.setText("");
		txtCelular.setText("");
		cboEstado.setSelectedIndex(-1);
	}
	void listarCboCodigo() {
		cboCodigo.removeAllItems();
		for (int i = 0; i < aa.tama�o(); i++) {
			cboCodigo.addItem(aa.obtener(i).getalumno());
		}
	}
	void ajustarColumnas() {
		TableColumnModel modeloColuma = tblAlumno.getColumnModel();
		modeloColuma.getColumn(0).setPreferredWidth(scrollPane.getWidth()*2);
		modeloColuma.getColumn(1).setPreferredWidth(scrollPane.getWidth()*4);
		modeloColuma.getColumn(2).setPreferredWidth(scrollPane.getWidth()*4);
		modeloColuma.getColumn(3).setPreferredWidth(scrollPane.getWidth()*2);
		modeloColuma.getColumn(4).setPreferredWidth(scrollPane.getWidth()*1);
		modeloColuma.getColumn(5).setPreferredWidth(scrollPane.getWidth()*2);
		modeloColuma.getColumn(6).setPreferredWidth(scrollPane.getWidth()*3);
	}
	void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < aa.tama�o(); i++) {
			Object[] fila = {
					aa.obtener(i).getalumno(),
					aa.obtener(i).getnombres(),
					aa.obtener(i).getApellidos(),
					aa.obtener(i).getDni(),
					aa.obtener(i).getEdad(),
					aa.obtener(i).getCelular(),
					nombresEstado(aa.obtener(i).getEstado()),
			};
			modelo.addRow(fila);
		}
	}
	boolean existeDNI(String dni) {
		for (int i = 0; i < aa.tama�o(); i++) {
			if(aa.obtener(i).getDni().equals(dni))
				return true;
		}
		return false;
	}
	int leerCodigo() {
		return Integer.parseInt(cboCodigo.getSelectedItem().toString());
	}
	String leernombress() {
		return txtnombress.getText().trim().toUpperCase();
	}
	String leerApellidos() {
		return txtApellidos.getText().trim().toUpperCase();
	}
	String leerDNI() {
		return txtDNI.getText().trim().toUpperCase();
	}
	int leerEdad() {
		return Integer.parseInt(txtEdad.getText().trim());
	}
	int leerCelular() {
		return Integer.parseInt(txtCelular.getText().trim());
	}
	int leerEstado() {
		return cboEstado.getSelectedIndex();
	}
	String nombresEstado(int i) {
		switch (i) {
			case 0: return "REGISTRADO";
			case 1: return "MATRICULADO";
			case 2: return "RETIRADO";
			default:return null;
		}
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	void error(String s, JComboBox cbo) {
		JOptionPane.showMessageDialog(this, s,"", JOptionPane.ERROR_MESSAGE);
		cbo.requestFocus();
	}
	void error(String s, JTextField txt) {
		JOptionPane.showMessageDialog(this, s,"", JOptionPane.ERROR_MESSAGE);
		txt.selectAll();
		txt.requestFocus();
	}
	int confirmar() {
		int valor = JOptionPane.showOptionDialog(null,
				"�Est�s seguro que deseas eliminar a este alumno?\n"
				+ aa.buscar(leerCodigo()).getnombres() + " " + aa.buscar(leerCodigo()).getApellidos(),
				"Confirmar",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"S�", "No"}, null);
		return valor;
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == tblAlumno) {
			mouseClickedTblAlumno(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedTblAlumno(MouseEvent e) {
		if (btnAdicionar.isEnabled()) {
			try {
				Alumno buscado = aa.obtener(tblAlumno.getSelectedRow());
				cboCodigo.setSelectedIndex(tblAlumno.getSelectedRow());
				txtnombress.setText(buscado.getnombres());
				txtApellidos.setText(buscado.getApellidos());
				txtDNI.setText(buscado.getDni());
				txtEdad.setText("" + buscado.getEdad());
				txtCelular.setText("" + buscado.getCelular());
				cboEstado.setSelectedIndex(buscado.getEstado());
			} catch (Exception error) {
				
			}
		}
	}
}
