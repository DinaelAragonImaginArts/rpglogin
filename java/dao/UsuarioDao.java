package dao;

import dao.Conn;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import views.Game;

public class UsuarioDao {

    private Conn conexion = new Conn();

    public boolean agregarUsuario(Usuario usuario) throws SQLException {
        boolean check = false;
        Connection connect = conexion.conectar();
        try {
            String sql = "INSERT INTO usuario (nombre, apellido, user, correo, edad, activo) values (?,?,?,?,?,?);";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getApellido());
            stmt.setString(3, usuario.getUser());
            stmt.setString(4, usuario.getCorreo());
            stmt.setInt(5, usuario.getEdad());
            stmt.setBoolean(6, usuario.isActivo());

            //Ejecucion de la sentencia
            int cantidad = stmt.executeUpdate();
            check = (cantidad > 0);

        } catch (Exception e) {
            System.out.println("Errro al agregar al Usuario " + e.getMessage());
        } finally {
            connect.close();
        }

        return check;
    }

    public boolean iniciar(Usuario usuario) throws SQLException {
        boolean Existe = false;
        Connection connect = conexion.conectar();
        try {
            String u = usuario.getUser();
            String c = usuario.getCorreo();
            //System.out.println(u + " " + c);
            String sql = "SELECT * FROM  usuario WHERE user ='" + u + "' AND correo ='" + c + "'";
            PreparedStatement stmt = connect.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Existe = (rs.next());
         
            
            usuario.setNombre(rs.getString("nombre"));
            usuario.setApellido(rs.getString("apellido"));
            usuario.setEdad(rs.getInt("edad"));
            usuario.setActivo(rs.getBoolean("activo"));
            Game ventana = new Game();
            ventana.Imprimir(usuario);
            
        } catch (Exception e) {
            System.out.println("Error el usuario no Existe " + e.getMessage());
        } finally {
            connect.close();
        }
        return Existe;
    }

}
