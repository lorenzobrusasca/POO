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
/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/

public class Rectangulo {
    
    private int base;
    private int altura;
    Scanner leer = new Scanner (System.in);

    public Rectangulo() {
    }
 
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    
    
    
    
    public void crearRectangulo()
    {
        System.out.println("Ingrese el tamaño de la base:");
        base = leer.nextInt();
        System.out.println("Ingrese el tamaño de la altura:");
        altura = leer.nextInt();
        
        }
    
    public void calculaSuperf()
    {
        System.out.println("La superficie del rectángulo es: " + (base*altura));
    
    }
    
    public void calculaPerime()
    {
        System.out.println("El perímetro del rectángulo es: " + (2*(base*altura)));
    
    }
    
    public void dibujaRect()
    {
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
        
        for (int i = 0; i < altura-2; i++) {
            System.out.print("*");
            for (int j = 0; j < base-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        
        
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        
    }
    
}
