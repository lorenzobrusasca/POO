/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/

public class AhorcadoService {
    
    
    Scanner leer = new Scanner(System.in);
    Ahorcado A1 = new Ahorcado();
    
    String palabraIng;
    
    
    
    public void crearJuego()
    {
        System.out.println("Ingrese una palabra y la cantidad de jugadas máxima");
        palabraIng = leer.next();
        A1.setCantJugadasMax(leer.nextInt());
        
        A1.setCantLetras(palabraIng.length());
        String [] arrayPalabra = new String [A1.getCantLetras()];
        
        for (int i = 0; i < A1.getCantLetras(); i++) {
            arrayPalabra [i]= palabraIng.substring(i, i+1);
             }
        
        A1.setPalabra(arrayPalabra);
        
        A1.setCantEncontradas(0);
        
       
    }
    
    public void longitud()
    {
        System.out.println("\nLa longitud de la palabra es: "+A1.getCantLetras());
    }
    
    public void buscar(String letra)
    {
        boolean Estaba=false;
        
    for (int i = 0; i < A1.getCantLetras(); i++) {
            if (A1.getPalabra()[i].equals(letra)) {
                System.out.println("\nLa letra estaba en la palabra") ;
                Estaba=true;
                break;
                
            }
            
        }
        
        if (Estaba==false) {
            System.out.println("\nLa letra no estaba");
        }
    
    }
    
    /*Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.*/
    
    public boolean encontradas(String letra)
    {
        boolean encontradas=false;
        
        for (int i = 0; i < A1.getCantLetras(); i++) {
            if (A1.getPalabra()[i].equals(letra)) {
                A1.setCantEncontradas(A1.getCantEncontradas()+1);
                encontradas=true;
            }
            
        }
        
        A1.setCantJugadasMax(A1.getCantJugadasMax()-1);
        System.out.println("La cantidad de letras encontradas es: "+A1.getCantEncontradas());
        System.out.println("Le faltan adivinar "+(A1.getCantLetras()-A1.getCantEncontradas()));    
        
        return encontradas;
    
    }
    
    public void intentos()
    {
        System.out.println("\nLe quedan "+A1.getCantJugadasMax()+" intentos");
    
    }
    
    /*Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
    
    public void juego()
    {
        crearJuego();
        longitud();
        String letra = "";
        String [] letrasIng = new String [A1.getCantJugadasMax()];
        int cont = 0;
        
        
        while(A1.getCantJugadasMax()>=1)
        {
        
        do{
        System.out.println("\nIngrese una letra a buscar");
         letra = leer.next();
         if (Arrays.asList(letrasIng).contains(letra)) {
                System.out.println("Usted ya ingresó esa letra, por favor ingrese otra");
            }
         else{break;}
         letrasIng [cont] = letra;
         cont = cont+1;
            
        }
        while(Arrays.asList(letrasIng).contains(letra));
        
        buscar(letra);
        encontradas(letra);
        intentos();
            if (A1.getCantEncontradas()==A1.getCantLetras()) {
                System.out.println("Felicitaciones! Encontró la palabra:\n"+Arrays.toString(A1.getPalabra()));
                break;
            }
               
        }
        
        if (A1.getCantJugadasMax()==0) {
            System.out.println("Se quedó sin intentos");
        }
        
    }
    
}
