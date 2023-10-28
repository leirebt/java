package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Fabrica;

import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto.PizzaCaliforniaPepperoni;
import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto.PizzaCaliforniaQueso;
import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto.PizzaCaliforniaVegetariana;
import Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto.PizzaProducto;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo) {
            case "queso":
                producto = new PizzaCaliforniaQueso("queso");
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni("pepperoni");
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana("vegetariana");
                break;
        }
        return producto;
    }

}

