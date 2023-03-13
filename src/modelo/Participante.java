package modelo;

public class Participante {
	// --- Atributos ---
	String nombre;
	int dni;
	int puntos;

	// --- Constructor/es ---

	public Participante(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.puntos = 0;
	}

	// --- Metodos ---

	public void sumarPuntos(int puntos) {
		this.puntos += puntos;
	}

	public int getPuntaje() {
		return this.puntos;
	}

}
