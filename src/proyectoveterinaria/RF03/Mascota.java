package proyectoveterinaria;

public abstract class Mascota {
    protected String codigoMascota;
    protected String nombre;
    protected String especie;
    protected String raza;
    protected String sexo;
    protected String fechaNacimiento;
    protected double peso;
    protected String estado;

    protected Clientes propietario;

    public Mascota(String codigoMascota, String nombre, String especie, String raza, String sexo, String fechaNacimiento, double peso, String estado, Clientes propietario) {

    this.codigoMascota = codigoMascota;
    this.nombre = nombre;
    this.especie = especie;
    this.raza = raza;
    this.sexo = sexo;
    this.fechaNacimiento = fechaNacimiento;
    this.peso = peso;
    this.estado = estado;
    this.propietario = propietario;

      
