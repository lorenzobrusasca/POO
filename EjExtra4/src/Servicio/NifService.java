/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class NifService {
    
    
    Scanner leer = new Scanner (System.in);
    NIF n1 = new NIF();
    String letraCorresp="";
    
    public void crearNif()
    {
        
        System.out.println("Ingrese su DNI");
        n1.setDNI(leer.nextLong());
        
        long calculo = n1.getDNI()%23;
        
        System.out.println("\nEl calculo es:"+calculo+"\n");
        
        String[] caracteres = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
       
        
        for (int i = 0; i < caracteres.length; i++) {
            if (calculo==i) {
                letraCorresp = caracteres[i];
            }
          
        }
        
        System.out.println("La letra correspondiente es:"+letraCorresp+"\n");
    }
    
    public void mostrar()
    {
        System.out.println("El NIF es:\n"+n1.getDNI()+"-"+letraCorresp);
    
    
    }
    
}
