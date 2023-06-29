/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class CursoService {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    String [] nombres = new String [5];
    
    Curso C1 = new Curso();
    
    /*método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.*/
    
    public void cargarAlumnos()
    {
            
    
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno:");
            nombres [i] = leer.nextLine();
            
            }
    
    }
    
    /*Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos*/
    
    public void crearCurso()
    {
        //public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora)
        System.out.println("Ingrese en el siguiente orden la información:\nNombre del Curso\nCantidad de horas por dia\nCantidad de días por semana\nTurno\nPrecio por hora");
        C1.setNombreCurso(leer.next());
        C1.setCantidadHorasPorDia(leer.nextInt());
        C1.setCantidadDiasPorSemana(leer.nextInt());
        C1.setTurno(leer.next());
        C1.setPrecioPorHora(leer.nextInt());
        
        C1.setAlumnos(nombres);
        
        System.out.println(C1.toString());
        
                
    }
    
    /*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.*/
    
    public void calcularGananciaSemanal()
    {
        
        System.out.println("La ganancia semanal es: "+(C1.getCantidadHorasPorDia()*C1.getPrecioPorHora()*C1.getCantidadDiasPorSemana()*5));
        
    
    }
    
}
