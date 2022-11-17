package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : num= 0 / res-esperado = El número es menor que 0 / res = El número es menor que 0
 * 1 vez : num= 1 / res-esperado = El número tiene: 1 cifras / res = El número tiene: 1 cifras
 * Varias veces : num = 3400 / res-esperado = El número tiene: 4 cifras / res = El número tiene: 4 cifras
  */

public class Ejercicio9 {
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
        if (num > 0) {
            // En este bucle le damos a la i el valor de num y este lo vamos diviendo en
            // cada pasada por la variable decimal. Se ejecutará mientras sea mayor igual a
            // 1, ya que si llegará a dividirse por 0 daría error.
            for (int i = num; i >= 1; i = num / decimal) {
                // Le añadimos uno a cifras por cada vuelta
                cifras++;
                // En la variable decimal le vamos multiplicando por 10 para ir moviendonos de
                // posición en el número.
                decimal *= 10;
            }
            // Imprimimos el resultado.
            System.out.println("El número tiene: " + cifras + " cifras");
        } else { // Imprimimos error en caso de ser menor-igual que 0
            System.out.println("El número es menor que 0");
        }
        // Cerramos el escaner
        key.close();
    }
}
