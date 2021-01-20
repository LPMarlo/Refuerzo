package RefuerzoT2;

import java.util.Scanner;

/*
Realiza un programa que calcule el precio de un desayuno. El programa
preguntará primero qué ha tomado el usuario de comer: palmera, donut o pitufo. La
palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el programa debe
preguntar además si era con aceite o con tortilla; el primero vale 1’20 € y el
segundo 1’60 €. Por último se pregunta por la bebida: zumo o café a 1’50 y 1’20
respectivamente.
*/
public class Ejercicio10RefuerzoT2 {
    
    private static final double CAFE = 1.2;
    private static final double ZUMO = 1.5;
    private static final double PITUFO_TORTILLA = 1.6;
    private static final double PITUFO_ACEITE = 1.2;
    private static final int DONUT = 1;
    private static final double PALMERA = 1.4;
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        char tipoComida, tipoPitufo, bebida;
        double precio;

        System.out.println("¿Que ha comido? (Palmera-P, Donut-D o Pitufo-P");
        tipoComida = teclado.nextLine().toUpperCase().charAt(0);

        if (tipoComida == 'P') {
            precio = PALMERA;
        } else {
            if (tipoComida == 'D') {
                precio = DONUT;
            } else {
                System.out.println("¿Con aceite (A) o con tortilla (T)?");
                tipoPitufo = teclado.nextLine().toUpperCase().charAt(0);

                if (tipoPitufo == 'A') {
                    precio = PITUFO_ACEITE;
                } else {
                    precio = PITUFO_TORTILLA;
                }
            }
        }

        System.out.println("¿Que  ha bebido? (Zumo-Z o Cafe-C)");
        bebida = teclado.nextLine().toUpperCase().charAt(0);

        if (bebida == 'Z') {
            precio += ZUMO;
        } else {
            precio += CAFE;
        }

        System.out.println("El precio del desayuno es: " + precio + " euros");
    }
}
