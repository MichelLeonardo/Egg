/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package EjerciciosExtra;

/**
 *
 * @author Leo
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A=1,B=2,C=3,D=4,E;
        System.out.println("A=" + A + " B=" + B + " C=" + C + " D=" + D);
        E=B;
        B=C;
        C=A;
        A=D;
        D=E;
        System.out.println("A=" + A + " B=" + B + " C=" + C + " D=" + D);
        
    }
    
}
