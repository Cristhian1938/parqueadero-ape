public class ClienteRegular extends Usuario {
    private boolean suscripcionActiva;

    public ClienteRegular(String nombre, int cedula, int edad, tipoPago metodoPago, boolean suscripcionActiva) {
        super(nombre, cedula, edad, metodoPago);
        this.suscripcionActiva = suscripcionActiva;
    }

    public boolean isSuscripcionActiva() {
        return suscripcionActiva;
    }

    public void realizarReserva(Reserva reserva) {
        if (suscripcionActiva) {
            if (procesarPago(getMetodoPago(), reserva.getCosto())) {
                reserva.confirmarReserva();
                System.out.println("Reserva realizada exitosamente por el cliente regular utilizando " + getMetodoPago() + ".");
            } else {
                System.out.println("Error al procesar el pago. La reserva no pudo ser realizada.");
            }
        } else {
            System.out.println("El cliente regular no tiene suscripción activa. No se puede realizar la reserva.");
        }
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.cancelarReserva();
        System.out.println("Reserva cancelada por el cliente regular.");
    }

    private boolean procesarPago(tipoPago metodoPago, double monto) {
        System.out.println("Procesando pago de $" + monto + " mediante " + metodoPago + "...");
        switch (metodoPago) {
            case TARJETA_CREDITO:
                System.out.println("Pago realizado con tarjeta de crédito.");
                break;
            case TRANSFERENCIA_BANCARIA:
                System.out.println("Pago realizado mediante transferencia bancaria.");
                break;
            case PAYPAL:
                System.out.println("Pago realizado mediante PayPal.");
                break;
            case EFECTIVO:
                System.out.println("Pago en efectivo registrado.");
                break;
            default:
                System.out.println("Método de pago no reconocido.");
                return false;
        }
        // Simulamos que todos los pagos son exitosos
        return true;
    }
}
