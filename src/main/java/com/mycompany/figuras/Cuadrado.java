package com.mycompany.figuras;


public class Cuadrado extends Figuras {
    private double lado;

    
    public Cuadrado(double lado) {
        this.lado = lado;
    }


    public Cuadrado() {
        this.lado = 0;
    }

    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    public void mostrar() {
        System.out.println("area del cuadrado: " + calcularArea());
    }

        
    public void mostrar(String unidad) {
        System.out.println("area del cuadrado: " + calcularArea() + " " + unidad);
    }
}