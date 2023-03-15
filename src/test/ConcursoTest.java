package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import modeloP1.Concurso;
import modeloP1.Participante;

class ConcursoTest {

	@Test
	void testInscribirParticipantePrimerDia() {
		System.out.println("Primer dia");
		boolean resultadoEsperado = true;
		int duracionDelCurso = 10;
		LocalDate fecha = LocalDate.now();
		Concurso java = new Concurso("java", 5, 1234, fecha, duracionDelCurso);
		Participante juan = new Participante("Juan", 18493526);
		assertEquals(resultadoEsperado, java.inscribirParticipante(juan));
		java.mostrarParticipantes();

	}

	@Test
	void testInscribirParticipanteEnTermino() {

		boolean resultadoEsperado = true;
		int duracionDelCurso = 10;
		LocalDate fecha = LocalDate.now().plusDays(-2);
		Concurso java = new Concurso("java", 5, 1234, fecha, duracionDelCurso);
		Participante juan = new Participante("Juan", 18493526);
		assertEquals(resultadoEsperado, java.inscribirParticipante(juan));
		java.mostrarParticipantes();

	}

	@Test
	void testInscribirParticipanteFueraDeTermino() {

		boolean resultadoEsperado = false;
		int duracionDelCurso = 5;
		LocalDate fecha = LocalDate.now().plusDays(7);
		Concurso java = new Concurso("java", 5, 1234, fecha, duracionDelCurso);
		Participante juan = new Participante("Juan", 18493526);
		assertEquals(resultadoEsperado, java.inscribirParticipante(juan));

	}

}
