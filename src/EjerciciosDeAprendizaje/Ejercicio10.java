/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor maximo al que desee llegar");
        int max=leer.nextInt();
        int suma=0;
        while (suma<max){
            suma+=leer.nextInt();
        }
        System.out.println("La suma total es de " + suma);
    }
    
}
