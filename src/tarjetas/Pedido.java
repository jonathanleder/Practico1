package tarjetas;

import java.util.ArrayList;

public class Pedido {
//Lista de platos y lista de bebidas

	private ArrayList<Bebida> bebidas;
	private ArrayList<Plato> platos;

	public Pedido(Plato unPlato, Bebida unaBebida) {
		platos = new ArrayList<Plato>();
		bebidas = new ArrayList<Bebida>();
		platos.add(unPlato);
		bebidas.add(unaBebida);
	}

	public void agregarBebida(Bebida unaBebida) {
		this.bebidas.add(unaBebida);
	}

	public void agregarPlato(Plato unPlato) {
		this.platos.add(unPlato);
	}

	public void agregarCombo(Bebida unaBebida, Plato unPlato) {
		this.bebidas.add(unaBebida);
		this.platos.add(unPlato);
	}

	public double importeBebida() {
		double total = 0;
		for (Bebida bebida : bebidas) {
			total += bebida.importe();
		}
		return total;
	}

	public double importePlato() {
		double total = 0;
		for (Plato plato : platos) {
			total += plato.importe();
		}
		return total;
	}

	public double importeTotal() {
		return importeBebida() + importePlato();
	}

	public double calcularPropina(double porcentaje) {
		System.out.println("Propina retorna: " + (importeTotal() * (porcentaje / 100)));
		return importeTotal() * (porcentaje / 100);
	}

}
