package Ejercicio3;

import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        String contrasenha = "JavaEsGenial";
        String contrasenha1 = sc.nextLine();

        if (contrasenha.equals(contrasenha1)) {
            System.out.println("La contraseña es correcta, acceso permitido");
        }

    else{
            System.out.println("La contraseña es incorrecta, tienes el acceso denegado");
        }



    }



}
