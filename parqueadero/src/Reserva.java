import java.util.Date;

public class Reserva implements INotificable {
    private Date fechaInicio;
    private Date fechaFin;
    private String codigoReserva;
    private Date fechaCreacion;
    private boolean estado; // true = activa, false = finalizada
    private double costoTotal;

    // Constructor
    public Reserva(Date fechaInicio, Date fechaFin, String codigoReserva, Date fechaCreacion, boolean estado, double costoTotal) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.codigoReserva = codigoReserva;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.costoTotal = costoTotal;
    }

    // Métodos de negocio
    public void confirmarReserva() {
        this.estado = true;
        System.out.println("Reserva confirmada.");
    }

    public void cancelarReserva() {
        this.estado = false;
        System.out.println("Reserva cancelada.");
    }

    public long duracionReserva() {
        return (fechaFin.getTime() - fechaInicio.getTime()) / (1000 * 60 * 60 * 24); // Duración en días
    }

    public double calcularCosto() {
        // Ejemplo básico: costo por día
        double costoPorDia = 10.0; // Tarifa base
        return duracionReserva() * costoPorDia;
    }

    // Implementación de métodos de INotificable
    @Override
    public String enviarNotificacion() {
        return "Notificación enviada para la reserva: " + codigoReserva;
    }

    @Override
    public String obtenerNotificaciones() {
        return "Obteniendo notificaciones para la reserva: " + codigoReserva;
    }

    // Getters y Setters
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public double getCosto() {
        return costoTotal;
    }
}
