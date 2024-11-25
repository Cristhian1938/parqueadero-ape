public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int cedula, int edad, double salario) {
        super(nombre, cedula, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void calcularSalario() {
        System.out.println("El salario de " + getNombre() + " es: $" + salario);
    }
}
