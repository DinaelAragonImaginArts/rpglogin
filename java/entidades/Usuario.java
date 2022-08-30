/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String user;
    private String correo;
    private int edad;
    private boolean activo;
    
    public Usuario(){
        
    }

    public Usuario(String nombre, String apellido, String user, String correo ,int edad, boolean activo) {
       this.setNombre(nombre);
       this.setApellido(apellido);
       this.setUser(user);
       this.setCorreo(correo);
       this.setEdad(edad);
       this.setActivo(activo);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
