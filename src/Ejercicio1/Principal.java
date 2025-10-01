package Ejercicio1;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("¡Bienvenido al circo!");
        System.out.println("El precio de la entrada es de 50 euros");
        System.out.println("Dime tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        double precioEntrada =50;

        if (edad < 5) {
            System.out.println("Puedes entrar gratis, ya que tienes menos de 5 años");
        }

        else if (edad > 5 && edad < 12) {
            System.out.println("Tienes un 50% de descuento por tener entre 5 y 12 años");
            precioEntrada=precioEntrada*0.5;
            System.out.println("Entonces tu precio es: "+precioEntrada + " euros ");
        }

        else if (edad > 13 && edad < 65) {
            System.out.println("No dispones de descuento por tener entre 13 y 64 años tendrás que pagar 50 euros");
        }

        else if (edad >= 65) {
            System.out.println("Tienes un 75 % de descuento por tener 65 años o más");
            precioEntrada=precioEntrada*0.25;
            System.out.println("Entonces tu precio es: "+precioEntrada + " euros");
        }

    }
}
