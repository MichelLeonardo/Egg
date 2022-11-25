/*
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package EjerciciosExtra;

import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Indique que cantidad de numeros desea ingresar");
        int n=leer.nextInt();
        double cont=0,m,men=2000000000,may=0,total=0;
        while (cont<n){
            System.out.println("Ingrese un valor:");
            m=leer.nextDouble();
            cont++;
            total=total+m;
            men=min(men,m);
            may=max(may,m);    
            }
        
        System.out.println("El mayor numero ingresado es; " + may + ", el "
                + "menor numero ingresado es: " + men + " y el promedio de "
                        + "todos los valores es de: " + total/n);
        System.out.println("Indique que cantidad de numeros desea ingresar");
        n=leer.nextInt();
        cont=0,m=0,men=2000000000,may=0,total=0;
        do{
            System.out.println("Ingrese un valor:");
            m=leer.nextDouble();
            cont++;
            total=total+m;
            men=min(men,m);
            may=max(may,m);
        }while (cont<n);
            System.out.println("El mayor numero ingresado es; " + may + ", el "
                + "menor numero ingresado es: " + men + " y el promedio de "
                        + "todos los valores es de: " + total/n);
            }
}
        
    

