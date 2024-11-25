public abstract class Persona {
    private String nombre;
    private int cedula;
    private int edad;

    public Persona(String nombre, int cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
}
