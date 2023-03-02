package Herencia.Almacen;

public class Lacteo extends Producto {
    public int cantidad;
    public int proteinas;

    public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return "---Datos del producto---" + '\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: " + precio + "€" + '\n' +
                "Cantidad: " + cantidad + '\n' +
                "Proteínas: " + proteinas;
    }
}
