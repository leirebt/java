package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana(String tipo) {
        super();
        nombre = "Pizza California Vegetariana";
        masa = "Masa delgada light";
        salsa = "Salsa BBQ light";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 20 min. a 180º. ");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rectángulos. ");
    }
}

