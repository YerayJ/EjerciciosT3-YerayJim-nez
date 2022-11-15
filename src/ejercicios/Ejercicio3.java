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
        int size;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos las variables al usuario
        System.out.println("Deme un tamaño: ");
        size = key.nextInt();

        // Creamos el primer bucle que recorre el rango entre la i y el número pasado
        // por pantalla.
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size-i ; j++) {
                System.out.println(" ");
            } 
            for (int j = 0; j < args.length; j++) {
                
            }
            
            
        }

        // Cerramos el escaner
        key.close();
    }
}
