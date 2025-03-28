package org.example;

public class ItemMenu {
    private String tipo;
    private int costo;
    public static final String PRECIO_INVALIDO = "El precio no puede ser negativo";
    public static final String DESCRIPCION_VACIA = "La descripción no puede ser vacía";
    public static final String DESCRIPCION_LARGA = "La descripción no puede tener más de 150 caracteres";


    public ItemMenu(String tipo, int costo) {
        checkDescripcionIsValid (tipo);
        checkCostoIsValid (costo);
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int obtenerCosto() {
        return this.costo;
    }

    private void checkDescripcionIsValid(String tipo) {

        if (tipo.isBlank()) {
            throw new RuntimeException(DESCRIPCION_VACIA);
        }

        if (tipo.length() > 150) {
            throw new RuntimeException(DESCRIPCION_LARGA);
        }
    }
    private void checkCostoIsValid (int costo){
        if (costo < 0) {
            throw new RuntimeException(PRECIO_INVALIDO);
        }
        }

    }
