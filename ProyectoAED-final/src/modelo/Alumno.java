package modelo;

public class Alumno {
	private String nombres;
	private String Apellidos;
	private String Dni;
	private int Edad;
	private int Celular;
	private String Estado;

	public Alumno(String nombres, String apellidos, String dni, int edad, int celular, String estado) {
		this.nombres = nombres;
		Apellidos = apellidos;
		Dni = dni;
		Edad = edad;
		Celular = celular;
		Estado = estado;
	}

	public String getnombres() {
		return nombres;
	}

	public void setnombres(String nombres) {
		nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public int getCelular() {
		return Celular;
	}

	public void setCelular(int celular) {
		Celular = celular;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

}
