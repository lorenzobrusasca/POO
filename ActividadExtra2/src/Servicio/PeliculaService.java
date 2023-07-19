/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Pelicula;


/**
 *
 * @author Lorenzo
 */
/*El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
alquileres por fecha.*/

public class PeliculaService {
    
   private Pelicula[] peliculas = new Pelicula [5];
   
   
   public void crearPeliculas()
   {
       
        peliculas[0] = new Pelicula("Blancanieves", "Animación", 1937, 83);
        peliculas[1] = new Pelicula("Avengers", "Acción", 2012, 143);
        peliculas[2] = new Pelicula("UP", "Animación", 2009, 96);
        peliculas[3] = new Pelicula("Love", "Romántica", 2011, 135);
        peliculas[4] = new Pelicula("La Cordillera", "Drama", 2017, 114);
       }
   
        public void mostrarPeliculas()
        {
            
            for (int i = 0; i < peliculas.length; i++) {
                
                System.out.println(peliculas[i].toString());
            }
        
        }
       
       
   }
 
   
   
    

