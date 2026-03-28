package com.pedidos;

import java.util.ArrayList;
import java.util.List;

public class ProductoFactory {

    public static List<Producto> obtenerCatalogo() {

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Pizza", 20000));
        productos.add(new Producto("Hamburguesa", 15000));
        productos.add(new Producto("Perro Caliente", 12000));
        productos.add(new Producto("Salchipapa", 14000));
        productos.add(new Producto("Arepa", 8000));
        productos.add(new Producto("Empanada", 3000));
        productos.add(new Producto("Gaseosa", 5000));
        productos.add(new Producto("Jugo Natural", 7000));
        productos.add(new Producto("Pollo Asado", 25000));
        productos.add(new Producto("Sushi", 30000));

        return productos;
    }
}