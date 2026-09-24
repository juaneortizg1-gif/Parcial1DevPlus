package co.edu.uniquindio;

public class Proyecto {
    private String codigo;
    private String fechaSoli;
    private String fechaIni;
    private String entrega;
    private String estado;
    private String metodoPago;
    private int valorTotal;

    public Proyecto (String codigo, String fechaSoli, String fechaIni, String entrega,
                     String estado, String metodoPago,int valorTotal){
        this.codigo=codigo;
        this.fechaSoli=fechaSoli;
        this.fechaIni=fechaIni;
        this.entrega=entrega;
        this.estado=estado;
        this.metodoPago=metodoPago;
        this.valorTotal=valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaSoli() {
        return fechaSoli;
    }

    public void setFechaSoli(String fechaSoli) {
        this.fechaSoli = fechaSoli;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }
}
