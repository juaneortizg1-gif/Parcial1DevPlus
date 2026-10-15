package Batallon;

public class vehiculoBlindado extends vehiculos{
    private String nivelBlindaje;

    public vehiculoBlindado(String id, String modelo, String anioFabricacion,
                            String kilometraje,String nivelBlindaje,
                            estadoOperativo estadoOperativo, String misionesCumplidas){

        super (id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCumplidas);

        this.nivelBlindaje=nivelBlindaje;

    }
    public String getnivelBlindaje(){
        return nivelBlindaje;

        }
    public void setnivelBlindaje(String nivelBlindaje){
        this.nivelBlindaje=nivelBlindaje;
    }



}
