package Proyectos.PatronesDeDiseno.Estructural.Decorator.Decoradores;

import Proyectos.PatronesDeDiseno.Estructural.Decorator.Formateable;

public class ReemplazarEspaciosDecorator extends TextoDecorator {

    public ReemplazarEspaciosDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
