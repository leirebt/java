import javax.swing.*;
import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int array[] = new int[12];
        String repe[] = new String[6];
        String recuento;

        System.out.println("Introduce 12 números del 1 al 6:");
        for(int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }

        for (int i = 0; i < repe.length; i++) {
            recuento = (i + 1) + ": ";
            for(int j = 0; j < array.length; j++) {
                if (array[j] == (i + 1)) {
                    recuento += "*";
                }
                repe[i] = recuento;
            }
        }

        for(int i = 0; i < repe.length; i++) {
            System.out.println(repe[i]);
        }
    }
}
