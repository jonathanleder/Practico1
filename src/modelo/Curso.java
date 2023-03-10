package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Curso {// El objetivo es cumplir con las consignas asignadas por ende hay atributos que
					// se omiten a fin de reducir el tiempo
	// --- Atributos ---
	LocalDate iInscripcion;
	LocalDate fInscripcion;
	ArrayList<Participante> participantes;
	String nombre;
	int puntos;
	int idCurso;

	public Curso(String nombre, int puntos, int codigo) {
		// La fecha de inscripcion se crea al crear un curso y su fecha de finalizacion
		// es a sus 10 dias posteriores
		iInscripcion = LocalDate.now();
		fInscripcion = LocalDate.of(iInscripcion.getYear(), iInscripcion.getMonth(), iInscripcion.getDayOfMonth() + 10);
		participantes = new ArrayList<Participante>();// Se crea el listado de participantes
		this.nombre = nombre;
		this.puntos = puntos;
		this.idCurso = codigo;

	}

	// --- Metodos ---
	public void inscribirParticipante(Participante unParticipante) {

		/*
		 * antes que nada evaluar si ya esta inscripto 1- Evaluar si es el primer dia si
		 * es el primer dia sumar 10 puntos al participante(crear metodo para ello,
		 * metodo sumar puntos) 2- Evaluar si esta dentro del periodo 2.1 si no esta
		 * dentro del periodo por pantalla se le informa que debe mandar una nota 2.2
		 * caso contrario se lo inscribe en el curso
		 */
	}

	private void sumarPuntos(int puntos) {

	}
}
