package com.pedidos;

public class Cliente extends Usuario {

    private String direccion;

    public Cliente(String nombre, String email, String direccion) {
        super(nombre, email);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}