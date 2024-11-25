public class PlazaParqueo {
    private int numero;
    private String bloque;
    private tipoEstado estado;

    public PlazaParqueo(int numero, String bloque, tipoEstado estado) {
        this.numero = numero;
        this.bloque = bloque;
        this.estado = estado;
    }

    public void reservarPlaza() {
        this.estado = tipoEstado.RESERVADO;
    }

    public void liberarPlaza() {
        this.estado = tipoEstado.LIBRE;
    }

    public int getNumero() {
        return numero;
    }

    public tipoEstado getEstado() {
        return estado;
    }
}
