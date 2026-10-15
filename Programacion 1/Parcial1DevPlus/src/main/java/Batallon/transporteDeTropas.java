package Batallon;

public class transporteDeTropas extends vehiculos{

    private int capacidadSoldados;

    public transporteDeTropas(String id, String modelo, String anioFabricacion,
                              String kilometraje, int capacidadSoldados,
                              estadoOperativo estadoOperativo, String misionesCumplidas){

        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCumplidas);
        this.capacidadSoldados=capacidadSoldados;
    }

    public int getCapacidadSoldados() {
        return capacidadSoldados;
    }

    public void setCapacidadSoldados(int capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }
}
