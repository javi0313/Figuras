
package com.mycompany.figuras;


public class Circulo extends Figuras {
    private double radio;
    private static double pi = 3.1416;

    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = 0;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        return this.pi * (this.radio * this.radio);
    }
    
    public void mostrar(){
        System.out.println("Area del circulo:  " + calcularArea());
    }
    
    public void mostrar(String unidad){
        System.out.println("Area del circulo: " + calcularArea() + " " + unidad );
    }

   
}
