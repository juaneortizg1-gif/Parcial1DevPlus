package co.edu.uniquindio;

public class Desarrollador {
    private String codigo;
    private String nivel;
    private String equipoTrabajo;
    private String maxProyectos;
    private int tarifaDia;
    private String disponibilidad;


    public Desarrollador(String codigo, String nivel, String equipoTrabajo,
                         String maxProyectos, int tarifaDia, String disponibilidad){
        this.codigo= codigo;
        this.nivel= nivel;
        this.equipoTrabajo=equipoTrabajo;
        this.maxProyectos=maxProyectos;
        this.tarifaDia=tarifaDia;
        this.disponibilidad=disponibilidad;
    }
    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getEquipoTrabajo() {
        return equipoTrabajo;
    }

    public void setEquipoTrabajo(String equipoTrabajo) {
        this.equipoTrabajo = equipoTrabajo;
    }

    public String getMaxProyectos() {
        return maxProyectos;
    }

    public void setMaxProyectos(String maxProyectos) {
        this.maxProyectos = maxProyectos;
    }

    public int getTarifaDia() {
        return tarifaDia;
    }

    public void setTarifaDia(int tarifaDia) {
        this.tarifaDia = tarifaDia;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}

