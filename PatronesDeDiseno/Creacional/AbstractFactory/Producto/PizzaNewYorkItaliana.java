package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana(String tipo) {
        super();
        nombre = "Pizza italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiano con carne";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Jamón");
        ingredientes.add("Aceitunas");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 30 min. a 120º. ");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos grandes. ");
    }
}

