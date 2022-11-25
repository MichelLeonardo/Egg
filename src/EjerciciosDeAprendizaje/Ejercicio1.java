/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dos numeros enteros");
        
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        int suma;
        suma = num1 + num2;
        
        System.out.println("La suma de " + (num1) + " + " + (num2) + " es: "
                + suma);
                        
    }
    
}
