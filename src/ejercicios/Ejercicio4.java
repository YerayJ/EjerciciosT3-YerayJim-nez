package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : a = -1 b = -1 / res-esperado =  / res = 
 * 1 vez : a = 60 b = 60 / res-esperado = El máximo común divisor de a y b es 60. / res = El máximo común divisor de a y b es 60.
 * Varias veces : a = 30 b = 45 / res-esperado = 15 / res = 15
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creamos la variable size para pedírsela al usuario.
        int a, b;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos las variables al usuario
        System.out.println("Deme a: ");
        a = key.nextInt();
        System.out.println("Deme b: ");
        b = key.nextInt();

        // Crearemos el for donde la variable i dependerá de cual de los números sea
        // mayor, mientras el número sea positivo se irá ejecutando y irá en decremento.
        for (int i = (a > b ? a : b); i > 0; i--) {
            // Como tenemos que comprobar que las dos variables se puedan dividir y el resto de 0 
            if (a % i == 0) {
                if (b % i == 0) {
                    // Y la primera que se puedan dividir entre los dos e imprimos el resultado de la i 
                    System.out.println("El máximo común divisor de a y b es " + i);
                    // Y imprimimos salimos ya del bucle.
                    break;
                }
            }
        }

        // Cerramos el escaner
        key.close();
    }
}
