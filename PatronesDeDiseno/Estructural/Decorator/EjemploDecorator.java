package Proyectos.PatronesDeDiseno.Estructural.Decorator;

import Proyectos.PatronesDeDiseno.Estructural.Decorator.Decoradores.InversaDecorator;
import Proyectos.PatronesDeDiseno.Estructural.Decorator.Decoradores.MayusculaDecorator;
import Proyectos.PatronesDeDiseno.Estructural.Decorator.Decoradores.ReemplazarEspaciosDecorator;
import Proyectos.PatronesDeDiseno.Estructural.Decorator.Decoradores.SubrayaDecorator;

public class EjemploDecorator {
    public static void main(String[] args) {
        Formateable texto = new Texto("Este es el patrón Decorator.");

        MayusculaDecorator mayuscula = new MayusculaDecorator(texto);
        InversaDecorator reversa = new InversaDecorator(mayuscula);
        SubrayaDecorator subrayar = new SubrayaDecorator(reversa);
        ReemplazarEspaciosDecorator remplazar = new ReemplazarEspaciosDecorator(subrayar);

        System.out.println(remplazar.darFormato());
    }
}
