
public class Automovil extends Vehiculo {
    private int numeroPuertas; // Número de puertas del automóvil
    private String tipoCombustible; // Gasolina, diésel, eléctrico, híbrido, etc.

    // Constructor
    public Automovil(String matricula, String modelo, String color, int numeroPuertas, String tipoCombustible) {
        super(matricula, modelo, color);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    // Métodos específicos
    public void verificarCombustible() {
        System.out.println("El tipo de combustible del automóvil es: " + tipoCombustible);
    }

    public void abrirPuertas() {
        System.out.println("Abriendo " + numeroPuertas + " puertas del automóvil.");
    }

    // Getters y Setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
