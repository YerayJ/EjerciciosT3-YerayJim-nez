package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : num = 0 / res-esperado = . / res = .
 * 1 vez : num = 1 / res-esperado = " *". / res = " *".
 * Varias veces : num = 9 /
 * res-esperado =  *
 *                * *
 *   res =  *
 *         * *
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        // Creamos la variable size para pedírsela al usuario.
        int size;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos la variable al usuario
        System.out.println("Deme un tamaño: ");
        size = key.nextInt();

        // Creamos el primer bucle que recorre el rango entre la i y el número pasado
        // por pantalla.
        for (int i = 1; i <= size; i++) {
            // En el siguiente bucle tendremos que ir contando los espacios por cada línea
            // desde el 0 hasta un número antes del tamaño total.
            for (int espacio = 0; espacio < size - i; espacio++) {
                // Aquí imprimimos los espacios sin el salto de línea.
                System.out.print(" ");
            } // El for en este caso va a ir añadiendo asteriscos por línea hasta la i que sería la linea. 
            for (int j = 0; j < i; j++) {
                // Aquí imprimimos los asteriscos sin el salto de línea.
                System.out.print("* ");
            }
            // Por último imprimimos saltos de línea 
            System.out.println();
        }

        // Cerramos el escaner
        key.close();
    }
}
