/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.MesesDelAnio;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!*/

public class MesesService {

    Scanner leer = new Scanner (System.in);
    MesesDelAnio M1 = new MesesDelAnio();
    
    
    public void adivinarMes()
    {
        
       String mesIng;
        
       System.out.println("Adivine el mes secreto, ingrese el mes en minúsculas");
       
        do{
             
        mesIng = leer.next();
        if (mesIng.equals(M1.getMesSecreto())) {
            System.out.println("Felicitaciones! Adivinaste.");}
        else {System.out.println("El mes ingresado es incorrecto, vuelva a ingresar el mes");
              }
            }
        while (!mesIng.equals(M1.getMesSecreto()));
        
        
        }
        
        
    }
    

