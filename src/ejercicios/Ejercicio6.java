package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : num= -1 / res-esperado = . / res = . 
 * 1 vez : num= 1 / res-esperado = 1 / res = 1 
 * Varias veces : num = 3 / 
 * res-esperado = 1
 *                22
 *                333
 * res          = 1
 *                22
 *                333
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
            // El primer bucle comprobamos de que número a que número tenemos que recorrer.
            for (int i = 1; i <= num; i++) {
                // En este bucle imprimos el número correspondiente, las veces que se imprima
                // dependerán del número que sea.
                for (int j = 1; j <= i; j++) {
                    // Imprimimos el número por pantalla en la misma línea
                    System.out.print(i);
                } // Imprimimos una línea para que baje a la siguiente.
                System.out.println();
            }
        }
        // Cerramos el escaner
        key.close();
    }
}
