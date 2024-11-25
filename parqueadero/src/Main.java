import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un parqueadero
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", "Calle Principal #123");
        System.out.println("Parqueadero creado: " + parqueadero.getNombre());
        System.out.println("Dirección: " + parqueadero.getDireccion());



        // Crear pisos y plazas para el parqueadero
        Piso piso1 = new Piso(1, 20);
        parqueadero.agregarPiso(piso1);

        PlazaParqueo plaza1 = new PlazaParqueo(1, "A", tipoEstado.LIBRE);
        PlazaParqueo plaza2 = new PlazaParqueo(2, "B", tipoEstado.LIBRE);
        piso1.agregarPlaza(plaza1);
        piso1.agregarPlaza(plaza2);

        System.out.println("\nPiso y plazas agregados al parqueadero:");
        System.out.println("Piso: " + piso1.getNumero() + ", Total plazas: " + piso1.getCapacidad());
        piso1.mostrarPlazas();

        // Crear vehículos
        Automovil automovil = new Automovil("ABC123", "Toyota", "Rojo", 4, "Gasolina");
        Motocicleta motocicleta = new Motocicleta("XYZ987", "Kawasaki", "Negro", 2, "Deportiva");
        Bicicleta bicicleta = new Bicicleta("SimpleBike", "Specialized", "Verde", 18, true);

        System.out.println("\nVehículos creados:");
        System.out.println("Automóvil: " + automovil.getMatricula());
        System.out.println("Motocicleta: " + motocicleta.getMatricula());
        System.out.println("Bicicleta: " + bicicleta.getModelo());

        // Crear empleados
        Supervisor supervisor = new Supervisor("Carlos Gómez", 987654321, 40, 800, "Zona A");
        Cajero cajero = new Cajero("María Torres", 123456789, 30, 500, "Punto de Cobro #1");

        System.out.println("\nEmpleados creados:");
        System.out.println("Supervisor: " + supervisor.getNombre());
        System.out.println("Cajero: " + cajero.getNombre());

        // Supervisor asigna un turno
        supervisor.asignarTurno("Turno Matutino");
        System.out.println(supervisor.getNombre() + " asignó el turno: " + supervisor.getTurno());

        // Crear usuarios
        ClienteRegular clienteRegular = new ClienteRegular("Juan Pérez", 1234567890, 30, tipoPago.TARJETA_CREDITO, true);
        Visitante visitante = new Visitante("Ana Morales", 123456780, 25, tipoPago.PAYPAL, 0, 0.0);

        System.out.println("\nUsuarios creados:");
        System.out.println("Cliente Regular: " + clienteRegular.getNombre());
        System.out.println("Visitante: " + visitante.getNombre());

        // Cliente Regular realiza una reserva
        Reserva reserva1 = new Reserva(
                new Date(),
                new Date(System.currentTimeMillis() + (24 * 60 * 60 * 1000)), // 1 día después
                "RES001",
                new Date(),
                false,
                0
        );
        clienteRegular.realizarReserva(reserva1);
        plaza1.reservarPlaza(); // Asignar plaza a la reserva
        System.out.println("\nReserva realizada por Cliente Regular:");
        System.out.println("Código de Reserva: " + reserva1.getCodigoReserva());
        System.out.println("Plaza asignada: " + plaza1.getNumero());

        // Visitante usa el parqueadero
        visitante.calcularTiempoUso(120); // 2 horas
        visitante.calcularCosto(1.5); // $1.5 por hora
        System.out.println("\nVisitante finaliza el uso del parqueadero:");
        System.out.println("Tiempo usado: " + visitante.getTiempoUsado() + " minutos.");
        System.out.println("Costo total: $" + visitante.getCostoTotal());

        // Cajero registra el pago de la reserva
        double montoPago = 20.0; // Monto ficticio
        cajero.registrarPago(clienteRegular, montoPago);
        System.out.println("\nCajero registró un pago de: $" + montoPago);
        System.out.println("Total recaudado por el cajero: $" + cajero.getTotalRecaudado());

        // Mostrar estado de las plazas
        System.out.println("\nEstado de las plazas después de las acciones:");
        piso1.mostrarPlazas();
    }
}
