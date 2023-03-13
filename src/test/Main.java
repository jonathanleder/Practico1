package test;

import java.time.LocalDate;

import modelo.Curso;
import modelo.Participante;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate fecha = LocalDate.now().plusDays(-1);
		Curso java = new Curso("java", 5, 1234, fecha, 10);
		Participante juan = new Participante("Juan", 18493526);
		java.inscribirParticipante(juan);
		java.mostrarParticipante();

	}

}
