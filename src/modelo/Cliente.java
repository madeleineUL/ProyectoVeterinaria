/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author daniel
 */
public class Cliente extends Persona {

    private String telefono;
    private String correo;
    private String direccion;
    private String categoria;
    private int atencionesFinalizadas;

    public Cliente(String DNI, String nombre, String apellido,String telefono, String correo, String direccion,String categoria, int atencionesFinalizadas) {

        super(DNI, nombre, apellido);

        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.categoria = categoria;
        this.atencionesFinalizadas = atencionesFinalizadas;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAtencionesFinalizadas() {
        return atencionesFinalizadas;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setAtencionesFinalizadas(int atencionesFinalizadas) {
        this.atencionesFinalizadas = atencionesFinalizadas;
    }
}
