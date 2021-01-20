package RefuerzoT2;

import java.util.Scanner;

/*
Realizar un programa que pregunte el número de partidos jugados en esta jornada.
Luego para cada uno de las jornadas debe preguntar el número de goles del
equipo local y del equipo visitante y el programa debe determinar el resultado de la
quiniela. Debe asegurarse que los valores son correctos.
*/
public class Ejercicio07RefuerzoT2 {
    
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        //VARIABLES
        int golesVisitante, golesLocal;
        int numPartidos;

        //INICIO
        System.out.println("Introduce el numero de partidos jugados en esta jornada: ");
        numPartidos = Integer.parseInt(teclado.nextLine());

        for (int i = 1; i <= numPartidos; i++) {
            System.out.println("Partido " + i);


            do {
                System.out.println("Introduce los goles del visitante: ");
                golesVisitante = Integer.parseInt(teclado.nextLine());

                if (golesVisitante<0) {
                    System.out.println("Error. El valor debe ser positivo.");
                }
            } while (golesVisitante<0);

            do {
                System.out.println("Introduce los goles del visitante: ");
                golesLocal = Integer.parseInt(teclado.nextLine());

                if (golesLocal<0) {
                    System.out.println("Error. El valor debe ser positivo.");
                }
            } while (golesLocal<0);

        }
    }
}
