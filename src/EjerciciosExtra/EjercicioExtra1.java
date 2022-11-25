/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Indique la cantidad de minutos que desea convertir");
        
        int min;
                
        min = leer.nextInt();
         
        System.out.println(((min/60)/24) + " dias y " + ((min/60)%24) + " horas.");
        
    
}
}
