package Proyectos.PatronesDeDiseno.Estructural.Decorator.Decoradores;

import Proyectos.PatronesDeDiseno.Estructural.Decorator.Formateable;

public abstract class TextoDecorator implements Formateable {

    protected Formateable texto;

    public TextoDecorator(Formateable texto) {
        this.texto = texto;
    }
}
