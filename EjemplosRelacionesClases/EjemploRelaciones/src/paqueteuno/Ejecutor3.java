/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author User
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        
        String marca = "Toshiba";
        double costo = 500.2;
        
        UnidadDVD unidad = new UnidadDVD(marca, costo);
        
        String procesador = "Intel"; 
        
        
        Computadora computadora = new Computadora(procesador, unidad);
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n"
                + "Costo de Unidad DVD: %.2f\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca(),
                computadora.obtenerUnidadDvd().obtenerCosto());
        
    }

}
