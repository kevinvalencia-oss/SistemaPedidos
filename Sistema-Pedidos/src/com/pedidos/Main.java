package com.pedidos;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SistemaPedidos sistema = SistemaPedidos.getInstancia();
        sistema.iniciar();

        Scanner sc = new Scanner(System.in);

        System.out.println(" REGISTRO CLIENTE ");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Direccion: ");
        String direccion = sc.nextLine();

        Cliente cliente = new Cliente(nombre, email, direccion);
        Pedido pedido = new Pedido();
        PedidoService service = new PedidoService();

        List<Producto> catalogo = ProductoFactory.obtenerCatalogo();

        int opcion = 0;

        do {
            System.out.println(" MENU ");

            for (int i = 0; i < catalogo.size(); i++) {
                Producto p = catalogo.get(i);
                System.out.println((i + 1) + ". " + p.getNombre() + " $" + p.getPrecio());
            }

            System.out.println((catalogo.size() + 1) + ". Ver Pedido");
            System.out.println((catalogo.size() + 2) + ". Total");
            System.out.println((catalogo.size() + 3) + ". Eliminar producto");
            System.out.println((catalogo.size() + 4) + ". Salir");

            System.out.print("Seleccione opcion: ");

            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida  Debe ingresar un número.");
                sc.nextLine(); // limpiar buffer
                opcion = -1;
                continue;
            }

            if (opcion >= 1 && opcion <= catalogo.size()) {
                pedido.agregarProducto(catalogo.get(opcion - 1));
                System.out.println("Producto agregado ");
                pausar(sc);
            }
            else if (opcion == catalogo.size() + 1) {
                service.mostrarPedido(pedido);
                pausar(sc);
            }
            else if (opcion == catalogo.size() + 2) {
                System.out.println("TOTAL: $" + service.calcularTotal(pedido));
                pausar(sc);
            }
            else if (opcion == catalogo.size() + 3) {

                service.mostrarPedido(pedido);

                System.out.print("Numero a eliminar: ");

                try {
                    int eliminar = sc.nextInt();
                    pedido.eliminarProducto(eliminar - 1);
                } catch (Exception e) {
                    System.out.println("Entrada invalida ");
                    sc.nextLine();
                }

                pausar(sc);
            }
            else if (opcion == catalogo.size() + 4) {
                System.out.println("Gracias por usar el sistema ");
            }
            else {
                System.out.println("Opcion invalida ");
                pausar(sc);
            }

        } while (opcion != catalogo.size() + 4);
    }

    public static void pausar(Scanner sc) {
        System.out.println("Presione ENTER para volver al menu...");
        sc.nextLine(); 
        sc.nextLine();
    }
}