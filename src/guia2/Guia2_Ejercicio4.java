/*Dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */
package guia2;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia2_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrece la temperatura en grados centigrados.");
        Scanner leer = new Scanner(System.in);
        double temperatura = leer.nextDouble();
        
        double tFahrenheit = 32 + (9 * temperatura / 5);
        
        System.out.println(temperatura + "°C = " + tFahrenheit + " Fahrenheit");
    }
    
}
