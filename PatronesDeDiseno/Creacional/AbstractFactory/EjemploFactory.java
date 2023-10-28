package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory;

import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Fabrica.PizzeriaCaliforniaFactory;
import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Fabrica.PizzeriaNewYorkFactory;
import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Fabrica.PizzeriaZonaAbstractFactory;
import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto.PizzaProducto;

public class EjemploFactory {
    public static void main(String[] args) {
        //Siempre tenemos que utilizar la clase más abstracta para crear nuestra instancia.
        // Es por ello que aunque el constructor sea de una fábrica concreta,
        // el objeto que creamos es del tipo genérico.
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory ca = new PizzeriaCaliforniaFactory();

        //El método de ordenar lo hemos establecido en PizzeriaZonaAbstractFactory.
        PizzaProducto pizza = ca.ordenarPizza("queso");
        System.out.println("Juan ordena la pizza " + pizza.getNombre());
        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena la pizza " + pizza.getNombre());
        pizza = ca.ordenarPizza("vegetariana");
        System.out.println("Miren ordena la pizza " + pizza.getNombre());
        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Carmen ordena la pizza " + pizza.getNombre());
        pizza = ca.ordenarPizza("pepperoni");
        System.out.println("Marta ordena la pizza " + pizza.getNombre());
    }
}

