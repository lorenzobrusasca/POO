/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class ServicioRutina {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private ArrayList<Rutina> Rutinas = new ArrayList<>();
    Rutina R1 = new Rutina();
    
    public void crearRutina()
    {
        
        //Rutina(int id, int duracionMin, String nombreRut, String nivelDificultad, String descripcion)

        Rutinas.add(new Rutina(1, 10, "Elongar", "Baja", "Elongar piernas y brazos"));
        Rutinas.add(new Rutina(2, 60, "Bici fija", "Baja", "Pedaleo en bicicleta estática"));
        Rutinas.add(new Rutina(3, 30, "Aeróbicos", "Media", "Rutina aeróbica para quemar calorías"));
        Rutinas.add(new Rutina(4, 45, "Pesas", "Alta", "Entrenamiento de fuerza con pesas"));
        Rutinas.add(new Rutina(5, 20, "Estiramientos", "Baja", "Estiramiento para flexibilidad"));
        
        
    }
    
    public void obtenerRutinas()
    {
        for (Rutina Rutina : Rutinas) {
            System.out.println(Rutina.toString());
        }
    }
    
     public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion)
    {
         
        R1.setId(id);
        R1.setNombreRut(nombre);
        R1.setDuracionMin(duracion);
        R1.setNivelDificultad(nivelDificultad);
        R1.setDescripcion(descripcion);
        
        Rutinas.set(id-1, R1);
    }
     
     public void eliminarRutina(int id)
     {
     Rutinas.remove(id-1);
     }
    
}
