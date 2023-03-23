package Proyectos.Interfaces;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    public Date fechaPublicacion;
    public String autor;
    public String titulo;
    public String editorial;

    public Libro(int precio,String autor, String titulo, String editorial) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() + (this.getPrecio() * 0.21);
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
