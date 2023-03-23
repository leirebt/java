package Proyectos.Interfaces;

abstract public class Electronico extends Producto implements IElectronico {
    public String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
