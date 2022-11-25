package  EjerciciosDeAprendizaje;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*
 
 */
/**
 *
 * @author Usuario
 */

public class Ejercicio21Fin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrizA[][] = new int[10][10];
        int matrizN[][] = new int[3][3]; 
                
        int matrizX[][]= new int[3][3];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizA[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizN[i][j] = (int) (Math.random() * 2);
            } 
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizA[i][j] + "]" );
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.print("[" + matrizN[i][j] + "]" );
            }
            System.out.println("");
                        
        }
        
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (matrizN[0][0]==matrizA[i][j] && i<8 && j<8){
                      int cont=0;  
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 3; l++) {
                                matrizX[k][l]=matrizA[k+i][l+j];
                                if (matrizX[k][l]==matrizN[k][l]){
                                    cont++;
                                    if (cont==9){
                                         System.out.println("Se encontro en "
                                                 + "la coordenada: [" + i +"] ,"
                                                         + " [" + j + "]" );
                                        
                                        
                                    }
                                 }
                            }
                        }

                    }
                

            }
               
        }       
    }
}