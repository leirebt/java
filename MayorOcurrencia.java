import java.util.Scanner;

public class MayorOcurrencia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nums[] = new int[10];
        int repetidos[] = new int[10];
        int pos = 0;
        int max = 0;

        System.out.println("Introduce 10 números del 1 al 9:");
        for(int i = 0; i < 10; i++) {
            nums [i] = s.nextInt();
        }
        for(int i = 0; i < nums.length; i++) {
            int repe = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    repe++;
                }
            }
            repetidos[i] = repe;
        }
        for(int i = 0; i < nums.length; i++) {
            if(max < repetidos[i]) {
                max = repetidos[i];
                pos = i;
            }
        }
        System.out.println("El número más repetido es el " + nums[pos] + ".");
        System.out.println("Se ha repetido " + max + " veces.");
    }
}
