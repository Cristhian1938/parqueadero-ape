public class Visitante extends Usuario {
    private int tiempoUsado; // En horas
    private double costoTotal;

    public Visitante(String nombre, int cedula, int edad, tipoPago metodoPago) {
        super(nombre, cedula, edad, metodoPago);
    }

    public void calcularTiempoUso(int horas) {
        this.tiempoUsado = horas;
    }

    public void calcularCosto(double costoPorHora) {
        this.costoTotal = (tiempoUsado / 60.0) * costoPorHora;
    }


    public Visitante(String nombre, int cedula, int edad, tipoPago metodoPago, int tiempoUsado, double costoTotal) {
        super(nombre, cedula, edad, metodoPago);
        this.tiempoUsado = tiempoUsado;
        this.costoTotal = costoTotal;
    }

    public int getTiempoUsado() {
        return tiempoUsado;
    }

    public double getCostoTotal() {
        return costoTotal;
    }


}
