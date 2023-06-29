/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import Entidad.Persona;

/**
 *
 * @author Lorenzo
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    /*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        
        p1.crearPersona();
        
        if (p1.calcularIMC()==-1) {
            System.out.println("Bajo Peso");
        }
        else if (p1.calcularIMC()==0)
        {
            System.out.println("Its okay");
        }
        else if (p1.calcularIMC()==1)
        {   System.out.println("Sobre peso");}
        
        System.out.println("Es mayor de edad? "+p1.esMayorDeEdad());
        
        
        Persona p2 = new Persona();
        
        p2.crearPersona();
        
        if (p2.calcularIMC()==-1) {
            System.out.println("Bajo Peso");
        }
        else if (p2.calcularIMC()==0)
        {
            System.out.println("Its okay");
        }
        else if (p2.calcularIMC()==1)
        {   System.out.println("Sobre peso");}
        
        System.out.println("Es mayor de edad? "+p2.esMayorDeEdad());
        
        Persona p3 = new Persona();
        
        p3.crearPersona();
        
        if (p3.calcularIMC()==-1) {
            System.out.println("Bajo Peso");
        }
        else if (p3.calcularIMC()==0)
        {
            System.out.println("Its okay");
        }
        else if (p3.calcularIMC()==1)
        {   System.out.println("Sobre peso");}
        
        System.out.println("Es mayor de edad? "+p3.esMayorDeEdad());
        
        Persona p4 = new Persona();
        
        p4.crearPersona();
        
        if (p4.calcularIMC()==-1) {
            System.out.println("Bajo Peso");
        }
        else if (p4.calcularIMC()==0)
        {
            System.out.println("Its okay");
        }
        else if (p4.calcularIMC()==1)
        {   System.out.println("Sobre peso");}
        
        System.out.println("Es mayor de edad? "+p4.esMayorDeEdad());
        
        
        Persona p5 = new Persona();
        
        p5.crearPersona();
        
        if (p5.calcularIMC()==-1) {
            System.out.println("Bajo Peso");
        }
        else if (p5.calcularIMC()==0)
        {
            System.out.println("Its okay");
        }
        else if (p5.calcularIMC()==1)
        {   System.out.println("Sobre peso");}
        
              
        System.out.println("Es mayor de edad? "+ Persona.contMayorEdad);
        
       
        
    }
    
    
    
}
