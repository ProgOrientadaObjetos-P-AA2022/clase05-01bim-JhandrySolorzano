/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author User
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        // 1. Crear una persona de barrio el valle de la cuidad de loja 
        // 2. Crear una persona del barrio central de la ciudad de Cuenca
        // 3. Crear una persona del barrio centenario de la ciudad de Guayaquil 
        
         Ciudad ciudad1 = new Ciudad("Loja");
         Ciudad ciudad2 = new Ciudad("Cuenca");
         Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        Barrio barrio1 = new Barrio("El Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3= new Barrio("Centenario" , ciudad3); 
        
        Persona persona1 = new Persona("Jhandry Solorzano", "1105901902", barrio1);
        Persona persona2 = new Persona("Pablo Carrion", "1105908071", barrio2);
        Persona persona3 = new Persona("Pedro Sanchez", "110516586", barrio3);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        persona2.establecerBarrio(barrio2);
       
          System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),persona1.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
       persona3.establecerBarrio(barrio3);
         System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerNombre(),persona1.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
    }
    
    
    
}
