package org.example;

import java.time.YearMonth;

public class ComarcaPlus extends TarjetaDeCredito {
    private final float descuento;

    public ComarcaPlus(String numeroDeTarjeta, String titular, YearMonth fechaVencimiento) {
        super(numeroDeTarjeta, titular,fechaVencimiento);
        this.descuento = 0.02F;
    }

    @Override
    public float aplicarDescuento(float totalBebidas, float totalPlatos) {
        float total = totalBebidas + totalPlatos;
        return total - (total * descuento);
    }
}

