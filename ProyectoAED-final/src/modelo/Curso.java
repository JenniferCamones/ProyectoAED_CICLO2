package modelo;

public class Curso {
	private int Codigo;
	private String asignatura;
	private String Ciclo;
	private int numeroCredito;
	private int CamtidadHora;
	
	public Curso(int codigo, String asignatura, String ciclo, int numeroCredito, int camtidadHora) {
		super();
		Codigo = codigo;
		this.asignatura = asignatura;
		Ciclo = ciclo;
		this.numeroCredito = numeroCredito;
		CamtidadHora = camtidadHora;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getCiclo() {
		return Ciclo;
	}

	public void setCiclo(String ciclo) {
		Ciclo = ciclo;
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
		CamtidadHora = camtidadHora;
	}
	
	
	
	
	
	
	
}
