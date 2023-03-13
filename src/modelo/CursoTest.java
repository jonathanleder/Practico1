package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void testInscribirParticipantePrimerDia() {

		boolean resultadoEsperado = true;
		int duracionDelCurso = 10;
		LocalDate fecha = LocalDate.now();
		Curso java = new Curso("java", 5, 1234, fecha, duracionDelCurso);
		Participante juan = new Participante("Juan", 18493526);
		assertEquals(resultadoEsperado, java.inscribirParticipante(juan));
		java.mostrarParticipante();

	}

	@Test
	void testInscribirParticipanteEnTermino() {

		boolean resultadoEsperado = true;
		int duracionDelCurso = 10;
		LocalDate fecha = LocalDate.now().plusDays(-2);
		Curso java = new Curso("java", 5, 1234, fecha, duracionDelCurso);
		Participante juan = new Participante("Juan", 18493526);
		assertEquals(resultadoEsperado, java.inscribirParticipante(juan));
		java.mostrarParticipante();

	}

	@Test
	void testInscribirParticipanteFueraDeTermino() {

		boolean resultadoEsperado = true;
		int duracionDelCurso = 5;
		LocalDate fecha = LocalDate.now().plusDays(7);
		Curso java = new Curso("java", 5, 1234, fecha, duracionDelCurso);
		Participante juan = new Participante("Juan", 18493526);
		assertEquals(resultadoEsperado, java.inscribirParticipante(juan));
		java.mostrarParticipante();

	}

//	@Test
//	void testMostrarParticipante() {

//		Curso java = new Curso("java", 5, 1234);
//		java.mostrarParticipante();
//	}
//
}
