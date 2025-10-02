package Ejercicio8;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Bienvenido al área restringida");
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Eres un empleado?");
        String empleado = sc.nextLine();

        if (empleado.equals("true")) {
            System.out.println("Acceso permitido");
            System.out.println("¿Qué nivel de acceso eres?");
            int numero = sc.nextInt();
            if (numero == 5) {
                System.out.println("Acceso total");
            } else if (numero <= 4 && numero >= 1) {
                System.out.println("Acceso limitado");
            } else {
                System.out.println("Acceso denegado");

            }
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
