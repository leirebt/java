package Proyectos.Interfaces;

public class Iphone extends Electronico {
    public String color;
    public String modelo;

    public Iphone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() + (this.getPrecio() * 0.21);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
