package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : num= 0 / res-esperado = El número es capicúa / res = El número es capicúa
 * 1 vez : num= 1 / res-esperado = El número es capicúa / res = El número es capicúa
 * Varias veces : num = 3345 / res-esperado = El número no es capicúa / res = El número no es capicúa
  */

public class Ejercicio10 {
    public static void main(String[] args) {
        // Creamos la variable num para pedírsela al usuario.
        int num;
        // Esta variable para ir dándole la vuelta al número.
        int reverso = 0;
        // Esta variable la usaremos para ir sobreescribiendo el número que nos pasa el
        // usuario.
        int aux;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos las variable al usuario
        System.out.println("Deme un número inicial: ");
        num = key.nextInt();
        // Guardamos el num en otra variable para no carganoslo.
        aux = num;
        // Creamos un if en el que se va ejecutando mientras num sea mayor-igual que 0.
        if (num >= 0) {
            // Mientras la variable aux que es la que se sobreescribe siga siendo mayor que
            // 0 se irá ejecutando.
            while (aux > 0) {
                // Cogemos la última cifra del número y la guardamos en una variable nueva.
                int cifra = aux % 10;
                // En esta variable guardaremos el valor por 10 para darle un hueco más al sumar
                // la siguiente cifra, ya que si no se lo dieramos se sumaría uno encima de
                // otro.
                reverso = reverso * 10 + cifra;
                // Por último a la variable aux que contiene el número le quitamos una cifra,
                // para que en la siguiente vuelta empecemos con la cifra siguiente.
                aux = aux / 10;
            } // Comparamos que los dos números son iguales, si lo son damos como resultado
              // capicúa
            if (reverso == num) {
                System.out.println("El número es capicúa");
            } else { // En caso contrario
                System.out.println("El número no es capicúa");
            }

        } else { // Imprimimos error en caso de ser menor-igual que 0
            System.out.println("El número es menor que 0");
        }
        // Cerramos el escaner
        key.close();
    }
}
