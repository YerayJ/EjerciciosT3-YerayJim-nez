package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : num = 1 / res-esperado = Hay un total de 0 números primos. / res = Hay un total de 0 números primos.
 * 1 vez : num = 2 / res-esperado = Hay un total de 0 números primos. / res = Hay un total de 1 números primos.
 * Varias veces : num = 9 / res-esperado = Hay un total de 4 números primos. / Hay un total de 4 números primos.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        // Creamos las variables num para pedirsela al usuario y un contador.
        int num;
        int contador = 0;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos las variables al usuario
        System.out.println("Deme un número: ");
        num = key.nextInt();

        // Creamos el primer bucle que recorre el rango entre la i y el número pasado
        // por pantalla.
        for (int i = 2; i <= num; i++) {
            
            
        }
        // Imprimimos resultado
        System.out.println("Hay un total de " + contador + " números primos.");

        // Cerramos el escaner
        key.close();
    }
}
