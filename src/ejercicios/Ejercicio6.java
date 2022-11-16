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
        int num1,num2,mcm;
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
                mcd=i;
 
            } 
        }
        mcm = (num1*num2/mcd);
        System.out.println("El mínimo común múltiplo es " + mcm);  
        // Cerramos el escaner
        key.close();
    }
}
