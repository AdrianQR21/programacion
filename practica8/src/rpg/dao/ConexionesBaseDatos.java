package rpg.dao;

import java.sql.*;

public class ConexionesBaseDatos {
    private String url;
    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;

    public ConexionesBaseDatos () throws SQLException {
        try{
        this.url = "jdbc:postgresql://localhost:5432/XRPG";
        this.statement = connection.createStatement();
        this.connection =DriverManager.getConnection(url);

        }
        catch (SQLException e) {
            System.out.println("Error en la conexion ");
        }
    }
}

