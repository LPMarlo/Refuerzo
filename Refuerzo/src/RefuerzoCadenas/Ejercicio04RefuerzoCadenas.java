package RefuerzoCadenas;

import java.util.Scanner;

/*
Realizar un método que permita saber si un texto es o no “Guay del Paraguay”. Se
considera que una cadena es “Guay del Paraguay” si las 4 primeras letras y las 4 últimas son
iguales entre sí. El número 4 debe crearse como constante de manera que el programa siga
funcionando si se cambia el valor de dicha constante.
Ejemplos de frases “Guay del Paraguay””:
“Manolo juega al balonmano”
“Ponedle más marcarpone”
NOTA: La longitud de la cadena para que sea “Guay del Paraguay” será de al menos 4* 2
caracteres. El método lo controlará.
*/
public class Ejercicio04RefuerzoCadenas {
    
    /**
     *
     */
    private static final int LONGITUD_CADENA = 4;
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        //VARIABLES
        String cadena;

        //INICIO
        System.out.println("Introduce una frase que empiece y termine igual: ");
        cadena = teclado.nextLine();

        if (textTermYEmpIgual(cadena, LONGITUD_CADENA)) {
            System.out.println("El texto es Guay del Paraguay.");
        } else {
            System.out.println("El texto no es Guay del Paraguay.");
        }
    }
    public static boolean textTermYEmpIgual(String cadena, int longitudCadena){

        //VARIABLES
        boolean igual = false;

        //VALIDAR
        if (cadena.substring(0,longitudCadena-1).equalsIgnoreCase(cadena.substring(cadena.length()-longitudCadena, cadena.length()-1))) {
            igual = true;
        }
        return igual;
    }
}
