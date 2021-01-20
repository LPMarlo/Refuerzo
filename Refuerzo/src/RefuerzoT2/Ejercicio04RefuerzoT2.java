package RefuerzoT2;

import java.util.Scanner;

/*
Diseñar un programa que lea números hasta que el usuario introduzca el 0. Debe
informar de la media de los números leídos (sin tener en cuenta el 0) y el valor
máximo y mínimo introducido.
*/
public class Ejercicio04RefuerzoT2 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        //VARIABLES
        int num, numMax = Integer.MIN_VALUE, numMin = Integer.MAX_VALUE, sumaNum = 0;
        double media;
        int totalNum = 0;

        do {
            //SOLICITAR DATOS
            System.out.println("Introduce numero (0 para finalizar): ");
            num = Integer.parseInt(teclado.nextLine());
            
            //CALCULO DE PARAMETROS
            sumaNum = sumaNum + num;
            
            if (num!=0) {
                totalNum++;
            }

            if (num>numMax) {
                numMax = num;
            }

            if (num<numMin) {
                numMin = num;
            }
        } while (num!=0);
        media = (double) sumaNum / totalNum;

        //MOSTRAR DATOS
        System.out.println("Media: " + media);
        System.out.println("Valor maximo: " + numMax);
        System.out.println("Valor minimo: " + numMin);
    }
    
}