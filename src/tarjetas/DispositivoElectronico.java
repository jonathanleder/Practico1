package tarjetas;

public class DispositivoElectronico {

	private Pedido pedido;

	public DispositivoElectronico(Pedido unPedido) {
		this.pedido = unPedido;
	}

	public double calcularCostoTotal(Tarjeta unaTarjeta, double propina) {
		double descuento = unaTarjeta.calcularDescuento(pedido.importeBebida(), pedido.importePlato());
		System.out.println("descuento retorna: " + descuento);
		return pedido.importeTotal() + pedido.calcularPropina(propina) - descuento;
	}

}
