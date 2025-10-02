package Ejercicio7;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Introduce una nota numérica del 0 al 100");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        String primerTramo= "A";
        String segundoTramo= "B";
        String tercerTramo= "C";
        String cuartoTramo= "D";
        String quintoTramo= "F";

        if (nota >= 0 && nota <= 59) {
            System.out.println("La nota numérica " +nota+ " se convertirá en la letra " + quintoTramo + " de suspenso");
        }else if (nota >= 60 && nota <= 69) {
            System.out.println("La nota numérica " +nota+ " se convertirá en la letra " + cuartoTramo + " de suficiente");
        }else if (nota >= 70 && nota <= 79) {
            System.out.println("La nota numérica " +nota+ " se convertirá en la letra " + tercerTramo + " de aprobado");
        }else if  (nota >= 80 && nota <= 89) {
            System.out.println("La nota numérica " +nota+ " se convertirá en la letra " + segundoTramo + " de notable");
        }else if (nota >= 90 && nota <= 99) {
            System.out.println("La nota numérica " +nota+ " se convertirá en la letra " + primerTramo + " de sobresaliente");
        }else {
            System.out.println("Error, era solo del 0 al 100");
        }

    }
}
