package array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import modelo.Curso;

public class ArrayCursos {
private ArrayList<Curso> Codigo;
	
	public ArrayCursos() {
		Codigo = new ArrayList<Curso>();
		cargarCodigos();
	}
	
	public void adicionar(Curso x) {
		Codigo.add(x);
		grabarCodigos();
	}
	public void eliminar(Curso x) {
		Codigo.remove(x);
		grabarCodigos();
	}
	public int tamaño() {
		return Codigo.size();
	}
	public Curso obtener(int i) {
		return Codigo.get(i);
	}
	public Curso buscar(int codigo) {
		for (int i = 0; i < Codigo.size(); i++) {
			if (Codigo.get(i).getCodigo() == codigo)
				return Codigo.get(i);
		}
		return null;
	}
	
	public int codigoCorrelativo() {
		if (Codigo.size() == 0)
			return 101;
		return Codigo.get(Codigo.size()-1).getCodigo() + 1;
	}
	public void ActualizarArchivo() {
		grabarCodigos();
	}
	
	private void grabarCodigos() {
		try {
			PrintWriter pw;
			String linea;
			Curso x;
			pw = new PrintWriter(new FileWriter("Codigo.txt"));
			for (int i = 0; i< Codigo.size(); i++) {
				x = Codigo.get(i);
				linea = x.getCodigo() + ";" +
					    x.getAsignatura() + ";" +
						x.getCiclo() + ";" +
						x.getNumeroCredito() + ";" +
						x.getCamtidadHora();
				pw.println(linea);
			}
			pw.close();
		}
		catch (Exception e) {
		}
	}
	private void cargarCodigos() {
		try {
			BufferedReader br;
			int Codigo, Ciclo, numeroCredito, CamtidadHora;
			String asignatura, linea;
			String[] s;
			br = new BufferedReader(new FileReader("Codigos.txt"));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				Codigo = Integer.parseInt(s[0].trim());
				asignatura = s[1].trim();
				Ciclo = Integer.parseInt(s[2].trim());
				numeroCredito = Integer.parseInt(s[3].trim());
				CamtidadHora = Integer.parseInt(s[4].trim());
				adicionar(new Curso(Codigo, asignatura, Ciclo, numeroCredito, CamtidadHora));
			}
			br.close();
		}
		catch (Exception e) {
		}
	}
}
