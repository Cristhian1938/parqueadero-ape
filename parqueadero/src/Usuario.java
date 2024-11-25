public class Usuario extends Persona {
    private tipoPago metodoPago;

    public Usuario(String nombre, int cedula, int edad, tipoPago metodoPago) {
        super(nombre, cedula, edad);
        this.metodoPago = metodoPago;
    }

    public tipoPago getMetodoPago() {
        return metodoPago;
    }
}
