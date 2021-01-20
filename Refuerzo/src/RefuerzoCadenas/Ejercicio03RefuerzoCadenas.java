package RefuerzoCadenas;

import java.util.Scanner;

/*
Realizar un método que reciba como entrada dos cadenas de caracteres y devuelva una
tercera cadena intercalando los caracteres de las palabras de las cadenas recibidas.
Ejemplo: “abcdfgh” y “123” devolvería “a1b2c3dfgh”
*/
public class Ejercicio03RefuerzoCadenas {
    
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        String cadena1, cadena2;

        System.out.println("Introduce la primera cadena: ");
        cadena1 = teclado.nextLine();

        System.out.println("Introduce la segunda cadena: ");
        cadena2 = teclado.nextLine();
        
        System.out.println("Nueva cadena: " + combinarCadenas(cadena1, cadena2));
    }

    public static String combinarCadenas(String cadena1, String cadena2){

        int longCadenaCombinada;
        StringBuilder cadenaCombinada = new StringBuilder();

        if (cadena1.length()>cadena2.length()) {
            longCadenaCombinada = cadena1.length();
        } else {
            longCadenaCombinada = cadena2.length();
        }

        for (int i = 0; i < longCadenaCombinada; i++) {
            if (i<cadena1.length()) {
                cadenaCombinada.append(cadena1.charAt(i));
            }
            if (i<cadena2.length()) {
                cadenaCombinada.append(cadena2.charAt(i));
            }
        }
        return cadenaCombinada.toString();
    }
}
