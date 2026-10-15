package Batallon;

import javax.swing.*;

public class Main {



    public static void main(String[] args) {
        String[] menu = {
                "1. Registrar un vehiculo",
                "2. Registrar mision ",
                "3. evalucion de vehiculo",
                "4. salir"
        };



    }

    public static void registrarVehiculo() {
        String id = leerTexto("Ingrese el id del vehiculo: ");
        String modelo = leerTexto("Ingrese el modelo del vehiculo: ");
        String anioFabricacion = leerTexto("ingrese el año en el que fue fabricado: ");
        String kilometraje = leerTexto("Cuanto kilometraje tiene el vehiculo: ");
        tipoVehiculo tipo = (tipoVehiculo) JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de vehiculo:",
                "Tipo de vehiculo",
                0,
                null,
                new tipoVehiculo[]{
                        tipoVehiculo.TRANSPORTE_DE_TROPAS,
                        tipoVehiculo.VEHICULO_BLINDADO,
                        tipoVehiculo.VEHICULO_DE_APOYO
                },
                null
        );


    }


    public static String leerTexto(String mensaje) {
        JOptionPane.showInputDialog(mensaje);
        return mensaje;
    }

}


