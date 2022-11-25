/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package EjerciciosDeAprendizaje;

import static java.lang.Math.abs;
import static java.lang.Math.round;
import java.util.Scanner;


/**
 *
 * @author Leo
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros");
        String salida;
        int opcion;
        double num1, num2;
         num1= leer.nextInt();
         num2= leer.nextInt();
        salida = " ";
        
        
        do{
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
         
             
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:                    
                    System.out.println("La suma " + num1 + " + " + num2 + 
                            " = " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta de " + num1 + " - " + num2 + 
                            " = " + (num1-num2));
                    break;
                case 3: 
                    System.out.println("El prodcuto de " + num1 + " x " + num2 +
                            " = " + (num1*num2));
                    break;
                case 4:
                   
                    System.out.println("El cociente entre " + round(num1) + " y " 
                    + round(num2) + " es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Desea salir? S:-si- o N:-no- ");
                    salida = leer.next();
                    break;
               default:
                    System.out.println("Opcion incorrecta, intentelo "
                    + "nuevamente");
            }
        }while (salida.equals("n") || opcion != 5);
        
    }
}
