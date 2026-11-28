/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoveterinaria;
import proyectoveterinaria.RF03.Registro_Mascotas;

/**
 *
 * @author EQUIPO
 */
public class ProyectoVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorClientes gestorClientes = new GestorClientes();

        gestorClientes.menuClientes();

        Registro_Mascotas registroMascotas = new Registro_Mascotas(gestorClientes);

    }
    
}
