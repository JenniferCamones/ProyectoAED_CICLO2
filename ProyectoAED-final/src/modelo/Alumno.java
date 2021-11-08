package modelo;

public class Alumno {
	private int alumno;
	private String nombres;
	private String Apellidos;
	private String Dni;
	private int Edad;
	private int Celular;
	private int Estado;

	public Alumno(int alumno,String nombres, String apellidos, String dni, int edad, int celular, int estado) {
		this.alumno = alumno;
		this.nombres = nombres;
		this.Apellidos = apellidos;
		this.Dni = dni;
		this.Edad = edad;
		this.Celular = celular;
		this.Estado = estado;
	}
	public int getalumno() {
		return alumno;
	}

	public void setalumno(int alumno) {
		this.alumno = alumno;
	}

	public String getnombres() {
		return nombres;
	}

	public void setnombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		this.Apellidos = apellidos;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		this.Dni = dni;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		this.Edad = edad;
	}

	public int getCelular() {
		return Celular;
	}

	public void setCelular(int celular) {
		this.Celular = celular;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		this.Estado = estado;
	}

}
