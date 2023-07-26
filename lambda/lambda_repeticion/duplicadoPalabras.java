package Proyectos.lambda.repeticion;

import java.util.HashMap;
import java.util.Map;

public class duplicadoPalabras {
    public static void main(String[] args) {
        Repeticion cantidadRepetidas = frase -> {
            String[] palabras = frase.replace(".", "")
                    .replace(",", " ").toLowerCase().split(" ");
            Map<String, Integer> mapa = new HashMap<>();
            for(int i = 0; i < palabras.length; i++) {
                int cantidad = 0;
                for(int j = 0; j < palabras.length; j++) {
                    if(palabras[i].equals(palabras[j])) {
                        cantidad++;
                    }
                }
                mapa.put(palabras[i], cantidad);
            }
            return mapa;
        };
        cantidadRepetidas.palabrasRepetidas
                ("En la ciudad de Pamplona hay una plaza. En la plaza hay una esquina. " +
                        "En la esquina hay una casa. En la casa hay una pieza. En la pieza hay una cama. " +
                        "En la cama hay una estera. En la estera hay una barra. En la barra hay una lora. " +
                        "Luego la lora a la barra, la barra a la estera, la estera a la cama, " +
                        "la cama a la pieza, la pieza a la casa, la casa a la esquina, la esquina a la plaza," +
                        " la plaza a la ciudad de Pamplona.").forEach((k, v)->
                System.out.println("La palabra: " + k + " -> se repite " + v + " veces."));
    }
}
