package modelo;

public class Curso {
	private int Codigo;
	private String asignatura;
	private int Ciclo;
	private int numeroCredito;
	private int CamtidadHora;
	
	public Curso(int codigo, String asignatura, int ciclo, int numeroCredito, int camtidadHora) {
		this.Codigo = codigo;
		this.asignatura = asignatura;
		this.Ciclo = ciclo;
		this.numeroCredito = numeroCredito;
		this.CamtidadHora = camtidadHora;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		this.Codigo = codigo;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getCiclo() {
		return Ciclo;
	}

	public void setCiclo(int ciclo) {
		this.Ciclo = ciclo;
	}

	public int getNumeroCredito() {
		return numeroCredito;
	}

	public void setNumeroCredito(int numeroCredito) {
		this.numeroCredito = numeroCredito;
	}

	public int getCamtidadHora() {
		return CamtidadHora;
	}

	public void setCamtidadHora(int camtidadHora) {
		this.CamtidadHora = camtidadHora;
	}
	
	
	
	
	
	
	
}
