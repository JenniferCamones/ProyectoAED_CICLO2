package modelo;

public class Retiro {
	private int NumeroRetiro;
	private int NumeroMatricula;
	private int CodigoCurso;
	
	public Retiro(int numeroRetiro, int numeroMatricula, int codigoCurso) {
		NumeroRetiro = numeroRetiro;
		NumeroMatricula = numeroMatricula;
		CodigoCurso = codigoCurso;
	}

	public int getNumeroRetiro() {
		return NumeroRetiro;
	}

	public void setNumeroRetiro(int numeroRetiro) {
		NumeroRetiro = numeroRetiro;
	}

	public int getNumeroMatricula() {
		return NumeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		NumeroMatricula = numeroMatricula;
	}

	public int getCodigoCurso() {
		return CodigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		CodigoCurso = codigoCurso;
	}
	
	
	

}
