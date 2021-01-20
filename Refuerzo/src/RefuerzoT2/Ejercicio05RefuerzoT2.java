package RefuerzoT2;

import java.util.Scanner;

/*
Diseñar un programa que muestre un menú con las siguientes opciones:
1. Cambio de euros a dólares
2. Cambio de dólares a euros
3. Cambio de euros a libras
4. Cambio de libras a euros.
5. Cambio de libras a dólares
6. Cambio de dólares a libras
7. Salir
El programa debe pedir una opción, luego una cantidad según corresponda y
mostrar la conversión correspondientes. El programa terminará cuando pulse un 7.
*/
public class Ejercicio05RefuerzoT2 {
    
    private static final double CONVERSION_ED = 1.23;
    private static final double CONVERSION_DE = 0.82;
    private static final double CONVERSION_EL = 0.91;
    private static final double CONVERSION_LE = 1.10;
    private static final double CONVERSION_LD = 1.35;
    private static final double CONVERSION_DL = 0.74;
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //VARIABLES
        boolean salir=false;
        int opcion;
        double dinero = 0;
        double cambio = 0;

        //INICIO
        System.out.println("     ------- MENU -------");
        System.out.println("1. Cambio de euros a dólares");
        System.out.println("2. Cambio de dólares a euros");
        System.out.println("3. Cambio de euros a libras");
        System.out.println("4. Cambio de libras a euros");
        System.out.println("5. Cambio de libras a dólares");
        System.out.println("6. Cambio de dólares a libras");
        System.out.println("7. Salir");

        do {
            do {
                System.out.println("Introduce una opcion: ");
                opcion = teclado.nextInt();

                if (opcion<1 || opcion>7) {
                    System.out.println("Error. Introduce una opcion valida.");
                }
            } while (opcion<1 || opcion>7);
            
            
            if (opcion != 7) {
                System.out.println("Introduce la cantidad: ");
                dinero = teclado.nextDouble();
            }

            switch (opcion) {
                case 1:
                    cambio = dinero * CONVERSION_ED;
                    break;
                case 2:
                    cambio = dinero * CONVERSION_DE;
                    break;
                case 3:
                    cambio = dinero * CONVERSION_EL;
                    
                    break;
                case 4:
                    cambio = dinero * CONVERSION_LE;
                    break;
                case 5:
                    cambio = dinero * CONVERSION_LD;
                    break;
                case 6:
                    cambio = dinero * CONVERSION_DL;
                    break;
                case 7:
                    salir = true;
                    break;
            
                default:
                    break;
            }
            if (salir==false) {
                System.out.println("El valor es de: " + cambio);
            }
        } while (salir==false);
        
    }
}
