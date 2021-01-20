package RefuerzoCadenas;

import java.util.Scanner;

/*
Realizar un método al que se le pase una cadena con un número de teléfono (999999999) y
devuelva una nueva cadena con el teléfono formateado de esta forma 999-99-99-99.
*/
public class Ejercicio02RefuerzoCadenas {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        String numTelf;
        int posicion = 3;
        System.out.println("Introduce el numero de telefono: ");
        numTelf = teclado.nextLine();

        StringBuilder numTelfNuevo = new StringBuilder(); 
        
        for (int i = 0; i < numTelf.length(); i++) {

            if (i % posicion == 0 && i !=0) {
                numTelfNuevo.append('-');
                posicion +=2;
            }
            numTelfNuevo.append(numTelf.charAt(i));
        }

        System.out.println("Numero formateado: " + numTelfNuevo.toString());
    }
}