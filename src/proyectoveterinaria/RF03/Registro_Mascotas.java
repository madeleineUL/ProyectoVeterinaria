package proyectoveterinaria.RF03;

import java.util.Scanner;
import proyectoveterinaria.Clientes;
import proyectoveterinaria.Registro_Clientes;

public class Registro_Mascotas {

    private Mascota[] mascotas = new Mascota[100];
    private int contador = 0;
    private Registro_Clientes registroClientes;

    public Registro_Mascotas(Registro_Clientes registroClientes) {
        this.registroClientes = registroClientes;
    }

}
