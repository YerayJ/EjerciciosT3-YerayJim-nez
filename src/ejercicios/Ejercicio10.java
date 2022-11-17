package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : num= 0 / res-esperado = El número es menor que 0 / res = El número es menor que 0
 * 1 vez : num= 1 / res-esperado = El número tiene: 1 cifras / res = El número tiene: 1 cifras
 * Varias veces : num = 3400 / res-esperado = El número tiene: 4 cifras / res = El número tiene: 4 cifras
  */

public class Ejercicio10 {
    public static void main(String[] args) {
        // Creamos la variable num para pedírsela al usuario.
        int num;
        // Esta variable será la auxiliar.
        int decimal = 1;
        // Esta variable la usaremos como contador.
        int cifras = 0;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos las variable al usuario
        System.out.println("Deme un número inicial: ");
        num = key.nextInt();
        // Creamos un if en el que se va ejecutando mientras num sea mayor que 0.
        if (num >= 0) {
            while (num>0) {
                
            }
            // Imprimimos el resultado.

        } else { // Imprimimos error en caso de ser menor-igual que 0
            System.out.println("El número es menor que 0");
        }
        // Cerramos el escaner
        key.close();
    }
}
