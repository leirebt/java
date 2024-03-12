package org.lbt.jdbc;

import org.lbt.jdbc.modelo.Producto;
import org.lbt.jdbc.repositorio.ProductoRepositorioImple;
import org.lbt.jdbc.repositorio.Repositorio;
import org.lbt.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {
        try (Connection con = ConexionBaseDatos.getInstance();) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImple();
            System.out.println("···················LISTAR···················");
            repositorio.listar().forEach(System.out::println);

            System.out.println("···················OBTENER POR ID···················");
            System.out.println(repositorio.porId(1L));

            System.out.println("···················INSERTAR NUEVO···················");
            Producto producto = new Producto();
            producto.setNombre("Teclado");
            producto.setPrecio(190);
            producto.setFechaRegistro(new Date());
            repositorio.guardar(producto);
            System.out.println("Producto guardado.");
            repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
