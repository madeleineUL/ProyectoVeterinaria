/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.Empleado;

/**
 *
 * @author EQUIPO
 */
public class Veterinario extends Empleado {

    private String horario;

    public Veterinario(String horario, String DNI, String nombre, String apellido) {
        super(DNI, nombre, apellido);
        this.horario = horario;
    }

   
    
    

    public void estaDisponible(String fecha,  int hora){
        
    }
    
    @Override
    public String getRol() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getOpcionesMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 
    
}
