package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tarjetas.Bebida;
import tarjetas.DispositivoElectronico;
import tarjetas.Pedido;
import tarjetas.Plato;
import tarjetas.TarjetaComarcaPlus;

class TarjetaTest {

	@Test
	void testTarjetaComarcaPlus() {
		double valorEsperado = 824;// 824 es el costo total 26
		Plato ravioles = new Plato("Ravioles con tuco", 500);
		Bebida gaseosa = new Bebida("Fanta", 300);
		Pedido miPedido = new Pedido(ravioles, gaseosa);
		TarjetaComarcaPlus comarca = new TarjetaComarcaPlus("Jonathan Leder", 456123789, 850);

		DispositivoElectronico miDispositivo = new DispositivoElectronico(miPedido);
		double esperado = miDispositivo.calcularCostoTotal(comarca, 5);
		System.out.println("Esperado vale: " + esperado);
		assertEquals(valorEsperado, miDispositivo.calcularCostoTotal(comarca, 5));
	}
//
//	@Test
//	void testTarjetaMasterCard() {
//		double valorEsperado = 20.0;// 830 es el costo total
//		Plato ravioles = new Plato("Ravioles con tuco", 500);
//		Bebida gaseosa = new Bebida("Fanta", 300);
//		Pedido miPedido = new Pedido(ravioles, gaseosa);
//		TarjetaMastercard master = new TarjetaMastercard("Jonathan Leder", 456123789, 850);
//
//		master.pagar(miPedido, -1);
//
//		assertEquals(valorEsperado, master.saldoDisponible());
//	}
//
//	@Test
//	void testTarjetaVisa() {
//		double valorEsperado = 19.0;// 831 es el costo total
//		Plato ravioles = new Plato("Ravioles con tuco", 500);
//		Bebida gaseosa = new Bebida("Fanta", 300);
//		Pedido miPedido = new Pedido(ravioles, gaseosa);
//		TarjetaVisa visa = new TarjetaVisa("Jonathan Leder", 456123789, 850);
//
//		visa.pagar(miPedido, 5);
//
//		assertEquals(valorEsperado, visa.saldoDisponible());
//	}
//
//	@Test
//	void testTarjetaViedma() {
//		double valorEsperado = 10.0;// 840 es el costo total
//		Plato ravioles = new Plato("Ravioles con tuco", 500);
//		Bebida gaseosa = new Bebida("Fanta", 300);
//		Pedido miPedido = new Pedido(ravioles, gaseosa);
//		TarjetaViedma viedma = new TarjetaViedma("Jonathan Leder", 456123789, 850);
//		viedma.pagar(miPedido, 5);
//		assertEquals(valorEsperado, viedma.saldoDisponible());
//	}

}
