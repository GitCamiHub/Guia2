/*Escribir un programa que pida dos números enteros por teclado y calcule 
la suma de los dos. El programa deberá después mostrar el resultado de la suma*/

package guia2;

import java.util.Scanner;

public class Guia2_Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos numeros enteros.");
        System.out.println("Numero 1:");
        num1 = leer.nextInt();
        System.out.println("Numero 2:");
        num2 = leer. nextInt();
        
        int suma = num1 + num2;
        System.out.println("La suma de ambos numeros es: " + suma);
       
        
    }
    
}
