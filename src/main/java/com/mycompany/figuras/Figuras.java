

package com.mycompany.figuras;

public abstract class Figuras {

   public abstract double calcularArea();
   
   public static void Saludo(){
       System.out.println("Hola, soy la clase abstracta figura");
   }
 
   public void mostrar(){
       System.out.println("");
   }
   
   public void mostrar(String unidades){
       System.out.println("");
   }
    
}
