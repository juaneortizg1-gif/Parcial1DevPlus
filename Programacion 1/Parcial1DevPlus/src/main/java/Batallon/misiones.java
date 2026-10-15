package Batallon;

import java.time.LocalDate;

public class misiones  {
    private LocalDate fecha;
    private String ubicacion;
    private String personalAsigndo;


    public misiones (LocalDate fecha, String ubicacion, String personalAsigndo){

        this.fecha=fecha;
        this.ubicacion=ubicacion;
        this.personalAsigndo=personalAsigndo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPersonalAsigndo() {
        return personalAsigndo;
    }

    public void setPersonalAsigndo(String personalAsigndo) {
        this.personalAsigndo = personalAsigndo;
    }
}
