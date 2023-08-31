package Proyectos.Stream.CalcularImporte;

public class Producto {
    public Double precio;
    public Integer cantidad;

    public Producto(Double precio, Integer cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
