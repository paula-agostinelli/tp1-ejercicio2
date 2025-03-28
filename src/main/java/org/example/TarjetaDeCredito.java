package org.example;

import java.time.YearMonth;

public abstract class TarjetaDeCredito {
    public static final String NUMERO_VACIO = "El número no puede ser vacío";
    public static final String NUMERO_TARJETA_NO_VALIDO = "El número debe tener 16 dígitos";
    public static final String TITULAR_VACIO = "El titular no puede ser vacío";
    public static final String FECHA_EXPIRACION_DEBE_SER_FUTURA = "La tarjeta está vencida";
    private String numeroDeTarjeta;
    private YearMonth fechaVencimiento;
    private String titular;


    public TarjetaDeCredito(String numeroDeTarjeta, String titular, YearMonth fechaVencimiento ) {
        checkNumberoValido(numeroDeTarjeta);
        checkTituloNotBlank(titular);
        checkExpiracion(fechaVencimiento);
        this.titular= titular;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.fechaVencimiento = fechaVencimiento;

    }

    private void checkExpiracion(YearMonth fechaVencimiento) {
        if (fechaVencimiento.isBefore(YearMonth.now())) {
            throw new RuntimeException(FECHA_EXPIRACION_DEBE_SER_FUTURA);
        }
    }

    private void checkTituloNotBlank(String titular) {
        if (titular.isBlank()) {
            throw new RuntimeException(TITULAR_VACIO);
        }
    }

    private void checkNumberoValido(String numeroDeTarjeta) {
        if (numeroDeTarjeta.isBlank()) {
            throw new RuntimeException(NUMERO_VACIO);
        }
        if (numeroDeTarjeta.length() != 16) {
            throw new RuntimeException(NUMERO_TARJETA_NO_VALIDO);
        }
    }

    public abstract float aplicarDescuento(float totalBebidas, float totalPlatos);
}


