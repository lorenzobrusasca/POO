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
public class Cliente {
    
    private int id, edad, altura;
    private String nombre, objetivo;
    private double peso;

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public double getPeso() {
        return peso;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", objetivo=" + objetivo + ", peso=" + peso + '}';
    }

    public Cliente(int id, int edad, int altura, String nombre, String objetivo, double peso) {
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.peso = peso;
    }
    
    
}
