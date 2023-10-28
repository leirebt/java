package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni(String tipo) {
        super();
        nombre = "Pizza pepperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Extra de pepperoni");
        ingredientes.add("Aceitunas");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 40 min. a 90º. ");

    }
    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos. ");
    }
}
