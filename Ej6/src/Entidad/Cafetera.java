/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/

public class Cafetera {
    
    Scanner leer = new Scanner (System.in);
    
    int capacidadMaxima=1000;
    int cantidadActual;
    
    

    //constructor vacío
    public Cafetera() {
    }
    
    //constructor con capacidad máxima y cant actual

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    //getters

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
    
    //setters

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    /*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.*/
    public void llenarCafetera()
    {
        cantidadActual = capacidadMaxima;
    }
    
   /*Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.*/
    
    public void servirTaza(int tamañoTaza)
    {
        
        System.out.println("Sirviendo taza ...");
        if (tamañoTaza>cantidadActual) {
            tamañoTaza = cantidadActual;
            System.out.println("No alcanzó para llenar la taza");
            System.out.println("La taza quedó con "+tamañoTaza+"ml");
            cantidadActual = 0;
        }
        else   {System.out.println("Se llenó la taza");
                cantidadActual = cantidadActual-tamañoTaza;
                System.out.println("La cantidad actual es: "+cantidadActual);
        }
 
    }
    
   // Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera()
    {
    cantidadActual = 0;
    }
    
   /* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
    
    public void agregarCafe(int agrega)
    {
        cantidadActual = cantidadActual + agrega;
        System.out.println("La cantidad actual es: "+cantidadActual);
    
    }
    
}
