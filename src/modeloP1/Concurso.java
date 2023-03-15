package modeloP1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {// El objetivo es cumplir con las consignas asignadas por ende hay atributos que
						// se omiten a fin de reducir el tiempo
	// --- Atributos ---
	LocalDate iInscripcion;
	LocalDate fInscripcion;
	ArrayList<Participante> participantes;
	String nombre;
	int puntos;
	int idCurso;

	public Concurso(String nombre, int puntos, int codigo) {
		// La fecha de inscripcion se crea al crear un curso y su fecha de finalizacion
		// es a sus 10 dias posteriores
		iInscripcion = LocalDate.now();
		fInscripcion = LocalDate.now().plusDays(10);
		this.participantes = new ArrayList<Participante>();
		this.nombre = nombre;
		this.puntos = puntos;
		this.idCurso = codigo;

	}

	public Concurso(String nombre, int puntos, int codigo, LocalDate fecha, int duracionDelCurso) {
		iInscripcion = fecha;
		fInscripcion = fecha.plusDays(duracionDelCurso);
		this.participantes = new ArrayList<Participante>();
		this.nombre = nombre;
		this.puntos = puntos;
		this.idCurso = codigo;
	}

	// --- Metodos ---
	public boolean inscribirParticipante(Participante unParticipante) {
		if (estaInscripto(unParticipante))
			System.out.println("   El Participante ya se encuentra inscripto!");
		else if (sePuedeInscribir()) {
			if (esPrimerDia())
				unParticipante.sumarPuntos(10);
			this.participantes.add(unParticipante);
			System.out.println("Se inscribio correctamente a " + unParticipante.getNombre());
			return true;
		} else
			System.out.println("   Para inscribirse fuera de termino, mande una nota. Muchas gracias\n");
		return false;
	}

	private boolean sePuedeInscribir() {
		boolean puede = LocalDate.now().isBefore(fInscripcion) && LocalDate.now().isAfter(iInscripcion.minusDays(1));
		// System.out.println("Puede vale: " + puede);
		return puede;
	}

	public boolean estaInscripto(Participante participante) {
		return this.participantes.stream().anyMatch(p -> participante.equals(participante));
	}

	private boolean esPrimerDia() {
		boolean primerDia = LocalDate.now().isEqual(iInscripcion);
//		System.out.println("Fecha actual: " + LocalDate.now() + "\n Fecha inscripcion: " + iInscripcion);
//		System.out.println("Primer dia vale " + primerDia);
		return primerDia;
	}

	public void mostrarParticipantes() {

		if (this.participantes.isEmpty())
			System.out.println("No hay Participantes inscriptos");

		else {
			for (Participante unParticipante : participantes) {
				unParticipante.info();
			}
		}
	}

}
