package Proyectos.lambda;

import java.util.function.Function;

public class SinEspaciosFunction {
    public static void main(String[] args) {
        String frase = "Esto es una frase. Esta otra frase y esta, otra.";
        Function<String, String> fn = fr -> frase.replace(",", "")
                .replace(".", "").replace(" ", "").toUpperCase();
        String resultado = fn.apply(frase);
        System.out.println(resultado);
    }
}
