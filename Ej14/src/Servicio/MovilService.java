/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
/*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/

public class MovilService {


    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    Movil M1 = new Movil();

/*Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.*/    
    public void cargarCelular()
    {
        System.out.println("Ingrese los siguientes datos en el orden indicado:\n1.Marca\n2.Precio\n3.Modelo\n4.MemoriaRam\n5.Almacenamiento");
        M1.setMarca(leer.next());
        M1.setPrecio(leer.nextInt());
        M1.setModelo(leer.next());
        M1.setMemoriaRam(leer.nextInt());
        M1.setAlmacenamiento(leer.nextInt());
        
        
        
    }
    
   /*Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/

    public void ingresarCodigo(){
        
        int [] cod = new int [7];
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el número "+(i+1));
            cod[i] = leer.nextInt();
        }
        
        
      M1.setCodigo(cod);
    
    }
    
    //Muestro con Tostring
    
    public void mostrarTodo()
    {
    
        System.out.println(M1.toString());  
    }
    
    
}
