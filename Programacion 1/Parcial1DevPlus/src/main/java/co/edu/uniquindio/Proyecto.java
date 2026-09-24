package co.edu.uniquindio;

import java.time.LocalDate;

public class Proyecto {
    private int codigo;
    private LocalDate fechaSoli;
    private LocalDate fechaIni;
    private LocalDate entrega;
    private EstadoProyecto estado;
    private MetodoDePago metodoPago;
    private double valorTotal;
    private Desarrollador[] desarrolladores;
    private int cantidadDesarrolladores;
    private ServicioAdicional[] servicios;
    private int cantidadServicios;
    public Proyecto(int codigo, LocalDate fechaSoli, LocalDate fechaIni,
                    LocalDate entrega, MetodoDePago metodoPago) {
        this.codigo = codigo;
        this.fechaSoli = fechaSoli;
        this.fechaIni = fechaIni;
        this.entrega = entrega;
        this.metodoPago = metodoPago;
        this.estado = EstadoProyecto.PENDIENTE;
        this.valorTotal = 0;
        this.desarrolladores = new Desarrollador[10];
        this.cantidadDesarrolladores = 0;
        this.servicios = new ServicioAdicional[10];
        this.cantidadServicios = 0;
    }

    public EstadoProyecto getEstado() {
        return estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaSoli() {
        return fechaSoli;
    }

    public void setFechaSoli(LocalDate fechaSoli) {
        this.fechaSoli = fechaSoli;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getEntrega() {
        return entrega;
    }

    public void setEntrega(LocalDate entrega) {
        this.entrega = entrega;
    }

    public MetodoDePago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoDePago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Desarrollador[] getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(Desarrollador[] desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public int getCantidadDesarrolladores() {
        return cantidadDesarrolladores;
    }

    public void setCantidadDesarrolladores(int cantidadDesarrolladores) {
        this.cantidadDesarrolladores = cantidadDesarrolladores;
    }

    public ServicioAdicional[] getServicios() {
        return servicios;
    }

    public void setServicios(ServicioAdicional[] servicios) {
        this.servicios = servicios;
    }

    public int getCantidadServicios() {
        return cantidadServicios;
    }

    public void setCantidadServicios(int cantidadServicios) {
        this.cantidadServicios = cantidadServicios;
    }

    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
    }
}
