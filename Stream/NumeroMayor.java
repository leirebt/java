package Proyectos.Stream;

import java.util.Arrays;
import java.util.function.Function;

public class NumeroMayor {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[]{2, -4800, 630, 18};
        Function<Integer[], Integer> num = max -> Arrays.stream(max).reduce(0, (a, b) -> a > b ? a : b);
        Integer resultado = num.apply(numeros);
        System.out.println("El número mayor es: " + resultado);
    }
}
