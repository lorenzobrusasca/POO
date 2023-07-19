/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b*/


public class RaicesService {
    
    Scanner leer = new Scanner (System.in);
    Raices R1 = new Raices();
    double discriminante;
    
    /*Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor*/
    public void InsertarValores()
    {
        System.out.println("Ingrese los valores de a,b,c en ese orden");
        R1.setA(leer.nextDouble());
        R1.setB(leer.nextDouble());
        R1.setC(leer.nextDouble());
          
    }
    
    /*Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c*/
    
    public double getDiscriminante()
    {
        discriminante = Math.pow(R1.getB(),2)-4*R1.getA()*R1.getC();
        
        System.out.println("El discriminante es = "+discriminante);
        
        return discriminante;
        
    }
    
    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    
    public boolean tieneRaices()
    {
        boolean tieneDosSoluc;
        
        tieneDosSoluc = discriminante>=0;
        
        System.out.println("Tiene dos soluciones?: "+ tieneDosSoluc);
        
        return tieneDosSoluc;
    }
    
    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.*/
    
    
    public boolean tieneRaiz()
    {
    
         boolean tieneUnaSoluc;
        
        tieneUnaSoluc = discriminante==0;
        
        System.out.println("Tiene una solucion?: "+ tieneUnaSoluc);
        
        return tieneUnaSoluc;
        
    }
    
    
    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.*/
   
    public void obtenerRaices()
    {
        
        if (tieneRaices()) {
            System.out.println("Las 2 posibles soluciones son:\n"+(-R1.getB()+Math.sqrt((Math.pow(R1.getB(), 2)-(4*R1.getA()*R1.getC())))/(2*R1.getA()))+"\n"+(-R1.getB()-Math.sqrt((Math.pow(R1.getB(), 2)-(4*R1.getA()*R1.getC())))/(2*R1.getA()))); 
                                                                                                    //(-b±√((b^2)-(4*a*c)))/(2*a)
        }
    
        
        
    }
    
    
    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.*/
    
    public void obtenerRaiz()
            
    {
        if (tieneRaiz()) {
            System.out.println((-R1.getB()+Math.sqrt((Math.pow(R1.getB(), 2)-(4*R1.getA()*R1.getC())))/(2*R1.getA()))+"\n"+(-R1.getB()-Math.sqrt((Math.pow(R1.getB(), 2)-(4*R1.getA()*R1.getC())))/(2*R1.getA())));
        }
    
    }
    
    
}
