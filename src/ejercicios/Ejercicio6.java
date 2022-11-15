package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : a = 0 b = 0 / res-esperado =  / res = 
 * 1 vez : a = 21 b = 21 / res-esperado = El mínimo común múltiplo de a y b es 1. / res = El mínimo común múltiplo de a y b es 1.
 * Varias veces : a = 27 b = 45 / res-esperado = El mínimo común múltiplo de a y b es 3 / res = El mínimo común múltiplo de a y b es 3
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        // Creamos la variable num para pedírsela al usuario.
        int num;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos las variables al usuario
        System.out.println("Dime un número: ");
        num = key.nextInt();

        // Creamos un if para que el rango este dentro de 0 a 20
        if (num <= 20 && num >= 0) {
            // El primer bucle 
            for (int i = 0; i < num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                    
                }
                System.out.println();
            }
        }
        // Cerramos el escaner
        key.close();
    }
}
