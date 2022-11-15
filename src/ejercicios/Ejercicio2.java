package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * 0 veces : num = 1 / res-esperado = Hay un total de 0 números primos. / res = Hay un total de 0 números primos.
 * 1 veces : num = 2 / res-esperado = Hay un total de 1 números primos. / res = Hay un total de 1 números primos.
 * Varias veces num = 20 / res-esperado = Hay un total de 8 números primos. / res = Hay un total de 8 números primos.
 */

public class Ejercicio2 {
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
            // Damos por hecho que todos los números son primos y le añadimos uno siempre
            // cada vuelta, ya después comprobaremos si es primo o no.
            contador++;
            // Con esto comprobaremos si la i es primo. Empezando la j en 2, ya que sabemos
            // que el uno y el dos no son primos, e irá comprobando que el número los
            // números hasta la i.
            for (int j = 2; j < i; j++) {
                // Con este if comprobamos que si al dividir la i entre la variable j da el
                // resto 0, el número no es primo.
                if (i % j == 0) {
                    // Si no es primo le vamos restando al contador uno.
                    contador--;
                    // Salimos directamente de este bucle.
                    break;
                }
            }
        }
        // Imprimimos resultado
        System.out.println("Hay un total de " + contador + " números primos.");

        // Cerramos el escaner
        key.close();
    }
}
