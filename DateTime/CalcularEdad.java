package Proyectos.DateTime;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalcularEdad {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        String fechaNacimiento = JOptionPane.showInputDialog(null,
                "Escribe tu fecha de nacimiento en formato dd-MM-yyyy");
        LocalDate fechaInput = LocalDate.parse(fechaNacimiento,
                DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        Period lapso = Period.between(fechaInput, fechaActual);
        System.out.println("Tienes " + lapso.getYears() + " años, " + lapso.getMonths() + " meses y "
        + lapso.getDays() + " días de edad.");
    }
}
