package Proyectos.Stream;

import java.util.Arrays;

public class SumaFlujo {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for(int i = 0; i < 100; i++){
            numeros[i] = i;
        }
        double total = Arrays.stream(numeros)
                .filter(n -> n % 10 != 0)
                .mapToDouble(f -> (double) f/2)
                .reduce(0, (a, b) -> a + b);
        System.out.println("El total es: " + total);
    }
}
