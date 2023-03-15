package modeloP2;

public class TarjetaMastercard extends Tarjeta {

	public TarjetaMastercard(String titular, int numeroTarjeta, double saldo) {
		super(titular, numeroTarjeta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularImporte(Bebida unaBebida, Plato unPlato) {
		double descuento = unPlato.importe() * 0.02;// 2% sobre los platos
		return (unaBebida.importe() + unPlato.importe()) - descuento;
	}

}
