package modeloP2;

public abstract class Tarjeta {

	private int numTarjeta;
	private String titular;
	private double saldo;

	public Tarjeta(String titular, int numeroTarjeta, double saldo) {

		this.titular = titular;
		this.numTarjeta = numeroTarjeta;
		this.saldo = saldo;
	}

	public void pagar(Bebida unaBebida, Plato unPlato) {
		double importe = calcularImporte(unaBebida, unPlato);
		this.saldo -= (importe + calcularPropina(importe));

	}

	public double calcularPropina(double importe) {
		return importe * 0.05;
	}

	public void detallesTarjeta() {
		System.out.println("Titular: " + this.titular + "\nNumero de Tarjeta: " + this.numTarjeta);
	}

	protected abstract double calcularImporte(Bebida unaBebida, Plato unPlato);
}
