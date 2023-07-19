/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogrupalgimnasio;

import Servicio.ServicioCliente;
import Servicio.ServicioRutina;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class DesafioGrupalGimnasio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioCliente SC = new ServicioCliente();
        ServicioRutina SR = new ServicioRutina();
        String SN;
        
        //Registrar los clientes
        SC.registrarCliente();
        //Crear Rutinas
        SR.crearRutina();
        
        System.out.println("G I M N A S I O  -- Sistema de clientes y rutinas\n");
        System.out.println("Ingrese la opción deseada:\n1. Clientes\n2. Rutinas");
        int primerOpc = leer.nextInt();
        
        if (primerOpc==1) {
            
            
            do{
            System.out.println("\nSECCIÓN CLIENTES\nIngrese la opción deseada:\n1 -> Obtener el nombre de los clienets\n"
            +"2 -> Obtener los datos de todos los clientes\n3 -> Actualizar Cliene\n4 -> Eliminar Cliente");
            int segundaOpc = leer.nextInt();
            
            switch (segundaOpc)
            {
                case 1:  SC.obtenerClientes();
                break;
                case 2: SC.obtenerDatosDeClientes();
                break;
                case 3: System.out.println("Introduzca la siguiente información a modificar:\nId de cliente\nNombre\nEdad\nAltura\nPeso\nObjetivo\n");
                         SC.actualizarCliente(leer.nextInt(), leer.next(), leer.nextInt(), leer.nextDouble(), leer.nextDouble(), leer.next());
                break;
                case 4: System.out.println("Ingrese el id de cliente a eliminar");
                        SC.eliminarCliente(leer.nextInt());
                default: System.out.println("Ha ingresado una opción incorrecta");
                
            }
            
            System.out.println("Desea ingresar otra opción? Introduzca S o N");
             SN = leer.next();
            }
            while("S".equals(SN));
            
        }
        
        else if (primerOpc==2)
        {
            do{
            System.out.println("\nSECCIÓN RUTINAS\nIngrese la opción deseada:\n1 -> Obtener Rutinas actuales\n2 -> Actualizar una rutina\n"
                    + "3 -> Eliminar una rutina ");
            int segundaOpc = leer.nextInt();
            switch  (segundaOpc)
            {
                case 1: SR.obtenerRutinas();
                break;
                case 2: System.out.println("Introduzca la siguiente información a modificar:\nId\nNombre de la rutina\nDuración\nNivel de Dificultad\nDescripción");
                SR.actualizarRutina(leer.nextInt(), leer.next(), leer.nextInt(), leer.next(), leer.next());
                break;
                case 3: System.out.println("Introduzca el id de rutina a eliminar:");
                SR.eliminarRutina(leer.nextInt());
                break;
                default: System.out.println("Ingresó una opción incorrecta");
            }
                System.out.println("Desea ingresar otra opción? Introduzca S o N");
                SN = leer.next();
            }
            while("S".equals(SN));
        }
        
        else{System.out.println("Ha ingresado una opción incorrecta");}
        
      
        
        
        
       
        
    }
    
}
