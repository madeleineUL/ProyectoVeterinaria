/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoveterinaria;

/**
 *
 * @author EQUIPO
 */
public class ProyectoVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registro_Clientes registroClientes = new Registro_Clientes();

        Registro_Mascotas registroMascotas = new Registro_Mascotas(registroClientes);

    }
    
}
