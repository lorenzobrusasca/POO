/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;

/**
 *
 * @author Lorenzo
 */
/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.

Luego, el arreglo A se debe ordenar de menor a mayor 

y copiar los primeros 10 números

ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/
public class Ej10Service {
    
    public double [] array1 = new double [50];
    public double [] array2 = new double [20];
    
    public void crearArreglo()
    {
        for (int i = 0; i < 50; i++) {
            
            array1 [i] = (int)(Math.random() * 100);
            
            System.out.print(array1[i]+" ");
            
        }
        System.out.println("");
    }  
     public void ordenarArreglo()
     {
         Arrays.sort(array1);
         
         for (int i = 0; i < 50; i++) {
             System.out.print(array1[i]+" ");
         }
         System.out.println("");
     }
     public void copiaNumeros()
     {
         for (int i = 0; i < 10; i++) 
         {
             array2[i] = array1[i];
             
             System.out.print(array2[i]+" ");
         }
         
          
         
     }
     
     public void rellenaNumeros()
     {
         for (int i = 10; i < 20; i++) {
             array2[i] = 0.5;
             
             System.out.print(array2[i]+" ");
         }
     
     }
             
    }
    

