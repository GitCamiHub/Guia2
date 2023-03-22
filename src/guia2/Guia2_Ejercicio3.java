/*Escribir un programa que pida una frase y la muestre toda
en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java */

package guia2;

import java.util.Scanner;


public class Guia2_Ejercicio3 {

  
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        //Dos formas, con y sin variable
        String minuscula = frase.toLowerCase(); 
        System.out.println("Su frase en minusculas: " + minuscula);
        System.out.println("Su frase en MAYUSCULAS: " + frase.toUpperCase()); 
    }
    
}
