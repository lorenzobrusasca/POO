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
public class Rutina {

/*id, nombre, duracion, nivelDificultad,
descripcion
*/
   private int id, duracionMin;
   private String nombreRut, nivelDificultad, descripcion;

    public Rutina() {
    }


    public Rutina(int id, int duracionMin, String nombreRut, String nivelDificultad, String descripcion) {
        this.id = id;
        this.duracionMin = duracionMin;
        this.nombreRut = nombreRut;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", duracionMin=" + duracionMin + ", nombreRut=" + nombreRut + ", nivelDificultad=" + nivelDificultad + ", descripcion=" + descripcion + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public void setNombreRut(String nombreRut) {
        this.nombreRut = nombreRut;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public String getNombreRut() {
        return nombreRut;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }
   
   
    
    

    
}
