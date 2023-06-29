/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo;

import Entidad.Auto;

/**
 *
 * @author Lorenzo
 */
public class EjPoo {

    /* public String marca;
    public String modelo;
    public int anio;
    public boolean nuevo;
    public int km;*/
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Auto auto1 = new Auto ("Fiat", "Punto", 2013, false, 93000);
        Auto auto2 = new Auto ("Renault", "Clio", 2013, false, 100000);
        
        System.out.println("Auto1\n"+auto1+"\nAuto2\n"+auto2);
        
        
    }
    
    
    
    
}
