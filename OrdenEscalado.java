import java.util.Scanner;

public class OrdenEscalado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce 10 números enteros:");
        int num[] = new int[10];
        for(int i = 0; i < num.length; i++){
            num[i] = s.nextInt();
        }
        for(int i = 0; i < num.length/2; i++) {
            System.out.println("Posición " + i + " => " + num[i]);
            System.out.println("Posición " + (num.length - i - 1) + " => " + num[num.length - i - 1]);
        }
    }
}
