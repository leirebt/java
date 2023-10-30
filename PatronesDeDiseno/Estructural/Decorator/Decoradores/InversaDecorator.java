package Proyectos.PatronesDeDiseno.Estructural.Decorator.Decoradores;

import Proyectos.PatronesDeDiseno.Estructural.Decorator.Formateable;

public class InversaDecorator extends TextoDecorator {

    public InversaDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
