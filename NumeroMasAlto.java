import java.util.Scanner;

import static java.lang.System.exit;

public class NumeroMasAlto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce 7 números del 11 al 99:");
        int num[] = new int[7];
        for(int i = 0; i < 7; i++) {
            num[i] = s.nextInt();
            if(num[i] < 11 || num[i] > 99) {
                System.out.println("Has añadido un número menor a 11 o mayor a 99.\n");
                main(args);
            }
        }
        int max = num[0];
        for(int i = 1; i < num.length; i++) {
            max = (max > num[i]) ? max : num[i];
        }
        System.out.println("El número más alto es = " + max);
        exit(0);
    }
}
