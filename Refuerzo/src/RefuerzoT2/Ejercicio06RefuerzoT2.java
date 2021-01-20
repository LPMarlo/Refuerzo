package RefuerzoT2;

import java.util.Scanner;

/*
Realizar un programa que solicite la coordenada x e y de un punto e informe si se
encuentre en el primer, segundo, tercer o cuarto cuadrante.
*/
public class Ejercicio06RefuerzoT2 {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double x, y;

        System.out.println("Introduce la coordenada x: ");
        x = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce la coordenada y: ");
        y = Integer.parseInt(teclado.nextLine());

        if (x>0 && y>0) {
            System.out.println("Se encuentra en el primer cuadrante.");
        } else {
            if (x<0 && y>0) {
                System.out.println("Se encuentra en el segundo cuadrante.");
            } else {
                if (x<0 && y<0) {
                    System.out.println("Se encuentra en el tercer cuadrante.");
                } else {
                    System.out.println("Se encuentra en el cuarto cuadrante.");
                }
            }
        }
    }
}
