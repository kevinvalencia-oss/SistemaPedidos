package com.pedidos;

public class SistemaPedidos {

    private static SistemaPedidos instancia;

    private SistemaPedidos() {}

    public static SistemaPedidos getInstancia() {
        if (instancia == null) {
            instancia = new SistemaPedidos();
        }
        return instancia;
    }

    public void iniciar() {
        System.out.println("= SISTEMA DE PEDIDOS INICIADO =");
    }
}