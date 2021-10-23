package modelo;

public class Matricula {
	private int NumeroMatricula;
	private String CodigoAlumno;
	private String CodigoCurso;
	
	public Matricula(int numeroMatricula, String codigoAlumno, String codigoCurso) {
		NumeroMatricula = numeroMatricula;
		CodigoAlumno = codigoAlumno;
		CodigoCurso = codigoCurso;
	}

	public int getNumeroMatricula() {
		return NumeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		NumeroMatricula = numeroMatricula;
	}

	public String getCodigoAlumno() {
		return CodigoAlumno;
	}

	public void setCodigoAlumno(String codigoAlumno) {
		CodigoAlumno = codigoAlumno;
	}

	public String getCodigoCurso() {
		return CodigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		CodigoCurso = codigoCurso;
	}
	
	

}
