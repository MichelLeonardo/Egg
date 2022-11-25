/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Leo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su frase.");
        String frase=leer.nextLine();
        
        frase=toLowerCase(frase);
        System.out.println("Su frase en minusculas es: " + frase);
        frase=toUpperCase(frase);
        System.out.println("Su frase en mayusculas es: " + frase);
    }
    
}
