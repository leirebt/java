package Herencia.Almacen;

public class NoPerecible extends Producto {
    public int contenido;
    public int calorias;

    public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "---Datos de producto---" + '\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: " + precio + "€" + '\n' +
                "Contenido: " + contenido + '\n' +
                "Calorías: " + calorias + '\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: " + precio;
    }
}
