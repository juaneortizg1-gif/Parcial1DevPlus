package PixelRent;

public class DetalleReserva {
    private EquipoAudiovisual equipo;
    private int horasUso;

    public DetalleReserva(EquipoAudiovisual equipo, int horasUso) {
        this.equipo = equipo;
        this.horasUso = horasUso;
    }

    public EquipoAudiovisual getEquipo() {
        return equipo;
    }

    public int getHorasUso() {
        return horasUso;
    }
}