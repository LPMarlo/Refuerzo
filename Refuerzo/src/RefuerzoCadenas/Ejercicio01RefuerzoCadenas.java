package RefuerzoCadenas;

import java.util.Scanner;

/*
Realizar un programa que lea en una cadena el nombre completo de una persona (nombre y
apellidos) y muestre por pantalla el nombre, apellido1 y apellido2. Si el nombre completo no
es correcto mostrará un mensaje de error.
Introduce el nombre completo: PEDRO PEREZ ALVAREZ
El nombre es: PEDRO
El primer apellido es:PEREZ
El segundo apellido es: ALVAREZ
*/
public class Ejercicio01RefuerzoCadenas {
    
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        String nombreCompleto;
        int posicion =0;
        String nombre = new String(), apellido1 = new String(), apellido2 = new String();

        System.out.println("Introduce el nombre completo:");
        nombreCompleto = teclado.nextLine();

        for (int i = 0; i < nombreCompleto.length(); i++) {
            if (!Character.isLetter(nombreCompleto.charAt(i))) {
                if (nombre.length()==0) {
                    nombre = nombreCompleto.substring(posicion, i);
                    posicion = i;
                } else {
                    if (apellido1.length()==0) {
                        apellido1 = nombreCompleto.substring(posicion+1, i);
                        posicion = i;
                    }
                }
            }
            if (nombre.length()!=0 && apellido1.length()!=0) {
                apellido2 = nombreCompleto.substring(posicion+1, nombreCompleto.length());
            }
        }
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido 1: " + apellido1);
        System.out.println("Apellido 2: " + apellido2);
    }
}
