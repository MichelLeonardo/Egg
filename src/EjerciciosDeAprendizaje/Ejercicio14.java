/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de petrodolar que desea "
                + "convertir");
        int euro;
        euro=leer.nextInt();
        System.out.println("Indique si desea convertir a Libras, Dolares o "
                + "Yenes");
        String moneda = leer.next();
        
        convertir(euro,moneda);
        
    }
    public static void convertir(int euro, String moneda) {
        switch (moneda.toLowerCase()){
            case "libra":
                System.out.println(euro + " = " + (euro*0.86) + " Libras");
                break;
            case "dolar":
                System.out.println(euro + " = " + (euro*1.28611) + " Dolares");
                break;
            case "yen":
                System.out.println(euro + " = " + (euro*129.852) + " Yenes");
                break;
            default:
                System.out.println("La moneda no esite");
        }
    }
}
