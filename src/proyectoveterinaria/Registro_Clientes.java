/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoveterinaria;
import java.util.Scanner;
/**
 *
 * @author daniel
 */
public class Registro_Clientes {


    Clientes[] clientes = new Clientes[100];
    int contador = 0;


    public void agregarClientes() {

        Scanner sc = new Scanner(System.in);


        if (contador >= clientes.length) {
            System.out.println("No hay espacio para más clientes.");
            return;
        }

        System.out.println("=======================================");
        System.out.println("BIENVENIDO AL SISTEMA DE REGISTRO DE CLIENTES");
        System.out.println("=======================================");

        System.out.println("Ingrese el DNI:");
        String dni = sc.nextLine();


        for (int i = 0; i < contador; i++) {

            if (clientes[i].getDNI().equals(dni)) {
                System.out.println("Este DNI ya está registrado.");
                return;
            }
        }

        System.out.println("Ingrese los nombres:");
        String nombres = sc.nextLine();

        System.out.println("Ingrese los apellidos:");
        String apellidos = sc.nextLine();

        System.out.println("Ingrese el telefono:");
        String telefono = sc.nextLine();

        System.out.println("Ingrese el email:");
        String email = sc.nextLine();

        System.out.println("Ingrese la direccion:");
        String direccion = sc.nextLine();


        Clientes nuevo = new Clientes(dni,nombres,apellidos,telefono,email,direccion);


        clientes[contador] = nuevo;
        contador++;

        System.out.println("=======================================");
        System.out.println("CLIENTE REGISTRADO CORRECTAMENTE");
        System.out.println("=======================================");
    }


    public void mostrarClientes() {

        System.out.println("=======================================");
        System.out.println("       LISTA DE CLIENTES REGISTRADOS");
        System.out.println("=======================================");


        if (contador == 0) {
            System.out.println("No hay clientes registrados.");
            return;
        }


        for (int i = 0; i < contador; i++) {

            System.out.println("Cliente N° " + (i + 1));
            System.out.println("DNI: " + clientes[i].getDNI());
            System.out.println("Nombres: " + clientes[i].getNombres());
            System.out.println("Apellidos: " + clientes[i].getApellidos());
            System.out.println("Telefono: " + clientes[i].getTelefono());
            System.out.println("Email: " + clientes[i].getEmail());
            System.out.println("Direccion: " + clientes[i].getDireccion());

            System.out.println("---------------------------------------");
        }
    }
    
    public void menuClientes() {

    Scanner sc = new Scanner(System.in);
    int opcion;

    do {

        System.out.println("\n=======================================");
        System.out.println("          MENU DE CLIENTES");
        System.out.println("=======================================");
        System.out.println("1. Agregar un cliente nuevo");
        System.out.println("2. Mostrar clientes actuales");
        System.out.println("3. Salir del menu");
        System.out.println("=======================================");
        System.out.println("Seleccione una opcion:");

        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                agregarClientes();
                break;

            case 2:
                mostrarClientes();
                break;

            case 3:
                System.out.println("Saliendo del menu de clientes...");
                break;

            default:
                System.out.println("Opcion no valida. Intente nuevamente.");
                break;
        }

    } while (opcion != 3);
}
}
