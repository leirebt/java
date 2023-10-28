package Proyectos.PatronesDeDiseno.Creacional.AbstractFactory.Producto;

public class PizzaCaliforniaQueso extends PizzaProducto {
    public PizzaCaliforniaQueso(String tipo) {
        super();
        nombre = "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa tomate con rúcula";
        ingredientes.add("Extra de queso Mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 35 min. a 100º. ");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triángulos. ");
    }
}

