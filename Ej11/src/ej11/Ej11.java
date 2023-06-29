/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    /*En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
       Date fechaIng;
       
        System.out.println("Introduzca el día, mes y año");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        
      fechaIng = new Date(anio -1900,mes,dia);
      
        System.out.println("La fecha ingresada es:"+fechaIng.getDay()+" "+fechaIng.getMonth()+" "+fechaIng.getYear());
        
        System.out.println("La cantidad de años de diferencia es: " + (new Date().getYear()-fechaIng.getYear()));
        
        
        
        
        
    }

  
    
}
