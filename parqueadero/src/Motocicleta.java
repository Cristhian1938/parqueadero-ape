
public class Motocicleta extends Vehiculo {
    private int numeroRuedas; // Número de ruedas (2 o 3)
    private String tipoLlantas; // Ejemplo: "De calle", "Off-road"
    private int año; // Año de fabricación

    // Constructor
    public Motocicleta(String matricula, String modelo, String color, int numeroRuedas, String tipoLlantas, int año) {
        super(matricula, modelo, color); // Llama al constructor de la clase base Vehiculo
        this.numeroRuedas = numeroRuedas;
        this.tipoLlantas = tipoLlantas;
        this.año = año;
    }

    // Método para mostrar los detalles de la motocicleta
    public void mostrarDetalles() {
        System.out.println("Detalles de la motocicleta:");
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Número de Ruedas: " + numeroRuedas);
        System.out.println("Tipo de Llantas: " + tipoLlantas);
        System.out.println("Año de Fabricación: " + año);
    }

    // Getters y Setters
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getTipoLlantas() {
        return tipoLlantas;
    }

    public void setTipoLlantas(String tipoLlantas) {
        this.tipoLlantas = tipoLlantas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Motocicleta(String matricula, String modelo, String color, int numeroRuedas, String tipoLlantas) {
        super(matricula, modelo, color);
        this.numeroRuedas = numeroRuedas;
        this.tipoLlantas = tipoLlantas;
    }

}
