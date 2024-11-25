
public class Bicicleta extends Vehiculo {
    private int numeroMarchas; // Número de velocidades de la bicicleta
    private boolean esElectrica; // Indica si la bicicleta es eléctrica

    // Constructor
    public Bicicleta(String matricula, String modelo, String color, int numeroMarchas, boolean esElectrica) {
        super(matricula, modelo, color);
        this.numeroMarchas = numeroMarchas;
        this.esElectrica = esElectrica;
    }

    // Métodos específicos
    public void verificarTipo() {
        if (esElectrica) {
            System.out.println("La bicicleta es eléctrica.");
        } else {
            System.out.println("La bicicleta es tradicional.");
        }
    }

    public void cambiarMarcha(int marcha) {
        if (marcha > 0 && marcha <= numeroMarchas) {
            System.out.println("Cambiando a la marcha " + marcha + ".");
        } else {
            System.out.println("Marcha inválida. Esta bicicleta tiene " + numeroMarchas + " marchas.");
        }
    }

    // Getters y Setters
    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }
}
