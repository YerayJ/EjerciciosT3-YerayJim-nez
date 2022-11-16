package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : num1 = 0 num2 = 0 / res-esperado = No se puede dividir entre 0. / res = No se puede dividir entre 0. 
 * 1 vez : num1 = 1 num2 = 1 / res-esperado = El mínimo común múltiplo es 1 / res = El mínimo común múltiplo es 1
 * Varias veces : num = 3 / 
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

        // Creamos un for
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                mcd = i;
            }
        }
        if (num1 != 0 && num2 != 0) {
            mcm = (num1 * num2 / mcd);
            System.out.println("El mínimo común múltiplo es " + mcm);
        } else {
            System.out.println("No se puede dividir entre 0");
        }
        // Cerramos el escaner
        key.close();
    }
}
