package modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendario {
	public static String fechaActual() {
		Calendar Calendario = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
		return formato.format(Calendario.getTime());	
	}
	public static String horaActual() {
			Calendar Calendario = Calendar.getInstance();
			SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss");
			return formato.format(Calendario.getTime());	
		}
}
