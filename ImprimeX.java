import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class ImprimeX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número:");
        try {
            int n = s.nextInt();
            if(n < 1) {
                System.err.println("ERROR: No se admiten valores menores a 1.");
                exit(0);
            }
        String[][] pintar = new String[n][n];
        Integer[][] array = new Integer[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    pintar[i][j] = "x";
                } else if (i+j == (array.length-1)) {
                    pintar[i][j] = "x";
                } else {
                    pintar[i][j] = "_";
                }
            }
        }
        for(int i = 0; i < pintar.length; i++) {
            for(int j = 0; j < pintar.length; j++) {
                System.out.print(pintar[j][i]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        } catch(InputMismatchException e) {
            System.out.println("Por favor, introduce un valor numérico.");
            main(args);
        }
    }
}
