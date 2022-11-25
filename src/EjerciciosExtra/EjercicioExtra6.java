/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas medidas");
        int pers=leer.nextInt();
        
        double altura,total=0,petis=0,hobbits=0;
        
        for (int i = 1; i <= pers; i++) {
            
            System.out.println("Ingrese la altura de la " + i + "° persona.");
            
            altura=leer.nextDouble();
            
            total=total+altura;
            if (altura<1.6){
                petis=petis+altura;
                hobbits++;
            }
        }
        System.out.println("El promedio de altura de personas es "
         + total/pers + " y el promedio de altura de personas mas bajas que"
                 + " 1.60m es de " + petis/hobbits);
    
}
}
