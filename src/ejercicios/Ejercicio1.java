package ejercicios;

import java.util.Scanner;

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

        // Creamos las condiciones

        if ((hora >= 0 && hora < 24) && (min >= 0 && min < 60) && (seg >= 0 && seg < 60) && incremento > 0) {
            seg+=incremento;
            while (seg > 59) {
                seg-=60;
                min++;
            if (min > 59) {
                min-=60;
                min++;
            } if (hora > 23) {
                hora = 0;
            }
            }

            System.out.printf("%d:%d:%d",hora,min,seg);
        }else {
            System.out.println("La hora pasada tiene que ser coherente");
        }
            
        

    }
}
