/*Escribir un programa que pida tu nombre, lo guarde en una variable 
y lo muestre por pantalla.*/

package guia2;

import java.util.Scanner;


public class Guia2_Ejercicio2 {

    
    public static void main(String[] args) {
        System.out.println("¿Cómo es tu nombre?");
        Scanner leer= new Scanner(System.in);
        String nombre = leer.nextLine(); //Si no pongo Line me toma solo la primer palabra
        System.out.println("Tu nombre es " + nombre);
    }
    
}
