package Herencia.Almacen;

import java.util.List;

public class Cesta {
    public static void main(String[] args) {
        Producto[] productosCesta = new Producto[8];
        productosCesta[0] = new Lacteo("Leche desnatada", 2.3, 4, 4);
        productosCesta[1] = new Lacteo("Yogur griego", 1.4, 6, 20);
        productosCesta[2] = new Fruta("Peras", 4.6, 1.2, "verde");
        productosCesta[3] = new Fruta("Naranjas", 2.0, 0.5, "Naranja");
        productosCesta[4] = new Limpieza("Lejía desinfectante", 2.3,
                "Hipoclorito sódico", 2);
        productosCesta[5] = new Limpieza("Jabón de lavadora", 3.7,
                "Carbonato sódico", 2);
        productosCesta[6] = new NoPerecible("Azúcar de caña", 1.5, 2, 12);
        productosCesta[7] = new NoPerecible("Harina de trigo", 1.0, 1, 5);

        for (Producto producto: productosCesta) {
            if(producto instanceof Lacteo) {
                System.out.println("--> Has añadido a la cesta el lácteo: " + producto.getNombre());
            }
            if(producto instanceof Fruta) {
                System.out.println("--> Has añadido a la cesta la fruta: " + producto.getNombre());
            }
            if(producto instanceof Limpieza) {
                System.out.println("--> Has añadido a la cesta el producto de limpieza: "
                        + producto.getNombre());
            }
            if(producto instanceof NoPerecible) {
                System.out.println("--> Has añadido a la cesta el producto no perecedero: "
                        + producto.getNombre());
            }
            System.out.println(producto.toString());
            System.out.println();
        }
    }
}
