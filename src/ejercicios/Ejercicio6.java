package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : num1 = 0 num2 = 0 / res-esperado = No se puede dividir entre 0. / res = No se puede dividir entre 0. 
 * 1 vez : num1 = 1 num2 = 1 / res-esperado = El mínimo común múltiplo es 1 / res = El mínimo común múltiplo es 1
 * Varias veces : num1 = 20 num2 = 40 / res-esperado = El mínimo común múltiplo es 40 / res = El mínimo común múltiplo es 40  
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        // Creamos la variable num para pedírsela al usuario.
        int num1, num2, mcm;
        int mcd = 0;
        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos las variables al usuario
        System.out.println("Deme dos números: ");
        num1 = key.nextInt();
        num2 = key.nextInt();

        // Creamos un for en el que el rango máximo serña el número más pequeño de los
        // dos introducidos y vamos incrementando la i.
        for (int i = 1; i <= num1 && i <= num2; i++) {
            // Si los dos números al dividirlo por la i da de resto 0, el máximo común
            // divisor será la i que este pasando por el bucle en ese momento.
            if (num1 % i == 0 && num2 % i == 0) {
                // Le asignamos a la variable mcd la i.
                mcd = i;
            }
        } // Si los dos números son distintos de 0 haremos el mínimo común múltiplo,
          // multiplicamos num1 por num2 entre el máximo común divisor.
        if (num1 != 0 && num2 != 0) {
            mcm = (num1 * num2 / mcd);
            // Imprimimos el resultado
            System.out.println("El mínimo común múltiplo es " + mcm);
        } else { // En caso de que los números sean 0 imprimimos un aviso de error.
            System.out.println("No se puede dividir entre 0");
        }
        // Cerramos el escaner
        key.close();
    }
}
