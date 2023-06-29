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
public class Cadena {
    
    private String frase;
    private int longitud;
    
    

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.*/
    
public int mostrarVocales()
{
    int CantVocales=0;
    
    for (int i = 0; i < longitud; i++) {
        switch ((frase.substring(i, i+1)).toUpperCase())
        {
            case "A": CantVocales = CantVocales +1;
            break;
            case "E": CantVocales = CantVocales +1;
            break;
            case "I": CantVocales = CantVocales +1;
            break;
            case "O": CantVocales = CantVocales +1;
            break;
            case "U": CantVocales = CantVocales +1;
            break;
                       
        }
    }
    
    return CantVocales;
    
}

/*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/

public void invertirFrase()
{
    for (int i = longitud-1; i >= 0; i--) {
        
        System.out.print(frase.substring(i, i+1));
 
        
    }

}




}


    
