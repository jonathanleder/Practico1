package modeloP2;

public class Plato {

	private String nombre;
	private float precio;

	public Plato(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public float importe() {
		return this.precio;
	}

	public void detallePlato() {
		this.toString();
	}
}
