public class Supervisor extends Empleado {
    private String turno;
    private String areaSupervisada;

    public Supervisor(String nombre, int cedula, int edad, double salario, String areaSupervisada) {
        super(nombre, cedula, edad, salario);
        this.areaSupervisada = areaSupervisada;
    }

    public String getTurno() {
        return turno;
    }

    public void asignarTurno(String turno) {
        this.turno = turno;
        System.out.println("Turno asignado al supervisor: " + turno);
    }

    public void resolverConflictos() {
        System.out.println("Supervisor " + getNombre() + " resolviendo conflictos en " + areaSupervisada + ".");
    }


}
