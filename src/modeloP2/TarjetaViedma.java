package modeloP2;

public class TarjetaViedma extends Tarjeta {

	public TarjetaViedma(String titular, int numeroTarjeta, double saldo) {
		super(titular, numeroTarjeta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularImporte(Bebida unaBebida, Plato unPlato) {

		return unaBebida.importe() + unPlato.importe();
	}

}
