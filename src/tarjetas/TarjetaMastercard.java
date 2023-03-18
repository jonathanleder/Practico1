package tarjetas;

public class TarjetaMastercard extends Tarjeta {

	public TarjetaMastercard(String titular, int numeroTarjeta, double saldo) {
		super(titular, numeroTarjeta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pagar(Pedido unPedido, int porcentajePropina) {
		if (porcentajePropina >= 0) {
			this.saldo -= calcularCosto(unPedido, porcentajePropina);
		} else
			throw new RuntimeException("No puede ingresar valores negativos");
	}

	@Override
	public double calcularDescuento(Pedido unPedido, int porcentajePropina) {
		if (porcentajePropina >= 0) {
			double descuento = unPedido.importePlato() * 0.02;// 2% sobre los platos
			double propina = this.calcularPropina(unPedido.importeTotal(), porcentajePropina);
			return unPedido.importeTotal() - descuento + propina;
		} else
			throw new RuntimeException("No se puede calcular con porcentajes negativos");
	}

}
