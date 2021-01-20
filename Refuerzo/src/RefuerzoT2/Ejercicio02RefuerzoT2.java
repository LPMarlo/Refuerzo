package RefuerzoT2;

import java.util.Scanner;

/*
Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a
12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas,
los minutos no se deben introducir por teclado.
*/
public class Ejercicio02RefuerzoT2 {

    //CONSTANTES
    private static final int MIN_MANNANA = 6;
    private static final int MAX_MANNANA = 12;
    private static final int MIN_TARDE = 13;
    private static final int MAX_TARDE = 20;
    private static final int MIN_NOCHE = 21;
    private static final int MAX_NOCHE = 5;
    private static final int COMIENZO_DIA = 0;
    private static final int FIN_DIA = 23;

    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //VARIABLES
        int hora;

        //INICIO
        System.out.println("Introducir hora: ");
        hora = Integer.parseInt(teclado.nextLine());

        //CONDICIONES PARA CADA CASO
        if (hora>=MIN_MANNANA && hora<=MAX_MANNANA) {
            System.out.println("Buenos dias");
        }else{
            if (hora>=MIN_TARDE && hora<=MAX_TARDE) {
                System.out.println("Buenas tardes");
            }else {
                if ((hora>=MIN_NOCHE && hora<=FIN_DIA) || (hora>=COMIENZO_DIA && hora<=MAX_NOCHE)) {
                    System.out.println("Buenas noches");
                }
            }
        }
    }
}
