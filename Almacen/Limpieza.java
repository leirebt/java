package Herencia.Almacen;

public class Limpieza extends Producto {
    public String componentes;
    public double litros;

    public Limpieza(String nombre, Double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "---Datos del producto---" + '\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: " + precio + "€" + '\n' +
                "Componentes: " + componentes + '\n' +
                "Litros: " + litros;
    }
}
