package org.lbt.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

    private static String url = "jdbc:mysql://localhost:3306/baseDatos";
    private static String username = "root";
    private static String password = "root";
    private static Connection con;

    public static Connection getInstance() throws SQLException {
        if(con == null) {
            con = DriverManager.getConnection(url, username, password);
        }
        return con;
    }
}
