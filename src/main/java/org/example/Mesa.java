package org.example;

public class Mesa {
    private int capacidad;
    private int numeroDeMesa;
    private Pedido pedido;
    private Menu menu;
    private int costoTotal;


    public Mesa(int capacidad, Menu menu, int numeroDeMesa) {
        this.capacidad = capacidad;
        this.menu = menu;
        this.numeroDeMesa = numeroDeMesa;
        this.pedido = new Pedido(this.numeroDeMesa);
    }

    public int getCapacidads() {
        return this.capacidad;
    }

    public Menu consultarMenu() {
        return this.menu;
    }

    public void agregarBebidaAlPedido(ItemMenu bebida) {
        this.pedido.agregarBebida(bebida);
    }

    public void agregarComidaAlPedido(ItemMenu comida) {
        this.pedido.agregarComida(comida);
    }

    public Pedido consultarPedido() {
        return this.pedido;
    }

    public float precioTotalConDescuento(TarjetaDeCredito tarjeta, Propina propina) {
        float totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularCostoTotalBebidas(), pedido.calcularCostoTotalComidas());
        return totalConDescuento + (totalConDescuento * propina.porcentaje());
    }


}
