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
public class Auto {
    
    public String marca;
    public String modelo;
    public int anio;
    public boolean nuevo;
    public int km;
    
    
    public Auto(String marca, String modelo, int anio, boolean nuevo, int km)
    {
    this.marca = marca;
    this.anio = anio;
    this.modelo = modelo;
    this.nuevo = nuevo;
    this.km = km;    
    
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", nuevo=" + nuevo + ", km=" + km + '}';
    }
    
    
    
    
}
