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

public class Vehiculo {
    
        private String marca;
        private String modelo;
        private int anio;
        private String tipo;
        private double velocidad;
        private int mtsAvanzados=0;

    public int getMtsAvanzados() {
        return mtsAvanzados;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getTipo() {
        return tipo;
    }

    public Vehiculo()
    {};
    
    public Vehiculo(String marca, String modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        
    }
        
    
    public void Moverse(int tiempo)
    {
            
        if (tipo.equals("moto")) {
            mtsAvanzados = mtsAvanzados + 2*tiempo;
        }
        else if   (tipo.equals("auto"))
        {
        mtsAvanzados = mtsAvanzados + 3*tiempo;
        }
        else if (tipo.equals("bicicleta"))
        {
        mtsAvanzados = mtsAvanzados + 1*tiempo;
        }
    }
    
    public void Frenar()
    {
          if (tipo.equals("moto")) {
            mtsAvanzados = mtsAvanzados + 2;
        }
        else if   (tipo.equals("auto"))
        {
        mtsAvanzados = mtsAvanzados + 2;
        }
        else if (tipo.equals("bicicleta"))
        {
        mtsAvanzados = mtsAvanzados ;
        }
    
    
    }
        
    }
    
    
    
    

