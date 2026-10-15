package Batallon;

public class vehiculoDeApoyo extends vehiculos{

    private tipoFuncion tipoFuncion;

    public vehiculoDeApoyo(String id, String modelo, String anioFabricacion,
                           String kilometraje, tipoFuncion tipoFuncion,
                           estadoOperativo estadoOperativo, String misionesCumplidas){

        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCumplidas);

        this.tipoFuncion=  tipoFuncion;

    }

    public tipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(tipoFuncion tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }
}
