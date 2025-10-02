package Ejercicio9;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Introduce tres números enteros diferentes");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = sc.nextInt();
        System.out.println("Introduce el tercer número");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor es: " + numero1);
        }else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El mayor es: " + numero2);
        }else {
            System.out.println("El mayor es: " + numero3);
        }


    }
}
