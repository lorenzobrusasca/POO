/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */

/* Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/

public class PersonaService {
    
    Scanner leer = new Scanner (System.in);
    
    int edad;
    
    Persona P1 = new Persona();
    
    public void crearPersona()
    {
        
        System.out.println("Ingrese el nombre de la persona");
        P1.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la fecha de nacimiento");        
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        
        Date fechaNac = new Date( anio -1900, mes-1,dia);
    
        P1.setFechaNac(fechaNac);
        
        System.out.println("");
        
        System.out.println("El nombre es: "+ P1.getNombre() + "\nLa fecha de nacimiento es: " + P1.getFechaNac().getDate()+"/"+P1.getFechaNac().getMonth()+"/"+(P1.getFechaNac().getYear()+1900));
                
    }
    
    public int calcularEdad()
    {
        
        
        edad = (new Date().getYear()+1900) - (P1.getFechaNac().getYear()+1900);
        
        System.out.println("La edad de la persona es: "+edad+ " años.");
        P1.setEdad(edad);
        
        return edad;
        
        
        
    }
    
    /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.*/
    
        
    public boolean menorQue(int edad)
    {
        
        if (edad<P1.getEdad()) {
            return true;
        }
        else {return false;}
        
        
    }
    
    /*Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
    
    public void mostrarPersona()
            
    {
    
        System.out.println("Nombre: "+P1.getNombre()+"\nFecha de nacimiento: "+P1.getFechaNac()+"\nEdad: "+P1.getEdad());
        
    }
    
    
}
