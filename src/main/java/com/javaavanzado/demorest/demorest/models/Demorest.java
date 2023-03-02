package com.javaavanzado.demorest.demorest.models;

public class Demorest {
    private String nombre;
    private double numero;

    public Demorest(){}
    public Demorest(String nombre, double numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
}
