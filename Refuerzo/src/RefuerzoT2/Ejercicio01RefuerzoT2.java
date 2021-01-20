package RefuerzoT2;

import java.util.Scanner;

// Realizar un programa conversor de pesetas a euros.
public class Ejercicio01RefuerzoT2 {

    //CONSTANTES
    private static final double equivalenciaPAE = 166.386; //Equivalencia de pesetas a euros(1 euro = 166,386 pesetas)

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //VARIABLES
        double pesetas;
        double euros;

        //INICIO
        System.out.println("Introduce las pesetas: ");
        pesetas = teclado.nextDouble();

        //FORMULA
        euros = pesetas/equivalenciaPAE;

        //MOSTRAR RESULTADO
        System.out.println(pesetas + " son " + euros + " euros.");
    }
}
