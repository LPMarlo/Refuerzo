package RefuerzoT2;

import java.util.Scanner;

//Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado.
public class Ejercicio08RefuerzoT2 {
    
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int num;

        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();

        while (num>9) {
            num = num/10;
        }

        System.out.println("La primera cifra es: " + num);
    }
}
