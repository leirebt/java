package Proyectos.Stream;

import java.util.Arrays;

public class AplanarArrayBidimensional {

    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"},{"php"},{"c#", "python","groovy"},{"java","javascript","kotlin"},
                {"javascript"},{}};

        Arrays.stream(lenguajes)
                .flatMap(l -> Arrays.stream(l))
                .distinct()
                .forEach(System.out::println);
    }
}
