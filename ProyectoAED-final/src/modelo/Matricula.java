package modelo;

public class Matricula {
	private int NumeroMatricula;
	private int CodigoAlumno;
	private int CodigoCurso;
	private String fecha;
	private String hora;
	public Matricula(int numeroMatricula, int codigoAlumno, int codigoCurso, String fecha, String hora) {
		this.NumeroMatricula = numeroMatricula;
		this.CodigoAlumno = codigoAlumno;
		this.CodigoCurso = codigoCurso;
		this.fecha = fecha;
		this.hora = hora;
	}
	public int getNumeroMatricula() {
		return NumeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		NumeroMatricula = numeroMatricula;
	}
	public int getCodigoAlumno() {
		return CodigoAlumno;
	}
	public void setCodigoAlumno(int codigoAlumno) {
		CodigoAlumno = codigoAlumno;
	}
	public int getCodigoCurso() {
		return CodigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		CodigoCurso = codigoCurso;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	
}
