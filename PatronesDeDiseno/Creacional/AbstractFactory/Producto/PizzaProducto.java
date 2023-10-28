package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto(){
        this.ingredientes = new ArrayList<>();
    }

    abstract public void cocinar();

    abstract public void cortar();

    public void preparar() {
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregando la salsa " + salsa);
        System.out.println("Añadiendo ingredientes: ");
        this.ingredientes.forEach(System.out::println);
    }

    public void empaquetar() {
        System.out.println("Poniendo la pizza en una caja… ");
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Pizza " + nombre + " con masa " + masa + ", deliciosa salsa " + salsa + " y con " + ingredientes;
    }
}
