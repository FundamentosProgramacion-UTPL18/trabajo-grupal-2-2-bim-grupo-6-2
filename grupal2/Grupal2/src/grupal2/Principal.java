/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupal2;

import java.util.Scanner;

/**
 *
 * @author jhand
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre[] = {"José", "María", "Ana", "Paul", "David"};
        String apellido[] = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int edades[] = {20, 19, 20, 19, 25};
        double calificacion1[] = {9.1, 10, 8, 7, 9.1};
        double calificacion2[] = {6.1, 5, 10, 7.2, 4.1};
        double promedio[] = new double[5];
        Registros estudiante[] = new Registros[5];
        for (int i = 0; i < nombre.length; i++) {
            Registros r = new Registros();
            r.nombres = nombre[i];
            r.apellidos = apellido[i];
            r.edad = edades[i];
            r.calificacion1 = calificacion1[i];
            r.calificacion2 = calificacion2[i];
            promedio[i] = (calificacion1[i] + calificacion2[i])/2;
            estudiante[i] = r;
        }
        for (int i = 0; i < estudiante.length; i++) {
            System.out.println(estudiante[i].nombres +" "+estudiante[i].apellidos +"\nEdad: "+estudiante[i].edad+"\nCalificación 1: "+estudiante[i].calificacion1+"\nCalificación 2: "+estudiante[i].calificacion2+"\nPromedio: "+promedio[i]);
        }
    }

}
