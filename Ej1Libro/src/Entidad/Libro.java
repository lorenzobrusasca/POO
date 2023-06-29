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
/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
public class Libro {
    
    public long isbn;
    public String titulo;
    public String autor;
    public int nPag;

    public Libro(long isbn, String titulo, String autor, int nPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPag = nPag;
    }

    public Libro() {
        
        
        
    }

    
       
    
}
