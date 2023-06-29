/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        PersonaService servicioPersona = new PersonaService();
        
        servicioPersona.crearPersona();
        
        servicioPersona.calcularEdad();
        
        System.out.println("Ingrese la edad a comparar");
        int edadIng = leer.nextInt();
        
        servicioPersona.menorQue(edadIng);
        
        System.out.println("La edad ingresada es menor que la edad de la persona? "+servicioPersona.menorQue(edadIng));
        
        servicioPersona.mostrarPersona();
        
    }
    
}
