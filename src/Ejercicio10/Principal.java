package Ejercicio10;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Bienvenido al tiempo");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el clima");
        String clima = sc.nextLine();

        System.out.println("Introduce la temperatura");
        int temperatura= sc.nextInt();

        if (clima.equals("soleado")) {
            if (temperatura > 25) {
                System.out.println("Te recomiendo que vayas a la playa");
            } else if (temperatura >= 15 && temperatura <= 25) {
                System.out.println("Te recomiendo que vayas a dar un paseo");
            } else {
                System.out.println("Te recomiendo que vayas a la montaña con chaqueta");
            }

            if (clima.equals("lluvioso")) {
                System.out.println("Te recomiendo que veas una peli en casa");

                if (clima.equals("nublado")) {
                    System.out.println("Te recomiendo que visites un museo");

                }
                {if (clima != "nublado" && clima != "soleado" && clima != "lluvioso") {
                    System.out.println("No tengo recomendación para este clima");
                }

                }
            }
        }
    }
}





