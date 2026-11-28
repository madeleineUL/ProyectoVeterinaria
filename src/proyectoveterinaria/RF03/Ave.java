package proyectoveterinaria.RF03;
import proyectoveterinaria.Medicamento;
import modelo.Cliente;

public class Ave extends Mascota {

    public Ave(String codigoMascota, String nombre, String raza, String sexo, String fechaNacimiento, double peso, String estado, Cliente propietario) {

    super(codigoMascota, nombre, "Ave", raza, sexo, fechaNacimiento, peso, estado, propietario);
    }

    @Override
    public double calcularDosis(Medicamento medicamento) {
        return 0;
    }
}
