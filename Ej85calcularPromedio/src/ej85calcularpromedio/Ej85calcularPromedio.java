/*
8.5) Escribir la función calcularPromedio, que devuelve el promedio resultante de un
arreglo de números enteros recibido como parámetro..
 */
package ej85calcularpromedio;

/**
 *
 * @author Matias
 */
public class Ej85calcularPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = {4,5,6}; 
        
        System.out.println(calcularPromedio(num));

        
    }
    
    public static int calcularPromedio(int[] num) {
                    int acumulador = 0 ;

        for (int i = 0; i < num.length; i++) {
            acumulador = acumulador + num[i];
            
        }
        return acumulador / num.length ;
    }
    
    
}
