package org.example;

import java.time.YearMonth;

public class Mastercard extends TarjetaDeCredito {
    private final float descuento;

    public Mastercard (String numeroDeTarjeta, String titular, YearMonth fechaVencimiento) {
        super(numeroDeTarjeta, titular, fechaVencimiento);
        this.descuento = 0.02F;
    }

    @Override
    public float aplicarDescuento(float totalBebidas, float totalPlatos) {
        return totalBebidas + (totalPlatos - (totalPlatos * descuento));
    }

}
