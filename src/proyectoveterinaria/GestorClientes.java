/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoveterinaria;
import modelo.Cliente;
import java.util.Scanner;
/**
 *
 * @author daniel
 */
public class GestorClientes {

    private final Cliente[] clientes = new Cliente[100];
    private int cantidad = 0;
    private Scanner sc = new Scanner(System.in);


    public boolean registrar(Cliente cliente) {

        if (cliente == null) {
            return false;
        }

        if (cantidad >= clientes.length) {
            return false;
        }

        if (existeDNI(cliente.getDNI())) {
            return false;
        }

        clientes[cantidad] = cliente;
        cantidad++;

        return true;
    }
    
    public boolean modificar(Cliente cliente) {

    if (cliente == null) {
        return false;
    }

    for (int i = 0; i < cantidad; i++) {

        if (clientes[i].getDNI().equals(cliente.getDNI())) {

            clientes[i] = cliente;
            return true;
        }
    }

    return false;
    }
    
    public Cliente eliminar(String dni) {

    for (int i = 0; i < cantidad; i++) {

        if (clientes[i].getDNI().equals(dni)) {

            Cliente eliminado = clientes[i];

            
            for (int j = i; j < cantidad - 1; j++) {
                clientes[j] = clientes[j + 1];
            }


            clientes[cantidad - 1] = null;

            cantidad--;

            return eliminado;
        }
    }

    return null;
    }


   public Cliente buscarPorDNI(String dni) {

    for (int i = 0; i < cantidad; i++) {

        if (clientes[i].getDNI().equals(dni)) {
            return clientes[i];
        }
    }

    return null;
}


    public boolean existeDNI(String dni) {
    return buscarPorDNI(dni) != null;
    }


    public Cliente[] listar() {

        Cliente[] lista = new Cliente[cantidad];

        for (int i = 0; i < cantidad; i++) {
            lista[i] = clientes[i];
        }

        return lista;
    }

    public void agregarClientes() {
    System.out.println("\n===== REGISTRAR CLIENTE =====");

    System.out.print("Ingrese DNI: ");
    String DNI = sc.nextLine();

    System.out.print("Ingrese nombres: ");
    String nombre = sc.nextLine();

    System.out.print("Ingrese apellidos: ");
    String apellido = sc.nextLine();

    System.out.print("Ingrese teléfono: ");
    String telefono = sc.nextLine();

    System.out.print("Ingrese correo: ");
    String correo = sc.nextLine();

    System.out.print("Ingrese dirección: ");
    String direccion = sc.nextLine();

    System.out.print("Ingrese categoría: ");
    String categoria = sc.nextLine();

    System.out.print("Ingrese cantidad de atenciones finalizadas: ");
    int atencionesFinalizadas = sc.nextInt();
    sc.nextLine();

    Cliente nuevoCliente = new Cliente(DNI, nombre, apellido,telefono, correo, direccion,categoria, atencionesFinalizadas);

    if (registrar(nuevoCliente)) {
        System.out.println("¡Cliente registrado correctamente!");
    } else {
        System.out.println("No se pudo registrar. Verifique que el DNI no esté repetido y que haya espacio disponible.");
    }
}
    
    public void mostrarClientes() {
    System.out.println("\n===== LISTA DE CLIENTES =====");

    Cliente[] lista = listar();

    if (lista.length == 0) {
        System.out.println("No hay clientes registrados.");
        return;
    }

    for (int i = 0; i < lista.length; i++) {
        Cliente cliente = lista[i];

        System.out.println("\n--- Cliente " + (i + 1) + " ---");
        System.out.println("DNI: " + cliente.getDNI());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Correo: " + cliente.getCorreo());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Categoría: " + cliente.getCategoria());
        System.out.println("Atenciones finalizadas: " + cliente.getAtencionesFinalizadas());
     }
    }
    
    public void buscarCliente() {
    System.out.println("\n===== BUSCAR CLIENTE =====");

    System.out.print("Ingrese el DNI del cliente: ");
    String dni = sc.nextLine();

    Cliente cliente = buscarPorDNI(dni);

    if (cliente == null) {
        System.out.println("No se encontró ningún cliente con ese DNI.");
        return;
    }

    System.out.println("\n--- Cliente encontrado ---");
    System.out.println("DNI: " + cliente.getDNI());
    System.out.println("Nombre: " + cliente.getNombre());
    System.out.println("Apellido: " + cliente.getApellido());
    System.out.println("Teléfono: " + cliente.getTelefono());
    System.out.println("Correo: " + cliente.getCorreo());
    System.out.println("Dirección: " + cliente.getDireccion());
    System.out.println("Categoría: " + cliente.getCategoria());
    System.out.println("Atenciones finalizadas: " + cliente.getAtencionesFinalizadas());
   }
    
    public void modificarCliente() {
    System.out.println("\n===== MODIFICAR CLIENTE =====");

    System.out.print("Ingrese el DNI del cliente: ");
    String dni = sc.nextLine();

    Cliente cliente = buscarPorDNI(dni);

    if (cliente == null) {
        System.out.println("No se encontró ningún cliente con ese DNI.");
        return;
    }

    System.out.println("\nIngrese los nuevos datos del cliente:");

    System.out.print("Nombres: ");
    String nombre = sc.nextLine();

    System.out.print("Apellidos: ");
    String apellido = sc.nextLine();

    System.out.print("Teléfono: ");
    String telefono = sc.nextLine();

    System.out.print("Correo: ");
    String correo = sc.nextLine();

    System.out.print("Dirección: ");
    String direccion = sc.nextLine();

    System.out.print("Categoría: ");
    String categoria = sc.nextLine();

    System.out.print("Atenciones finalizadas: ");
    int atencionesFinalizadas = sc.nextInt();
    sc.nextLine();

    Cliente clienteActualizado = new Cliente(
        dni, nombre, apellido,
        telefono, correo, direccion,
        categoria, atencionesFinalizadas
    );

    if (modificar(clienteActualizado)) {
        System.out.println("¡Cliente modificado correctamente!");
    } else {
        System.out.println("No se pudo modificar el cliente.");
    }
}
   
    public void eliminarCliente() {
    System.out.println("\n===== ELIMINAR CLIENTE =====");

    System.out.print("Ingrese el DNI del cliente: ");
    String dni = sc.nextLine();

    Cliente eliminado = eliminar(dni);

    if (eliminado == null) {
        System.out.println("No se encontró ningún cliente con ese DNI.");
    } else {
        System.out.println("¡Cliente eliminado correctamente!");
        System.out.println("Cliente eliminado: "
                + eliminado.getNombre() + " "
                + eliminado.getApellido());
    }
}
    
    public void menuClientes() {
    int opcion;

    do {
        System.out.println("=======================================");
        System.out.println("===== GESTIÓN DE CLIENTES =====");
        System.out.println("=======================================");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Mostrar clientes");
        System.out.println("3. Buscar cliente");
        System.out.println("4. Modificar cliente");
        System.out.println("5. Eliminar cliente");
        System.out.println("0. Volver al menú principal");
        System.out.print("Seleccione una opción: ");

        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                agregarClientes();
                break;

            case 2:
                mostrarClientes();
                break;

            case 3:
                buscarCliente();
                break;

            case 4:
                modificarCliente();
                break;

            case 5:
                eliminarCliente();
                break;

            case 0:
                System.out.println("Volviendo al menú principal...");
                break;

            default:
                System.out.println("Opción no válida.");
        }

    } while (opcion != 0);
}


}
