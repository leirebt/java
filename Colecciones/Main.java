package Proyectos.Colecciones;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Vuelo> vuelos = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm");

        vuelos.add(new Vuelo("AAL933", "New York", "Santiago",
                df.parse("29/08/2021 05:39"), 62));
        vuelos.add(new Vuelo("LAT755", "Sao Paulo", "Santiago",
                df.parse("31/08/2021 04:45"), 47));
        vuelos.add(new Vuelo("SKU621", "Rio De Janeiro", "Santiago",
                df.parse("30/08/2021 16:00"), 52));
        vuelos.add(new Vuelo("DAL147", "Atlanta", "Santiago",
                df.parse("29/08/2021 13:22"), 59));
        vuelos.add(new Vuelo("AVA241", "Bogotá", "Santiago",
                df.parse("31/08/2021 14:05"), 25));
        vuelos.add(new Vuelo("AMX10", "Mexico City", "Santiago",
                df.parse("31/08/2021 05:20"), 29));
        vuelos.add(new Vuelo("IBE6833", "Londres", "Santiago",
                df.parse("30/08/2021 08:45"), 55));
        vuelos.add(new Vuelo("LAT2479", "Frankfurt", "Santiago",
                df.parse("29/08/2021 07:41"), 51));
        vuelos.add(new Vuelo("SKU803", "Lima", "Santiago",
                df.parse("30/08/2021 10:35"), 48));
        vuelos.add(new Vuelo("LAT533", "Los Ángeles", "Santiago",
                df.parse("29/08/2021 09:14"), 59));
        vuelos.add(new Vuelo("LAT1447", "Guayaquil", "Santiago",
                df.parse("31/08/2021 08:33"), 31));
        vuelos.add(new Vuelo("CMP111", "Panamá City", "Santiago",
                df.parse("31/08/2021 15:15"), 29));
        vuelos.add(new Vuelo("LAT705", "Madrid", "Santiago",
                df.parse("30/08/2021 08:14"), 47));
        vuelos.add(new Vuelo("AAL933", "Miami", "Santiago",
                df.parse("29/08/2021 22:53"), 60));
        vuelos.add(new Vuelo("ARG5091", "Buenos Aires", "Santiago",
                df.parse("31/08/2021 09:57"), 32));
        vuelos.add(new Vuelo("LAT1283", "Cancún", "Santiago",
                df.parse("31/08/2021 04:00"), 35));
        vuelos.add(new Vuelo("LAT579", "Barcelona", "Santiago",
                df.parse("29/08/2021 07:45"), 61));
        vuelos.add(new Vuelo("AAL945", "Dallas-Fort Worth", "Santiago",
                df.parse("30/08/2021 07:12"), 58));
        vuelos.add(new Vuelo("LAT501", "París", "Santiago",
                df.parse("29/08/2021 18:29"), 49));
        vuelos.add(new Vuelo("LAT405", "Montevideo", "Santiago",
                df.parse("29/08/2021 15:45"), 39));

        vuelos.sort((v1, v2) -> v2.getFechaLlegada().compareTo(v1.getFechaLlegada()));
        System.out.println("----Orden de llegada ascendente----");
        vuelos.forEach(v -> System.out.println(v.toString()));

        System.out.println("----El vuelo con menor número de pasajeros es----");
        vuelos.sort(Comparator.comparing(Vuelo::getCantidadPasajeros));
        System.out.println(vuelos.get(0).getNombre());
        System.out.println("Destino: " + vuelos.get(0).getDestino());
        System.out.println(vuelos.get(0).getCantidadPasajeros() + " pasajeros.");
    }
}
