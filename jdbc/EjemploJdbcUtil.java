package org.lbt.jdbc;

import org.lbt.jdbc.util.ConexionBaseDatos;

import java.sql.*;

public class EjemploJdbcUtil {
    public static void main(String[] args) {

        try (Connection con = ConexionBaseDatos.getInstance();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")) {
            while(rs.next()) {
                System.out.print(rs.getString("username"));
                System.out.print(" | ");
                System.out.print(rs.getString("email"));
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
