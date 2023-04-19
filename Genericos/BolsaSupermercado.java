package Proyectos.Genericos;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado <T> {

    private List<T> productos;
    private int max = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(T producto) {
        if(this.productos.size() < max) {
            this.productos.add(producto);
        } else {
            throw new RuntimeException("No se pueden almacenar más de 5 productos en la bolsa.");
        }
    }

    public List<T> getProductos() {
        return this.productos;
    }
}
