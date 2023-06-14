/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooguiaintro;

import Entidad.Persona;

/**
 *
 * @author Lorenzo
 */
public class PooGuiaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona primerPersona = new Persona("Lorenzo","Brusasca",1);
        Persona segundaPersona = new Persona("Florencia","Juarez",2);
        
        System.out.println(primerPersona.nombre+" "+primerPersona.apellido+" "+segundaPersona.nombre+" "+segundaPersona.apellido);
        
        
        
    }
    
}
