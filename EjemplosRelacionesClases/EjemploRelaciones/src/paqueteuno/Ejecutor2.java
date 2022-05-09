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
public class Ejecutor2 {
    public static void main(String[] args) {
        // se crea un de tipo UnidadDVD
        String marca = "Toshiba";
        UnidadDVD unidad = new UnidadDVD(marca);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";
        
        Computadora computadora = new Computadora(procesador, unidad);
        
        String varible_marca = computadora.obtenerTipoProcesador();
        UnidadDVD varible_unidad = computadora.obtenerUnidadDvd();
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca());
        
         UnidadDVD unidad2 = new UnidadDVD("Sony"); 
         computadora.establecerUnidadDvd(unidad2);
         
          System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca());
         
    }
}
