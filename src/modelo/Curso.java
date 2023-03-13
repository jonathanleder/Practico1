package modelo;

import java.time.LocalDate;

public class Curso {// El objetivo es cumplir con las consignas asignadas por ende hay atributos que
					// se omiten a fin de reducir el tiempo
	// --- Atributos ---
	LocalDate iInscripcion;
	LocalDate fInscripcion;
	Participante participante;
	String nombre;
	int puntos;
	int idCurso;

	public Curso(String nombre, int puntos, int codigo) {
		// La fecha de inscripcion se crea al crear un curso y su fecha de finalizacion
		// es a sus 10 dias posteriores
		iInscripcion = LocalDate.now();
		fInscripcion = LocalDate.now().plusDays(10);
		this.nombre = nombre;
		this.puntos = puntos;
		this.idCurso = codigo;

	}

	public Curso(String nombre, int puntos, int codigo, LocalDate fecha, int duracionDelCurso) {
		iInscripcion = fecha;
		fInscripcion = fecha.plusDays(duracionDelCurso);
		this.nombre = nombre;
		this.puntos = puntos;
		this.idCurso = codigo;
	}

	// --- Metodos ---
	public boolean inscribirParticipante(Participante unParticipante) {

		/*
		 * antes que nada evaluar si ya esta inscripto(si aparece en la lista) 1-
		 * Evaluar si es el primer dia si es el primer dia sumar 10 puntos al
		 * participante(crear metodo para ello, metodo sumar puntos) 2- Evaluar si esta
		 * dentro del periodo 2.1- si no esta dentro del periodo por pantalla se le
		 * informa que debe mandar una nota
		 */

		if (LocalDate.now().equals(iInscripcion)) {
			unParticipante.sumarPuntos(10);
			this.participante = unParticipante;
			return true;
		} else if (sePuedeInscribir()) {
			this.participante = unParticipante;
			return true;
		} else {
			System.out.println("   Para inscribirse fuera de termino, mande una nota. Muchas gracias");
			return false;
		}
	}

	private boolean sePuedeInscribir() {
		return LocalDate.now().isBefore(fInscripcion) && LocalDate.now().isAfter(iInscripcion);
	}

	public void mostrarParticipante() {

		if (!this.participante.nombre.isEmpty())
			this.participante.info();
		else
			throw new RuntimeException("No hay Participantes inscriptos");
	}

}
