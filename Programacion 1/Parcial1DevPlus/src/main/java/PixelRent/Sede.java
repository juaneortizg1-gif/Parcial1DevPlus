package PixelRent;

import java.util.ArrayList;

public class Sede {
    private String nombre;
    private String direccion;
    private ArrayList<EquipoAudiovisual> equipos = new ArrayList<>();

    public Sede(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarEquipo(EquipoAudiovisual equipo) {
        equipos.add(equipo);
    }

    public ArrayList<EquipoAudiovisual> getEquipos() {
        return equipos;
    }
}
