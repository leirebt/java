package Proyectos.Genericos;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BolsaSupermercado<Fruta> frutas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> lacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> articulosLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecedero> noPerecederos = new BolsaSupermercado<>();

        frutas.addProducto(new Fruta("Pomelo", 8.43, 0.5, "naranja"));
        frutas.addProducto(new Fruta("Plátano", 3.43, 0.5, "amarillo"));
        frutas.addProducto(new Fruta("Manzana", 2.90, 0.5, "verde"));
        frutas.addProducto(new Fruta("Higo", 5.50, 0.5, "morado"));
        frutas.addProducto(new Fruta("Uvas", 4.44, 0.5, "rojo"));

        lacteos.addProducto(new Lacteo("Queso Idiazabal", 4.55, 1, 21));
        lacteos.addProducto(new Lacteo("Leche entera", 1.25, 1, 45));
        lacteos.addProducto(new Lacteo("Yogur griego", 2.23, 4, 60));
        lacteos.addProducto(new Lacteo("Helado", 1.30, 10, 55));
        lacteos.addProducto(new Lacteo("Flan", 1.55, 4, 67));

        articulosLimpieza.addProducto(new Limpieza("Lejía", 2.4, "Hipoclorito sódico", 1));
        articulosLimpieza.addProducto(new Limpieza("Limpiacristales", 3.77, "Alcohol sódico", 1));
        articulosLimpieza.addProducto(new Limpieza("Bayeta", 1.0, "Algodón", 0));
        articulosLimpieza.addProducto(new Limpieza("Fregasuelos", 3.7, "Jabón", 1));
        articulosLimpieza.addProducto(new Limpieza("Jabón Chimbo", 3.3, "Jabón", 0));

        noPerecederos.addProducto(new NoPerecedero("Lata atún", 4.4, 250, 128));
        noPerecederos.addProducto(new NoPerecedero("Lata guisantes", 2.1, 250, 50));
        noPerecederos.addProducto(new NoPerecedero("Tomate frito", 2.55, 500, 80));
        noPerecederos.addProducto(new NoPerecedero("Alcachofas", 3.5, 250, 44));
        noPerecederos.addProducto(new NoPerecedero("Pasta", 1.0, 500, 270));

        System.out.println("===== COMPRA DE FRUTAS =====");
        for(Fruta fruta : frutas.getProductos()) {
            System.out.println("Nombre: " + fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso: " + fruta.getPeso() + " gr.");
            System.out.println("Color: " + fruta.getColor());
            System.out.println("----------");
        }

        System.out.println("===== COMPRA DE LÁCTEOS =====");
        for(Lacteo lacteo : lacteos.getProductos()) {
            System.out.println("Nombre: " + lacteo.getNombre());
            System.out.println("Precio: " + lacteo.getPrecio());
            System.out.println("Cantidad: " + lacteo.getCantidad() + " gr.");
            System.out.println("Proteínas: " + lacteo.getProteinas());
            System.out.println("----------");
        }

        System.out.println("===== COMPRA DE ARTÍCULOS LIMPIEZA =====");
        for(Limpieza limpieza : articulosLimpieza.getProductos()) {
            System.out.println("Nombre: " + limpieza.getNombre());
            System.out.println("Precio: " + limpieza.getPrecio());
            System.out.println("Componentes: " + limpieza.getComponentes());
            System.out.println("Litros: " + limpieza.getLitros());
            System.out.println("----------");
        }

        System.out.println("===== COMPRA DE ARTÍCULOS NO PERECEDEROS =====");
        for(NoPerecedero np : noPerecederos.getProductos()) {
            System.out.println("Nombre: " + np.getNombre());
            System.out.println("Precio: " + np.getPrecio());
            System.out.println("Calorías: " + np.getCalorias());
            System.out.println("Contenido: " + np.getContenido() + " gr.");
            System.out.println("----------");
        }

    }

}
