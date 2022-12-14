package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : num= 0 / res-esperado = Total de número introducidos 0 Número de fallos 0. / res = Total de número introducidos 0 Número de fallos 0. 
 * 1 vez : num= 15 num = 0 / res-esperado = Total de número introducidos 1 Número de fallos 1 / res = Total de número introducidos 1 Número de fallos 1 
 * Varias veces : num = 99 num = 14 num= 80 num = 0 / Total de número introducidos 3 Número de fallos 1 / Total de número introducidos 3 Número de fallos 1 
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        // Creamos la variable num para pedírsela al usuario.
        int num, dado;
        // En esta variable acumularemos los fallos en el bucle.
        int fallo = 0;
        // Con esta variable contamos las veces que leemos números del usuario.
        int contador = 0;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos las variable al usuario
        System.out.println("Deme un número inicial: ");
        num = key.nextInt();
        dado = num;
        // Creamos un bucle en el que se va ejecutando mientras num sea mayor que 0.
        for (int i = 0; num > 0; i++) {
            // Por cada vuelta al bucle le añadimos uno al contador.
            contador++;
            // En este if contaremos los fallos, para ello num debe ser menor que el dado.
            if (num < dado) {
                // Acumulamos uno en la variable fallo.
                fallo++;
                // Imprimimos que el usuario ha fallado.
                System.out.println("Fallo es menor");
            } // Volvemos a pedir el número al usuario en cada vuelta.
            dado = num;
            System.out.print("Deme un número: ");
            num = key.nextInt();
        } // Por último mostramos el número total de número introducidos y fallos.
        System.out.println("Total de número introducidos " + contador);
        System.out.println("Número de fallos " + fallo);

        // Cerramos el escaner
        key.close();
    }
}
