package tarjetas;

public class TarjetaVisa extends Tarjeta {

	public TarjetaVisa(String titular, int numeroTarjeta, double saldo) {
		super(titular, numeroTarjeta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pagar(Pedido unPedido, int porcentajePropina) {
		this.saldo -= calcularCosto(unPedido, porcentajePropina);
	}

	@Override
	public double calcularDescuento(Pedido unPedido, int porcentajePropina) {
		double descuento = unPedido.importeBebida() * 0.03;// 3% sobre las bebidas
		double propina = this.calcularPropina(unPedido.importeTotal(), porcentajePropina);
		return unPedido.importeTotal() - descuento + propina;
	}

}
