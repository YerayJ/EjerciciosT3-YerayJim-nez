package ejercicios;

import java.util.Scanner;

/*
 * PRUEBAS
 * O veces: hora = -1, min = 30, seg = 6, incremento = 7 / res-esperado= La hora pasada tiene que ser coherente / res= La hora pasada tiene que ser coherente
 * 1 vez: hora = 22, min = 59, seg = 59, incremento = 1 / res-esperado =  23:0:0 / res = 23:0:0
 * Varias veces: hora = 23, min = 58, seg = 53, incremento = 120 / res-esperado =  0:0:53 / res = 0:0:53   
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creamos las variables pedidas por el ejercicio de valor Int.
        int hora, min, seg, incremento;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos las variables al usuario
        System.out.println("Deme la hora: ");
        hora = key.nextInt();
        System.out.println("Deme los minutos: ");
        min = key.nextInt();
        System.out.println("Deme los segundos: ");
        seg = key.nextInt();
        System.out.println("Deme el incremento que desea en segundos: ");
        incremento = key.nextInt();

        // Este if engloba todo, en el se comprueba que todos los valores pasados sean
        // coherentes cuando vayamos a calcular la hora.
        if ((hora >= 0 && hora < 24) && (min >= 0 && min < 60) && (seg >= 0 && seg < 60) && incremento > 0) {
            // Fuera del bucle le sumamos a los segundos el incremento
            seg += incremento;
            // Para entrar en el bucle segundos tiene que ser siempre mayor que 59.
            while (seg > 59) {
                // Al entrar siempre le restamos a segundos 60 y le añadimos uno a minutos
                seg -= 60;
                min++;
                // Ahora en el if comprobamos que min sea mayor que 59 y le añadimos uno a la
                // hora y restamos a los minutos 60.
                if (min > 59) {
                    hora++;
                    min -= 60;
                } // Por último con esto comprobamos que si la hora es mayor a 23 automaticamente
                  // cambiará a 0, igual que la hora real.
                if (hora > 23) {
                    hora = 0;
                }
            }
            // Imprimimos resultado en formato de hora
            System.out.printf("%d:%d:%d", hora, min, seg);
        } else { // En caso de introducir mal las variables nos imprime esto.
            System.out.println("La hora pasada tiene que ser coherente");
        }

        // Cerramos el escaner
        key.close();

    }
}
