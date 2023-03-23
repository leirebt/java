package Proyectos.Interfaces;

abstract public class Producto implements IProducto {
    public int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
