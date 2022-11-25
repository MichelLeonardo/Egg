/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("En esta clase vamos a comparar 2 numeros ingresados"
                + " por teclado, con el numero 25.");
        System.out.println("Ingrese el 1er numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el 2do numero");
        int num2 = leer.nextInt();
        
        if (num1 > 25){
            System.out.println("El numero " + num1 + " es mayor a 25");
        
    }       
        if (num2 > 25){
            System.out.println("El numero " + num2 + " es mayor a 25");
        
        }        
        if (num1 <= 25 && num2 <= 25){
            System.out.println("Ninguno de los numeros ingresados es mayor a 25");
   
        }
    }
}
