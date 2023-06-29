/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1libro;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej1Libro {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Introduzca en el siguiente orden los siguientes datos:\nTítulo\nAutor\nN°Páginas\nISBN");
       
        
        String titulo = leer.nextLine();
        String autor = leer.nextLine();
        int pag = leer.nextInt();
        long isbn = leer.nextLong();
                
        
        Libro L1 = new Libro(isbn,titulo,autor,pag);
        
        System.out.println("\nAutor"+L1.autor+"\nTitulo"+L1.titulo+"\nnPag"+L1.nPag+"\nISBN"+L1.isbn);
        
    }
    
}
