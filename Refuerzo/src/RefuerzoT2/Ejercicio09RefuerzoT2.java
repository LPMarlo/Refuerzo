package RefuerzoT2;

import java.util.Scanner;

/*
Escribe un programa que, dado un número entero positivo, diga cuánto suman los
dígitos pares. Usa long en lugar de int donde sea necesario para admitir
números largos.
Ejemplo :
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22
*/
public class Ejercicio09RefuerzoT2 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        //VARIABLES
        long num = 0, numAuxiliar, numReves = 0;
        long digito = 0, suma = 0;
        int numDigitos = 0;

        //SOLICITAR DATOS
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = Long.parseLong(System.console().readLine());
        numAuxiliar = num;

        //REVERSO DE NUMERO
        while (numAuxiliar > 0){
            numReves = (numReves*10) + (numAuxiliar % 10); 
            numAuxiliar = numAuxiliar/10; 
            numDigitos++; //NUMERO DE DIGITOS
        }

        //IMPRIMIR PARES
        System.out.print("Digitos pares: ");
        for (int i = 0; i < numDigitos ; i++){
            digito = numReves%10;

            //SUMA PARES
            if (digito%2 == 0){
                System.out.print(digito + " ");
                suma = suma + digito;
            }

            numReves = numReves / 10;
        }
        System.out.println();
        System.out.print("Suma de los dígitos pares: " + suma);
    }
}