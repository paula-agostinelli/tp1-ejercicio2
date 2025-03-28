package org.example;

public class Propina {
    public static final Propina BAJO = new Propina(0.02F);
    public static final Propina MEDIO = new Propina(0.03F);
    public static final Propina ALTO = new Propina(0.05F);
    private final float porcentajeDelTotal;

    Propina(float porcentajeDelTotal) {
        this.porcentajeDelTotal = porcentajeDelTotal;
    }

    public float porcentaje() {
        return porcentajeDelTotal;
    }
}
