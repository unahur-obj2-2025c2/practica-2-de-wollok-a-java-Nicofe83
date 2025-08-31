package me.gonzager.ex.operaciones.Drones;

import me.gonzager.Misiones.Mision;

public class DronSeguridad extends Dron {

    public DronSeguridad(Integer autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);

    }

    @Override
    public Boolean esAvanzadoSegunTipo() {
        return this.getProcesamiento() > 50;
    }

}
