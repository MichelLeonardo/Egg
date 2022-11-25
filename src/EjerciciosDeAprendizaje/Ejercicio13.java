/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese el tamaño del cuadrado");
        Scanner leer = new Scanner(System.in);
        int lado;
        lado = leer.nextInt();
        int num = lado-1;
        for (int i = 0; i < lado; i++) {
            
            for (int j = 0; j < lado-1; j++) {
            if(i==0 || num==i || j==0 || j==num) {  
                System.out.print("*  ");
            }else {
                System.out.print("   ");
            }
            
        }
            System.out.println("*");
            
        }    
    }
    
}
