import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String nombre;
    private String direccion;
    private List<Piso> pisos;

    public Parqueadero(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = new ArrayList<>();
    }

    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    public void buscarPlazaDisponible() {
        System.out.println("Buscando plazas disponibles...");
        for (Piso piso : pisos) {
            piso.mostrarPlazasDisponibles();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
