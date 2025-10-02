package Ejercicio5;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Dime un año");
        Scanner sc = new Scanner(System.in);
        int anho = sc.nextInt();

        if (anho % 4 == 0 && anho % 100 != 0 || anho % 400 == 0) {
            System.out.println("El año es bisiesto");

        } else if (anho % 4 != 0 && anho % 100 == 0 || anho % 400 != 0) {
            System.out.println("El año no es bisiesto");
        }

    }

}

