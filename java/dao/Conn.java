package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conn {
    private Connection conexion;
    private String Driver = "com.mysql.cj.jdbc.Driver";
    private String usuario = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/javaaplication";
    
    public Connection conectar() {
        try {
            Class.forName(this.Driver);
            this.conexion = DriverManager.getConnection(this.url, this.usuario, this.password);
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("show databases;");
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.conexion;        
    }
}
