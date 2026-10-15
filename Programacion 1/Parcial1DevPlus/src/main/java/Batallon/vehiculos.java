package Batallon;

public abstract class vehiculos {
    protected String id;
    protected String modelo;
    protected String anioFabricacion;
    protected String kilometraje;
    protected estadoOperativo estadoOperativo;
    protected String misionesCumplidas;
    protected tipoVehiculo tipoVehiculo;




    public vehiculos (String id, String modelo, String anioFabricacion,
                      String kilometraje, estadoOperativo estadoOperativo, String misionesCumplidas){

        this.id= id;
        this.modelo= modelo;
        this.anioFabricacion= anioFabricacion;
        this.kilometraje=kilometraje;
        this.estadoOperativo= estadoOperativo.DISPONIBLE;
        this.misionesCumplidas= misionesCumplidas;


    }
    public String getid() {
        return id;
    }
    public void setid (String id){
        this.id=id;
    }
    public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
        this.modelo=modelo;
    }
    public String getAnioFabricacion(){
        return anioFabricacion;
    }
    public void setAnioFabricacion (String anioFabricacion){
        this.anioFabricacion=anioFabricacion;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public estadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(estadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public String getMisionesCumplidas() {
        return misionesCumplidas;
    }

    public void setMisionesCumplidas(String misionesCumplidas) {
        this.misionesCumplidas = misionesCumplidas;
    }
    public String toString(){
      return "vehiculos{ id="+ id+ "modelo= "+ modelo+ "año de fabricacion= "
              + anioFabricacion+ "kilometraje= "+ kilometraje+ "Estado operativo"
              +estadoOperativo+ "numero demisiones cumplidas"+ misionesCumplidas+"tipo de vehiculo" ;
    }

}