/*
 Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese su Plan Medico");
        
        String plan=leer.next();
        
        System.out.println("Ingrese el costo del tratamiento.");
        
        int costo=leer.nextInt();
        switch(plan.toLowerCase()){
            
            case "a":
                System.out.println("Su tratamiento tiene un 50% y usted debe "
                        + "abonar: $" + costo*0.5 );
                break;
            case "b":
                System.out.println("Su tratamiento tiene un 50% y usted debe "
                        + "abonar: $" + costo*0.65 );
                break;
            case "c":
                System.out.println("Su tratamiento no tiene descuento");
                break;
            default:
                System.out.println("Ha ingresado un plan incorrecto.");
        }
    }
    
}
