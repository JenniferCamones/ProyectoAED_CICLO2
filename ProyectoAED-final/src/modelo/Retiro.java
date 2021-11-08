package modelo;

public class Retiro {
	private int NumeroRetiro;
	private int NumeroMatricula;
	private String fecha;
	private String hora;
	
	public Retiro(int numeroRetiro, int numeroMatricula, String fecha, String hora) {
		this.NumeroRetiro = numeroRetiro;
		this.NumeroMatricula = numeroMatricula;
		this.fecha = fecha;
		this.hora = hora;
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
