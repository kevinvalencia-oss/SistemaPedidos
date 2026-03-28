package com.pedidos;

public class PedidoService {

    public double calcularTotal(Pedido pedido) {
        return pedido.getProductos()
                .stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    public void mostrarPedido(Pedido pedido) {

        if (pedido.getProductos().isEmpty()) {
            System.out.println("Pedido vacio.");
            return;
        }

        for (int i = 0; i < pedido.getProductos().size(); i++) {
            Producto p = pedido.getProductos().get(i);
            System.out.println((i + 1) + ". " + p.getNombre() + " $" + p.getPrecio());
        }
    }
}