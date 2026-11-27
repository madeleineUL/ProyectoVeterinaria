package proyectoveterinaria;
import proyectoveterinaria.Medicamento;
import proyectoveterinaria.Clientes;

public class Gato extends Mascota {

    public Gato(String codigoMascota, String nombre, String raza, String sexo, String fechaNacimiento, double peso, String estado, Clientes propietario) {

    super(codigoMascota, nombre, "Gato", raza, sexo, fechaNacimiento, peso, estado, propietario);
    }

    @Override
    public double calcularDosis(Medicamento medicamento) {
        return 0;
    }
}
