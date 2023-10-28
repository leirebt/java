package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Fabrica;

import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto.PizzaNewYorkItaliana;
import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto.PizzaNewYorkPepperoni;
import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto.PizzaNewYorkVegetariana;
import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto.PizzaProducto;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo) {
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana("vegetariana");
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPepperoni("pepperoni");
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana("italiana");
                break;
        }
        return producto;
    }

}

