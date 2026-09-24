package co.edu.uniquindio;

import javax.naming.PartialResultException;

public class ServicioAdicional {
    private String codigo;
    private String nombre;
    private String descripcion;
    private int precio;
    private String disponibilidad;

    public ServicioAdicional( String codigo,String nombe, String descripcion,
                              int precio, String disponibilidad){
        this.codigo=codigo;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio= precio;
        this.disponibilidad=disponibilidad;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setcodigo(String codigo){
        this.codigo=codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}


