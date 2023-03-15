package modeloP2;

public class Mesa {

	private int capacidad;
	public Bebida bebidas;
	public Plato platos;

	public Mesa(int capacidad, Bebida bebida, Plato plato) {
		this.capacidad = capacidad;
		this.bebidas = bebida;
		this.platos = plato;
	}

}
