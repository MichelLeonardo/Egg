/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leo
 */
import java.util.Scanner;
public class NewMaincosa {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
              float N=0;
              do {
                  System.out.print("Introduce un número entero positivo: ");
                  while (!sc.hasNextFloat()) {
                         System.out.println("Valor no válido");
                         sc.next();
                         System.out.print("Introduce un número entero positivo: ");                               
                  }
                 
                  //if(N <= 1){
                    // System.out.println("El número debe ser positivo");                                           
                  //}
              } while (N == 1);
              System.out.println("Número introducido: " + N);
    }
    
}
