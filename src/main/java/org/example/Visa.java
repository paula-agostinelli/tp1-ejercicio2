package org.example;

import java.time.YearMonth;

public class Visa extends TarjetaDeCredito {
    private final float descuento;

    public Visa(String numeroDeTarjeta, String titular, YearMonth fechaVencimiento) {
        super(numeroDeTarjeta,
                titular,
                fechaVencimiento);
        this.descuento = 0.03F;
    }

    @Override
    public float aplicarDescuento(float totalBebidas, float totalPlatos) {
        return totalPlatos + (totalBebidas - (totalBebidas * descuento));
    }


}
