package Proyectos.PatronesDeDiseno.Estructural.Decorator.Decoradores;

import Proyectos.PatronesDeDiseno.Estructural.Decorator.Formateable;

public class MayusculaDecorator extends TextoDecorator {

    public MayusculaDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
