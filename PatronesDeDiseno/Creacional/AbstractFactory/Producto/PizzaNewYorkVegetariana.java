package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto;

public class PizzaNewYorkVegetariana extends PizzaProducto {
    public PizzaNewYorkVegetariana(String tipo) {
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 25 min. a 150º. ");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en cuadrados. ");
    }
}
