package PixelRent;
import java.util.ArrayList;
import java.time.LocalDate;

public class Reserva {
    private int codigoReserva;
    private LocalDate fecha;
    private TurnoUtilizacion turno;
    private EstadoReserva estado;
    private Cliente cliente;
    private ArrayList<DetalleReserva> detalles = new ArrayList<>();
    public Reserva(int codigoReserva, LocalDate fecha,
                   TurnoUtilizacion turno, EstadoReserva estado, Cliente cliente) {
        this.codigoReserva = codigoReserva;
        this.fecha = fecha;
        this.turno = turno;
        this.estado = estado;
        this.cliente = cliente;


    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public TurnoUtilizacion getTurno() {
        return turno;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }
    public Cliente getCliente()

    {
        return cliente;

    }
    public void agregarDetalle(DetalleReserva detalle) {
        detalles.add(detalle);
    }

    public ArrayList<DetalleReserva> getDetalles() {
        return detalles;
    }

}
