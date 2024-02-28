package org.lbt.jdbc;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/baseDatos";
        String username = "root";
        String password = "****";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
            while(rs.next()) {
                System.out.println(rs.getString("username"));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
