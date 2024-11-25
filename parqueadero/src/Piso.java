import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int numero;
    private int capacidad;
    private List<PlazaParqueo> plazas;

    public Piso(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.plazas = new ArrayList<>();
    }
    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void agregarPlaza(PlazaParqueo plaza) {
        plazas.add(plaza);
    }

    public void mostrarPlazas() {
        for (PlazaParqueo plaza : plazas) {
            System.out.println("Plaza número: " + plaza.getNumero() + " - Estado: " + plaza.getEstado());
        }
    }

    public void mostrarPlazasDisponibles() {
        for (PlazaParqueo plaza : plazas) {
            if (plaza.getEstado() == tipoEstado.LIBRE) {
                System.out.println("Plaza número: " + plaza.getNumero() + " está disponible.");
            }
        }
    }
}
