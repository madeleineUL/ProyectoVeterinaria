/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoveterinaria;

import modelo.Empleado;

/**
 *
 * @author EQUIPO
 */
public class GestorEmpleados {
    private Empleado[] empleados = new Empleado[10];
    private int cantidad = 0;
    
    public boolean registrar(Empleado e){
        if (e== null) return false;
        if (buscarPorDNI(e.getDNI())!=null) return false;
        if (buscarPorUsuario(e.getUsuario())!=null) return false;
    
        empleados[cantidad] =e;
        cantidad++;
        return true;
                
    }
    
    public boolean modificar(String DNI, Empleado e){
        int posicion = posicionPorDNI(DNI);
        if (posicion==-1){
            return false;
        }
        //chequear DNI duplicado
        Empleado otroDNI = buscarPorDNI(e.getDNI());
        if (otroDNI != null && otroDNI != empleados[posicion]){
            return false;
        }
        
        //chequear usuario duplicado
        Empleado otroUsuario = buscarPorUsuario(e.getUsuario());
        if (otroUsuario != null && otroUsuario != empleados[posicion]) return false;
        
        empleados[posicion] = e;
        return true;
        
    }
    
    public boolean eliminar(String DNI){
        int pos = posicionPorDNI(DNI);
        if (pos == -1) return false;

        for (int i = pos; i < cantidad - 1; i++) {
            empleados[i] = empleados[i + 1];   // desplaza a la izquierda
        }
        empleados[cantidad - 1] = null;
        cantidad--;
        return true;
        
    }
    
    public Empleado buscarPorDNI(String DNI){
        int pos = posicionPorDNI(DNI);
        return pos == -1 ? null : empleados[pos];
        
    }
    
    public Empleado buscarPorUsuario(String usuario){
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getUsuario().equalsIgnoreCase(usuario)) {
                return empleados[i];
            }
        }
        return null;
    }
    
    public Empleado autenticar(String usuario, String contraseña){
        Empleado e = buscarPorUsuario(usuario);
        if (e != null && e.getContraseña().equals(contraseña)) {
            return e;
        }
        return null;   // contraseña incorrecta
    }  
    
    public Empleado[] listarPorRol(String rol){
      int contador = 0;
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getRol().equalsIgnoreCase(rol)) contador++;
        }

        Empleado[] resultado = new Empleado[contador];
        int k = 0;
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getRol().equalsIgnoreCase(rol)) {
                resultado[k++] = empleados[i];
            }
        }
        return resultado;
        
    }
    
    private int posicionPorDNI(String dni) {
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getDNI().equals(dni)) return i;
        }
        return -1;
    }

    private void ampliarArreglo() {
        Empleado[] nuevo = new Empleado[empleados.length * 2];
        for (int i = 0; i < cantidad; i++) {
            nuevo[i] = empleados[i];
        }
        empleados = nuevo;
    }
    
    
    public int getCantidad(){
        return cantidad;
    }
    
    public Empleado getEmpleado(int i){
        return empleados[i];
    }
    
}
