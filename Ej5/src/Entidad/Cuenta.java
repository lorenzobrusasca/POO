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
/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/

public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private int saldoActual;
    private double interes;

    Scanner leer = new Scanner(System.in);
    
    //constructor vacío
    public Cuenta() {
    }
    
    //a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    public Cuenta(int numeroCuenta, long dni, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    //b) Agregar los métodos getters y setters correspondientes
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
   //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
  public void  crearCuenta()
  {
      System.out.println("Ingrese los datos en el siguiente orden: \n1.N° de cuenta\n2.DNI\n3.Saldo Actual\n4.Interes");
      numeroCuenta = leer.nextInt();
      dni = leer.nextLong();
      saldoActual = leer.nextInt();
      interes = leer.nextDouble();
      
  }
    
  /*e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.*/

  public void retirar(int retiro)
  {
     
      if (retiro>saldoActual) {
          saldoActual = 0;
      }
      else{
      saldoActual = saldoActual - retiro;
      }
      
  }
  
  /*f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.*/
  
  public void extraccionRapida()
  {
      int extraccion;
      System.out.println("Ingrese el monto a retirar (no puede superar el 20% de su saldo)");
      extraccion = leer.nextInt();
      
      if (extraccion>(saldoActual*0.20)) {
          System.out.println("Error, el monto supera el 20% del saldo actual");
      }
      else{ saldoActual = saldoActual - extraccion; }
      
      
  }
  
 // g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
  
  public void consultarSaldo()
  {
      System.out.println("El saldo disponible es: $"+saldoActual);
  
  
  
  }
  
  //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
  
  public void consultarDatos()
  {
      System.out.println("Datos de la cuenta:\nDNI: "+dni+"\nInterés: "+interes+"\nNúmero de cuenta: "+numeroCuenta);
      
        
  }    
          
          
}
