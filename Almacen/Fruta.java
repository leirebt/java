package Herencia.Almacen;

public class Fruta extends Producto {
    public double peso;
    public String color;

    public Fruta(String nombre, Double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "---Datos del producto---" + '\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: " + precio + "€" + '\n' +
                "Peso: " + peso + "kg" + '\n' +
                "Color: " + color;
    }
}
