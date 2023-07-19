/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*    /*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html*/

public class PuntosService {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    Puntos P1 = new Puntos();
    
    public void crearPuntos()
            
    {
        System.out.println("Ingrese los puntos en el siguiente orden:\nX1\nY1\nX2\nY2");
        P1.setX1(leer.nextInt());
        P1.setY1(leer.nextInt());
        P1.setX2(leer.nextInt());
        P1.setY2(leer.nextInt());
        
    }
    
     public double calcularDistancia()
     {
         
         double distancia = Math.sqrt(Math.pow((P1.getX2()-P1.getX1()),2)+Math.pow((P1.getY2()-P1.getY1()),2));
        //d(P1,P2)=√(x2−x1)2+(y2−y1)2
        
         System.out.println("La distancia entre los puntos es: "+distancia);
         
        return distancia;
        
        
         
     }
        
    }
    
    

