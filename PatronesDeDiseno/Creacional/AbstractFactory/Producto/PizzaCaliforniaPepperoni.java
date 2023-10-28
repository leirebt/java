package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {
    public PizzaCaliforniaPepperoni(String tipo) {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa a la piedra gruesa";
        salsa = "Salsa tomate";
        ingredientes.add("Extra de queso Mozzarella");
        ingredientes.add("Pepperonni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 50 min. a 55. ");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectángulos. ");
    }
}
