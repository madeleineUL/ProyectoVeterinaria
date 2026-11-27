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
     public void agregarMascota() {

        Scanner sc = new Scanner(System.in);

        if (contador >= mascotas.length) {
            System.out.println("No hay espacio para más mascotas.");
            return;
        }

        System.out.println("=======================================");
        System.out.println("       REGISTRO DE MASCOTAS"            );
        System.out.println("=======================================");

        System.out.println("Ingrese el DNI del propietario:");
        String dni = sc.nextLine();

        Clientes propietario = registroClientes.buscarCliente(dni);

        if (propietario == null) {
            System.out.println("No se encontró al cliente.");
            return;
        }

        System.out.println("Ingrese el código de la mascota:");
        String codigo = sc.nextLine();

        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Seleccione la especie:");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Ave");
        String opcion = sc.nextLine();

        System.out.println("Ingrese la raza:");
        String raza = sc.nextLine();

        System.out.println("Ingrese el sexo:");
        String sexo = sc.nextLine();

        System.out.println("Ingrese la fecha de nacimiento:");
        String fechaNacimiento = sc.nextLine();

        System.out.println("Ingrese el peso en kg:");
        double peso = Double.parseDouble(sc.nextLine());

        System.out.println("Ingrese el estado:");
        String estado = sc.nextLine();

        Mascota nuevaMascota;

        switch (opcion) {
            case "1":
                nuevaMascota = new Perro(codigo, nombre, raza,
                        sexo, fechaNacimiento, peso, estado, propietario);
                break;

            case "2":
                nuevaMascota = new Gato(codigo, nombre, raza,
                        sexo, fechaNacimiento, peso, estado, propietario);
                break;

            case "3":
                nuevaMascota = new Ave(codigo, nombre, raza,
                        sexo, fechaNacimiento, peso, estado, propietario);
                break;

            default:
                System.out.println("Especie no válida.");
                return;
        }

        mascotas[contador] = nuevaMascota;
        contador++;

        System.out.println("=======================================");
        System.out.println("MASCOTA REGISTRADA CORRECTAMENTE       ");
        System.out.println("=======================================");
    }

    public void mostrarMascotas() {

        System.out.println("=======================================");
        System.out.println("       LISTA DE MASCOTAS               ");
        System.out.println("=======================================");

        if (contador == 0) {
            System.out.println("No hay mascotas registradas.");
            return;
        }

        for (int i = 0; i < contador; i++) {

            System.out.println("Código: " + mascotas[i].getCodigoMascota());
            System.out.println("Nombre: " + mascotas[i].getNombre());
            System.out.println("Especie: " + mascotas[i].getEspecie());
            System.out.println("Raza: " + mascotas[i].getRaza());
            System.out.println("Sexo: " + mascotas[i].getSexo());
            System.out.println("Fecha de nacimiento: "
                    + mascotas[i].getFechaNacimiento());
            System.out.println("Peso: " + mascotas[i].getPeso());
            System.out.println("Estado: " + mascotas[i].getEstado());
            System.out.println("Propietario: "
                    + mascotas[i].getPropietario().getNombres());

            System.out.println("---------------------------------------");
        }
    }
}
