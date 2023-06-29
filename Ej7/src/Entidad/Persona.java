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
public class Persona {
    
    Scanner leer = new Scanner (System.in);
    
    private String nombre;
    private int edad;
    private String sexo;
    private double peso, altura;
    public static int contMayorEdad=0, contSobrepeso=0, contPesoIdeal=0, contBajoPeso=0;

        public void setContMayorEdad(int contMayorEdad) {
            this.contMayorEdad = contMayorEdad;
        }

        public void setContSobrepeso(int contSobrepeso) {
            this.contSobrepeso = contSobrepeso;
        }

        public void setContPesoIdeal(int contPesoIdeal) {
            this.contPesoIdeal = contPesoIdeal;
        }

        public void setContBajoPeso(int contBajoPeso) {
            this.contBajoPeso = contBajoPeso;
        }

        public int getContMayorEdad() {
            return contMayorEdad;
        }

        public int getContSobrepeso() {
            return contSobrepeso;
        }

        public int getContPesoIdeal() {
            return contPesoIdeal;
        }

        public int getContBajoPeso() {
            return contBajoPeso;
        }


    //Un constructor por defecto.
    public Persona() {
    }
    
    //Un constructor con todos los atributos como parámetro.

    public Persona(String nombre, int edad, String sexo, double peso, double altura, int contBajoPeso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.contBajoPeso = contBajoPeso;
        
    }
    
    //Métodos getters y setters de cada atributo.

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o*/
    
    public void crearPersona()
     {
        System.out.println("Ingrese los datos en el siguiente orden:\n1.Nombre\n2.Edad\n3.Sexo\n4.Peso\n5.Altura");
        this.nombre = leer.nextLine();
        this.edad = leer.nextInt();
        
        do{this.sexo = leer.next();
            if (!sexo.equals("H")&&!sexo.equals("M")&&!sexo.equals("O")) {
                System.out.println("Error, ingrese H, M o O");
            }
        }
        while (!sexo.equals("H")&&!sexo.equals("M")&&!sexo.equals("O"));
        
        this.peso = leer.nextDouble();
        this.altura = leer.nextDouble();
          
              
        
    }
    
    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2))<-cambié esta fórmula porque mepa q es cualquiera puse (alt en cm -100). 
    Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    
    public double calcularIMC()
    {
        
        double pesoIdeal = (this.altura*100)-100;
        
        
        if (this.peso<pesoIdeal-20) {
            this.contBajoPeso = this.contBajoPeso+1;
            return -1;
            
        }
        else if (this.peso>=pesoIdeal-20&&this.peso<=pesoIdeal+25) {
            
            this.contPesoIdeal = this.contPesoIdeal+1;
            return 0;
        }
        else if  (this.peso>pesoIdeal+25)
        {
            this.contPesoIdeal = this.contPesoIdeal +1;
            
            return 1;}
        
        return 000;
        
        
        
    }
  
    /*private int contMayorEdad=0, contSobrepeso=0, contPesoIdeal=0, contBajoPeso=0;*/
    
    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
    
    public boolean esMayorDeEdad()
    {
        
        
        if (this.edad>18) {
        contMayorEdad ++;   
        }
        
        
        return this.edad>18;
        
    
    }
    
}
