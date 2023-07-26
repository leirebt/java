package Proyectos.lambda;

public class SinEspaciosInterface {
    public static void main(String[] args) {
        QuitarEspacios frase = fr -> fr.replace(",", "")
                .replace(".", "").replace(" ", "").toUpperCase();
        System.out.println(frase.sinEspacios("Esto es otra frase distinta, con otra frase y, por último, otra."));
    }
}
