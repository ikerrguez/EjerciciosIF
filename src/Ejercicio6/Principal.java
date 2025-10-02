package Ejercicio6;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Bienvenido a tu cajero de confianza");
        System.out.println("Marca 1 si quieres consultar tu saldo");
        System.out.println("Marca 2 si quieres ingresar dinero");
        System.out.println("Marca 3 si quieres retirar dinero");
        System.out.println("Marca 4 si quieres salir");

        System.out.println("Elige un número del 1 al 4 acorde a lo que quieres hacer");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero == 1){
            System.out.println("Consultar tu saldo");
        }else if (numero == 2){
            System.out.println("Ingresar dinero");
        }else if (numero == 3){
            System.out.println("Retirar dinero");
        }else if (numero == 4){
            System.out.println("Salir");
        }else {
            System.out.println("Error");
        }












    }



}
