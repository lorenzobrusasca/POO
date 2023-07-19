/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class ServicioCliente {
    
   private ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public void registrarCliente()
    {
         
        listaClientes.add(new Cliente(1, 30, 168, "Lorenzo", "Ganar masa muscular", 50));
        listaClientes.add(new Cliente(2, 50, 171, "Juan", "Perder peso", 130));
        listaClientes.add(new Cliente(3, 25, 160, "Romina", "Tonificar", 45));
        listaClientes.add(new Cliente(4, 65, 165, "Sara", "Tonificar", 57));
        listaClientes.add(new Cliente(5, 40, 180, "Pedro", "Ponerse anchazo", 82));
      
        
    }
    
    public void obtenerClientes()
    {
        for (Cliente cliente : listaClientes) {
        System.out.println(cliente.getNombre());}
        System.out.println("\n");
    }
    
    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo)
    {
        Cliente CL1 = new Cliente();
        CL1.setId(id);
        CL1.setNombre(nombre);
        CL1.setEdad(edad);
        CL1.setAltura(edad);
        CL1.setPeso(peso);
        CL1.setObjetivo(objetivo);
        listaClientes.set(id-1, CL1);
    
    }
    
    public void eliminarCliente(int id)
    {
    listaClientes.remove(id-1);
        
    }
    
    public void obtenerDatosDeClientes()
    {
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
        }
    }
    
    
}
