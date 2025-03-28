package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroDeMesa;
    private List<ItemMenu> bebidas = new ArrayList<>();
    private List<ItemMenu> comidas= new ArrayList<>();
    private int precioTotalBebidas;
    private int precioTotalComidas;
    private boolean estadoDelPago = false;



    public Pedido(int numeroDeMesa) {
        this.numeroDeMesa = numeroDeMesa;
    }

    public int consultarMesa() {
        return this.numeroDeMesa;
    }

    public void agregarComida(ItemMenu comida) {
        this.precioTotalComidas += comida.obtenerCosto();
        this.comidas.add(comida);
    }

    public void agregarBebida(ItemMenu bebida) {
        this.precioTotalBebidas += bebida.obtenerCosto();
        this.bebidas.add(bebida);
    }

    public boolean estaPago() {
        return this.estadoDelPago;
    }

    public float calcularCostoTotalBebidas () {

        return precioTotalBebidas;
    }

    public float calcularCostoTotalComidas() {
        return precioTotalComidas;
    }

}



