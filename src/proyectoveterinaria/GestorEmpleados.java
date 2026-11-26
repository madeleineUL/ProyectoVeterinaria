/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoveterinaria;

/**
 *
 * @author EQUIPO
 */
public class GestorEmpleados {
    private Empleado[] empleados = new Empleado[10];
    private int cantidad = 0;
    
    public boolean registrar(Empleado e){
        
        return false;
        
    }
    
    public boolean modificar(Empleado e){
        
        return false;
        
    }
    
    public boolean eliminar(Empleado e){
        
        return false;
        
    }
    
    public Empleado buscarPorDNI(String dni){
        
        return null;
        
    }
    
    public Empleado autenticar(String usuario, String clave){
        
        return null;
        
    }  
    
    public Empleado[] listarPorRol(String rol){
        
        return null;
        
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public Empleado getEmpleado(int i){
        return empleados[i];
    }
    
}
