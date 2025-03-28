package org.example;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<ItemMenu> comidas;
    private List<ItemMenu> bebidas;

    public Menu() {
        bebidas = new ArrayList <ItemMenu>();
        comidas = new ArrayList<ItemMenu>();
    }

    public void agregarBebida(ItemMenu nuevaBebida) {
        this.bebidas.add(nuevaBebida);
    }

    public void agregarPlato(ItemMenu nuevaComida) {
        this.comidas.add(nuevaComida);
    }

    public List<ItemMenu> obtenerListaDeBebidas() {
        return List.copyOf(this.bebidas);
    }

    public List<ItemMenu> obtenerListaDePlatos() {
        return List.copyOf(this.comidas);
    }
}
