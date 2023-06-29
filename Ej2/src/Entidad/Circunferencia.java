/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Lorenzo
 */
/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/

//se declara la clase circunferencia
public class Circunferencia {
    
    //atributo privado de tipo real radio
    private double radio;

    //a) Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
     //b) Método set
    public  void setRadio(double radio) {
        this.radio = radio;
    }
    //b) Método get
    public  double getRadio() {
        return radio;
    }
   
    
    
    
    
}
