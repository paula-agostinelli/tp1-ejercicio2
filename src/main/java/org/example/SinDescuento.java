package org.example;

import java.time.YearMonth;

public class SinDescuento extends TarjetaDeCredito {

    public SinDescuento(String numeroDeTarjeta, String titular, YearMonth fechaDeVencimiento ) {
        super(numeroDeTarjeta, titular, fechaDeVencimiento );
    }

    @Override
    public float aplicarDescuento(float totalBebidas, float totalPlatos) {
        return totalBebidas + totalPlatos;
    }
}
