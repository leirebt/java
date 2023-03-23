package Proyectos.Interfaces;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        Producto productos[] = new Producto[4];

        productos[0] = new Comics(18, "Guy Delisle", "Pyongyang",
                "Astiberri Ediciones", "Guy Delisle");
        productos[1] = new Iphone(1200, "Apple", "Verde", "Iphone 11");
        productos[2] = new Libro(23, "Dolores Redondo", "El guardián invisible",
                "Destino");
        productos[3] = new TvLcd(550, "Samsung", 42);

        for(Producto p : productos) {
            if(p instanceof IElectronico) {
                System.out.println("===== ELECTRÓNICA =====");
                if(p instanceof Iphone) {
                    System.out.println("----- IPHONE -----");
                    System.out.println("Color: " + ((Iphone) p).getColor());
                    System.out.println("Modelo: " + ((Iphone) p).getModelo());
                }
                if(p instanceof TvLcd) {
                    System.out.println("----- TV LCD -----");
                    System.out.println("Pulgadas: " + ((TvLcd) p).getPulgada() + "\" ");
                }
                System.out.println("Fabricante: " + ((IElectronico) p).getFabricante());
            }
            if(p instanceof ILibro){
                System.out.println("===== LIBRERÍA =====");
                System.out.println("Autor/a: " + ((ILibro) p).getAutor());
                System.out.println("Título: " + ((ILibro) p).getTitulo());
                System.out.println("Editorial: " + ((ILibro) p).getEditorial());
                if(p instanceof Comics) {
                    System.out.println("Personaje principal del cómic: " + ((Comics) p).getPersonaje());
                }
            }
            System.out.println("Precio sin IVA: " + p.getPrecio() + " €");
            System.out.println("Precio de venta: " + p.getPrecioVenta() + " €");
            System.out.println();
        }
    }
}
