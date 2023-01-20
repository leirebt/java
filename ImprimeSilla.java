import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class ImprimeSilla {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Añade un número para el tamaño de alto y ancho de la silla:");
        try {
            int n = s.nextInt();
            if(n < 1) {
                System.err.println("ERROR: No se admiten valores menores a 1.");
                exit(0);
            }
            int[][] silla = new int[n][n];
            for (int i = 0; i < silla.length; i++) {
                for (int j = 0; j < silla.length; j++) {
                    if ((i == 0) || (j == silla.length / 2) || (i == (silla.length - 1) && j > silla.length / 2)) {
                        silla[i][j] = 1;
                    } else {
                        silla[i][j] = 0;
                    }
                }
            }
            for (int i = 0; i < silla.length; i++) {
                for (int j = 0; j < silla.length; j++) {
                    System.out.print(silla[j][i]);
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduce un valor numérico.");
            main(args);
        }
    }
}
