package Proyectos.Stream.CalcularImporte;

import java.util.ArrayList;
import java.util.List;

public class CalcularImporteProducto {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(10.0, 3));
        productos.add(new Producto(2.5, 2));
        productos.add(new Producto(5.0, 4));
        productos.add(new Producto(20.0, 1));
        productos.add(new Producto(30.0, 1));

        Double total = productos.stream()
                .map(p -> p.getPrecio() * p.getCantidad())
                .reduce(0.0, (a, b) -> a + b);
        System.out.println("La suma total de todos los productos es " + total);
    }
}
