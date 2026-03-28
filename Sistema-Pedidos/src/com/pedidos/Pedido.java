package com.pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void eliminarProducto(int indice) {
        if (indice >= 0 && indice < productos.size()) {
            productos.remove(indice);
            System.out.println("Producto eliminado ");
        } else {
            System.out.println("Indice invalido ");
        }
    }
}