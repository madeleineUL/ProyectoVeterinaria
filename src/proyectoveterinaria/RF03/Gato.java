package proyectoveterinaria.RF03;
import proyectoveterinaria.Medicamento;
import modelo.Cliente;

public class Gato extends Mascota {

    public Gato(String codigoMascota, String nombre, String raza, String sexo, String fechaNacimiento, double peso, String estado, Cliente propietario) {

    super(codigoMascota, nombre, "Gato", raza, sexo, fechaNacimiento, peso, estado, propietario);
    }

    @Override
    public double calcularDosis(Medicamento medicamento) {
        return 0;
    }
}
