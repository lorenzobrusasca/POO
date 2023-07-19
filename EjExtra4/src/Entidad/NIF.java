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
public class NIF {
    
   private long DNI;
   private char letra;

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public char getLetra() {
        return letra;
    }

    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public NIF() {
    }
    
}
