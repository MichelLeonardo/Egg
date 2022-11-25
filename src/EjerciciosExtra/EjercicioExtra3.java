/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una letra.");
        
        char letra=leer.next().charAt(0);
       
        if (Character.toLowerCase(letra)== 'a' || Character.toLowerCase(letra)== 'e' || Character.toLowerCase(letra)== 'i' || Character.toLowerCase(letra)== 'o' || Character.toLowerCase(letra)== 'u') {
           System.out.println("La letra ingresada es una vocal.");  
        }
           
           else {
            System.out.println("El caracter ingresado no es una vocal");
     }
}    
}