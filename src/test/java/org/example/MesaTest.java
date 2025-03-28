package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.YearMonth;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MesaTest {

    @Test
    public void montoTotalConVisa() {
        var menu = new Menu();
        var mesa = new Mesa(8,menu,7);
        var itemMenu1 = new ItemMenu("Coca Cola", 100);
        var itemMenu2 = new ItemMenu("Pizza", 200);
        mesa.agregarBebidaAlPedido(itemMenu1);
        mesa.agregarComidaAlPedido(itemMenu2);
        var tarjeta = new Visa("1234567890123456", "Juan Perez", YearMonth.now().plusMonths(10));

        float actual = mesa.precioTotalConDescuento(tarjeta, Propina.BAJO);

        assertEquals(302.94f, actual, 0.01f);
    }

    @Test
    public void montoTotalConMastercard() {
        var menu = new Menu();
        var mesa = new Mesa (3,menu,4);
        var itemMenu1 = new ItemMenu("Coca Cola", 100);
        var itemMenu2 = new ItemMenu("Pizza", 200);
        mesa.agregarBebidaAlPedido(itemMenu1);
        mesa.agregarComidaAlPedido(itemMenu2);

        var tarjeta = new Mastercard("1234567890123456", "Juan Perez", YearMonth.now().plusMonths(10));

        assertEquals(310.8f, mesa.precioTotalConDescuento(tarjeta, Propina.ALTO), 0.01f);  // Verifica el cálculo con la propina
    }

    @Test
    public void montoTotalConComarcaPlus() {
        var menu = new Menu();  // Suponiendo que tienes un objeto Menu que maneja los ítems del menú
        var mesa = new Mesa(5, menu,3);
        var itemMenu1 = new ItemMenu("Coca Cola", 100);
        var itemMenu2 = new ItemMenu("Pizza", 200);
        mesa.agregarBebidaAlPedido(itemMenu1);
        mesa.agregarComidaAlPedido(itemMenu2);
        var tarjeta = new ComarcaPlus("1234567890123456", "Juan Perez", YearMonth.now().plusMonths(10));

        assertEquals(308.7f, mesa.precioTotalConDescuento(tarjeta, Propina.ALTO), 0.01f);  // Verifica el cálculo con la propina
    }

    @Test
    public void montoTotalConViedma() {
        var menu = new Menu();
        var mesa = new Mesa (8,menu,5);
        var itemMenu1 = new ItemMenu("Coca Cola", 100);
        var itemMenu2 = new ItemMenu("Pizza", 200);
        mesa.agregarBebidaAlPedido(itemMenu1);
        mesa.agregarComidaAlPedido(itemMenu2);

        var tarjeta = new SinDescuento("1234567890123456", "Juan Perez", YearMonth.now().plusMonths(10));
        assertEquals(309.0f, mesa.precioTotalConDescuento(tarjeta, Propina.MEDIO), 0.01f);  // Verifica el cálculo con la propina
    }
}