package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Fabrica;

import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto.PizzaProducto;

public abstract class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo) {
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("----- Cocinando la pizza " + pizza.getNombre() + " -----");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);

}
