package array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import modelo.Alumno;

public class ArrayAlumno {
private ArrayList<Alumno> alumnos;
	
	public ArrayAlumno() {
		alumnos = new ArrayList<Alumno>();

		cargarAlumnos();
	}
	
	public void adicionar(Alumno x) {
		alumnos.add(x);
		grabarAlumnos();
	}
	public void eliminar(Alumno x) {
		alumnos.remove(x);
		grabarAlumnos();
	}
	public int tamaño() {
		return alumnos.size();
	}
	public Alumno obtener(int i) {
		return alumnos.get(i);
	}
	public Alumno buscar(int codigo) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getalumno() == codigo)
				return alumnos.get(i);
		}
		return null;
	}
	
	public int codigoCorrelativo() {
		if (alumnos.size() == 0) return 202010001;
		return alumnos.get(alumnos.size()-1).getalumno() + 1;
	}
	public void ActualizarArchivo() {
		grabarAlumnos();
	}
	
	private void grabarAlumnos() {
		try {
			PrintWriter pw;
			String linea;
			Alumno x;
			pw = new PrintWriter(new FileWriter("alumnos.txt"));
			for (int i = 0; i< alumnos.size(); i++) {
				x = alumnos.get(i);
				linea = x.getalumno() + ";" +
					    x.getnombres() + ";" +
						x.getApellidos() + ";" +
						x.getDni() + ";" +
						x.getEdad() + ";" +
						x.getCelular() + ";" +
						x.getEstado();
				pw.println(linea);
			}
			pw.close();
		}
		catch (Exception e) {
		}
	}
	private void cargarAlumnos() {
		try {
			BufferedReader br;
			String linea, nombres, Apellidos, Dni;
			String[] s;
			int alumno, Edad, Celular, Estado;
			br = new BufferedReader(new FileReader("alumnos.txt"));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				alumno = Integer.parseInt(s[0].trim());
				nombres = s[1].trim();
				Apellidos = s[2].trim();
				Dni = s[3].trim();
				Edad = Integer.parseInt(s[4].trim());
				Celular = Integer.parseInt(s[5].trim());
				Estado = Integer.parseInt(s[6].trim());
				adicionar(new Alumno(alumno, nombres, Apellidos, Dni, Edad, Celular, Estado));
			}
			br.close();
		}
		catch (Exception e) {
		}
	}

	}









