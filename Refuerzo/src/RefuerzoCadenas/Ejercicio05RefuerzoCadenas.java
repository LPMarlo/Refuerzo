package RefuerzoCadenas;

import java.util.Scanner;

/*
Realizar un programa que cree el diminutivo de un nombre que se solicitará por teclado.
Si el nombre termina en O, se sustituye esta letra final por el sufijo “ITO” .
Si termina en “A” , IDEM con el sufijo “ITA”.
Si el nombre termina en E,I, o U se preguntará si es masculino o femenino y se procederá de
la misma forma.
Si el nombre termina en consonante se preguntará si es masculino o femenino y se
procederá añadiendo ITO o ITA.
Si no cumple ninguna de las anteriores condiciones, se mostrará por pantalla con “Nombre
incorrecto”
NOTAS:
● El diminutivo se devolverá siempre en mayúsculas.
● Si el dato del sexo es incorrecto se volverá a solicitar.
● Debe usarse un método para crear el diminutivo.
*/
public class Ejercicio05RefuerzoCadenas {
    
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        String cadena;

        System.out.println("Crear el diminutivo de: ");
        cadena = teclado.nextLine();

        System.out.println("El diminutivo es: " + diminutivoPalabra(cadena));

    }
    public static String diminutivoPalabra(String cadena){

        StringBuilder sb = new StringBuilder();
        char genero;
        boolean valido = false;
        boolean masc = false;
        boolean consonante = false;

        cadena = cadena.toUpperCase();
        if (cadena.charAt(cadena.length()-1)=='O') {
            valido = true;
            masc = true;
        } else {
            if (cadena.charAt(cadena.length()-1)=='A') {  
                valido = true;
                masc = false;
            } else {
                if (cadena.charAt(cadena.length()-1)=='E' || cadena.charAt(cadena.length()-1)=='I' || cadena.charAt(cadena.length()-1)=='U') {
                    do {
                        System.out.println("¿La palabra es masculina(M) o femenina(F)?");
                        genero = teclado.nextLine().toUpperCase().charAt(0);

                        if (genero!='M' || genero!='F') {
                            System.out.println("Introduce una respuesta valida.");
                        }
                    } while (genero!='M' || genero!='F');
                    valido=true;

                    if (genero=='M') {
                        masc = true;
                    } else{
                        masc = false;
                    }
                } else {
                    if (Character.isLetter(cadena.charAt(cadena.length()-1))) {
                        do {
                            System.out.println("¿La palabra es masculina(M) o femenina(F)?");
                            genero = teclado.nextLine().toUpperCase().charAt(0);
                            if (genero!='M' || genero!='F') {
                                System.out.println("Introduce una respuesta valida.");
                            }
                        } while (genero!='M' || genero!='F');

                        valido = true;
                        consonante = true;

                        if (genero=='M') {
                            masc = true;
                        } else{
                            masc = false;
                        }
                    }
                }
            }
        }
        if (consonante == true) {
            for (int i = 0; i < cadena.length(); i++) {
                sb.append(cadena.charAt(i));
            }
            if (masc) {
                sb.append("ITO");
            } else {
                sb.append("ITA");
            }
        } else {
            if (valido==true) {
                for (int i = 0; i < cadena.length()-1; i++) {
                    sb.append(cadena.charAt(i));
                }
                
                if (masc==true) {
                    sb.append("ITO");
                } else {
                    sb.append("ITA");
                }
            } else {
                System.out.println("Nombre incorrecto.");
            }
        }
        return sb.toString();
    }
}
