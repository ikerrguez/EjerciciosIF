package Ejercicio4;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Bienvenido al sistema.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu peso en kilogramos");
        double peso = sc.nextDouble();
        System.out.println("Dime tu altura en metros");
        double altura = sc.nextDouble();
        double IMC= peso/(altura*altura);
        System.out.println("Tu imc es de : "+IMC);

        if (IMC < 18.5) {
            System.out.println("Tu peso es bajo");
        }
        else if  (IMC >= 18.5 && IMC <= 25) {
            System.out.println("Tu peso es normal");
        }
        else if  (IMC >= 25 && IMC <= 30) {
            System.out.println("Estás en sobrepeso");
        }
        if (IMC >= 30) {
            System.out.println("Tienes obesiddad");
        }

    }

}
