package RefuerzoT2;

import java.util.Scanner;

/*
Diseñar un programa que calcule el perímetro de una figura geométrica. Para ello
debemos preguntar “¿Cuántos lados tiene la figura?”. Luego debemos pedir la
longitud de cada uno de los lados y mostrar el perímetro. Se debe garantizar que
los datos son correctos.
*/
public class Ejercicio03RefuerzoT2 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //VARIABLES
        int lados;
        double longitud, perimetro = 0;
        
        //INICIO
        System.out.println("¿Cuantos lados tiene la figura?");
        lados = Integer.parseInt(teclado.nextLine());

        //SOLICITAR DATOS
        for (int i = 1; i <= lados; i++) {
            System.out.println("¿Cuanto mide el lado " + i + "?");
            longitud = teclado.nextDouble();

            //CALCULO RESULTADO
            perimetro = perimetro + longitud;
        }

        //MOSTRAR RESULTADO
        System.out.println("El perimetro es de " + perimetro);
    }
}
