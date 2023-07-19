/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;


/**
 *
 * @author Lorenzo
 */
/*El programa también debe tener
una clase Alquiler que represente los datos de un alquiler, como la película alquilada, la fecha de inicio, la fecha de fin y
el precio.*/

public class Alquiler {

private Pelicula pelicula;
private String peliculaAlq;
private LocalDate fechaInicio,fechaFin;
private int precio;

    public Alquiler() {
    }

    public Alquiler(Pelicula pelicula, String peliculaAlq, LocalDate fechaInicio, LocalDate fechaFin, int precio) {
        this.pelicula = pelicula;
        this.peliculaAlq = peliculaAlq;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }



    public String getPeliculaAlq() {
        return peliculaAlq;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getPrecio() {
        return precio;
    }



    
}
