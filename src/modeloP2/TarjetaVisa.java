package modeloP2;

public class TarjetaVisa extends Tarjeta {

	public TarjetaVisa(String titular, int numeroTarjeta, double saldo) {
		super(titular, numeroTarjeta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularImporte(Bebida unaBebida, Plato unPlato) {
		double descuento = unaBebida.importe() * 0.03;// 3% sobre las bebidas
		return (unaBebida.importe() + unPlato.importe()) - descuento;
	}

}
