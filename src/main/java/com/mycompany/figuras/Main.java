/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String [] args){

         Figuras.Saludo();
         
         Figuras ci = new Circulo(5.0);
         Figuras cu = new Cuadrado(4.0);
         
         ci.calcularArea();
         cu.calcularArea();
         
         ci.mostrar();
         ci.mostrar("cm2");
         cu.mostrar();
         cu.mostrar("m2");
         
    }
}
