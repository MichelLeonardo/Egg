/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra de 8 letras.");
        Scanner leer = new Scanner (System.in);
        String cadena = leer.nextLine();
       
    
        if (cadena.length() == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");

    }
        
    }
}
