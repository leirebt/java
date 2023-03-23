package Proyectos.Interfaces;

import java.util.Date;

public class Comics extends Libro {
    public String personaje;

    public Comics(int precio, String autor, String titulo, String editorial
            , String personaje) {
        super(precio, autor, titulo, editorial);
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() + (this.getPrecio() * 0.21);
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
}
