package modeloP2;

public class Bebida {
	private String nombre;
	private float precio;

	public Bebida(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public float importe() {
		return this.precio;
	}

	public void detalleBebida() {
		this.toString();
	}

}
