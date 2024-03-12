package org.lbt.jdbc;

import org.lbt.jdbc.modelo.Producto;
import org.lbt.jdbc.repositorio.ProductoRepositorioImple;
import org.lbt.jdbc.repositorio.Repositorio;
import org.lbt.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {
        try (Connection con = ConexionBaseDatos.getInstance();) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImple();
            System.out.println("···················LISTAR···················");
            repositorio.listar().forEach(System.out::println);

            System.out.println("···················OBTENER POR ID···················");
            System.out.println(repositorio.porId(1L));

            System.out.println("···················ACTUALIZAR···················");
            Producto producto = new Producto();
            producto.setId(6L);
            producto.setNombre("Teclado mecánico");
            producto.setPrecio(450);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado.");
            repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
