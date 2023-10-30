package Proyectos.PatronesDeDiseno.Estructural.Decorator.Decoradores;

import Proyectos.PatronesDeDiseno.Estructural.Decorator.Formateable;

public class SubrayaDecorator extends TextoDecorator {
    public SubrayaDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n");
        for(int i = 0; i < largo;i++){
            sb.append("_");
        }
        return sb.toString();
    }
}
