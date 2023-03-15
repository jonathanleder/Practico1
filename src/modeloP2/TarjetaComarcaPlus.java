package modeloP2;

public class TarjetaComarcaPlus extends Tarjeta {

	public TarjetaComarcaPlus(String titular, int numeroTarjeta, float saldo) {
		super(titular, numeroTarjeta, saldo);
	}

	@Override
	protected double calcularImporte(Bebida unaBebida, Plato unPlato) {
		// TODO Auto-generated method stub 2% descuento al total
		double descuento = (unaBebida.importe() + unPlato.importe()) * 0.02;
		return (unaBebida.importe() + unPlato.importe()) - descuento;

	}

}
