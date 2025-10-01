package Ejercicio2;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Bienvenido al mundo de las matemáticas");
        System.out.println("Vas a aprender a clasificar los triángulos");
        System.out.println("Dime la longitud del primer lado del triángulo");
        Scanner sc = new Scanner(System.in);
        int primerLado = sc.nextInt();
        System.out.println("Dime la longitud del segundo lado");
        Scanner sc2 = new Scanner(System.in);
        int segundoLado = sc2.nextInt();
        System.out.println("Dime la longitud del tercer lado");
        Scanner sc3 = new Scanner(System.in);
        int tercerLado = sc3.nextInt();

        if (primerLado == segundoLado && segundoLado == tercerLado) {
            System.out.println("El triángulo es equilátero");
        }

        if (primerLado != segundoLado && segundoLado != tercerLado) {
            System.out.println("El triángulo es escaleno");
        }

        if (primerLado == segundoLado || primerLado == tercerLado || segundoLado == tercerLado) {
            System.out.println("El triángulo es isósceles");

        }

    }


}
