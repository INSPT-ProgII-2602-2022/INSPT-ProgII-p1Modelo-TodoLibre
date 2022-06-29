package todolibre;

import java.util.ArrayList;

public class TodoLibre {

    private ArrayList<Usuario> usuarios;
    private ArrayList<OrdenDeCompra> ordenesDeCompra;

    public TodoLibre() {
        this.usuarios = new ArrayList<>();
        this.ordenesDeCompra = new ArrayList<>();
    }

    public double porcentajeMismasComunas() {
        double porcentaje = 0;
        int cant = 0;
        for (OrdenDeCompra orden : ordenesDeCompra) {
            if (orden.mismaComunaDestinoPartida()) {
                cant++;
            }
        }
        if (!ordenesDeCompra.isEmpty()) {
            porcentaje = cant * 100.0 / ordenesDeCompra.size();
        }
        return porcentaje;
    }

    public int cantPuertaAPuertaGratis() {
        int cant = 0;
        for (OrdenDeCompra orden : ordenesDeCompra) {
            if (orden instanceof OrdenPuertaAPuerta) {
                if (((OrdenPuertaAPuerta) orden).hasEnvioGratis()) {
                    cant++;
                }
            }
        }
        return cant;
    }

}
