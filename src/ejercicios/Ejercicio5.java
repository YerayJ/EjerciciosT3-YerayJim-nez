package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : a = 0 b = 0 / res-esperado =  / res = 
 * 1 vez : a = 21 b = 21 / res-esperado = El mínimo común múltiplo de a y b es 1. / res = El mínimo común múltiplo de a y b es 1.
 * Varias veces : a = 27 b = 45 / res-esperado = El mínimo común múltiplo de a y b es 3 / res = El mínimo común múltiplo de a y b es 3
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        // Creamos la variable a y b para pedírsela al usuario.
        int a, b;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos las variables al usuario
        System.out.println("Deme a: ");
        a = key.nextInt();
        System.out.println("Deme b: ");
        b = key.nextInt();

        // Crearemos el for donde la variable i dependerá de cual de los números sea
        // mayor, mientras el número sea positivo se irá ejecutando y irá en incremento.
        for (int i = 1; i < (a > b ? a : b); i++) {
            // Como tenemos que comprobar que las dos variables se puedan dividir y el resto de 0 
            if (a % i == 0) {
                if (b % i == 0) {
                    // Y la primera que se puedan dividir entre los dos e imprimos el resultado de la i 
                    System.out.println("El mínimo común múltiplo de a y b es " + i);
                    // Y imprimimos salimos ya del bucle.
                    break;
                }
            }
        }

        // Cerramos el escaner
        key.close();
    }
}
