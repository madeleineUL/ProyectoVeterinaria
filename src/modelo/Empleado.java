/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author EQUIPO
 */
public abstract class Empleado extends Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
    private String rol;

    public Empleado(String DNI, String nombre, String apellido, String usuario, String contraseña, String rol) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRol() {
        return rol;
    }
    
    
    
    
    
}
