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
    private String usuario;
    private String contraseña;
    private String rol;

    public Empleado(String DNI, String nombre, String apellido) {
        super(DNI, nombre, apellido);
    }


    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    
    public abstract String getRol();
    public abstract void getOpcionesMenu();
    
    
    
    
}
