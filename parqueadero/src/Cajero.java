public class Cajero extends Empleado {
    private double totalRecaudado;
    private String puntoCobro;

    public Cajero(String nombre, int cedula, int edad, double salario, String puntoCobro) {
        super(nombre, cedula, edad, salario);
        this.puntoCobro = puntoCobro;
        this.totalRecaudado = 0.0;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void registrarPago(Usuario usuario, double monto) {
        System.out.println("Registrando pago de $" + monto + " por " + usuario.getNombre());
        totalRecaudado += monto;
    }

    public void generarRecibo() {
        System.out.println("Generando recibo en el punto de cobro: " + puntoCobro);
    }
}
