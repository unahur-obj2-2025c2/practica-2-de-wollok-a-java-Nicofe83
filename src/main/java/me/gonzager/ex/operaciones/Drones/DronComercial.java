package me.gonzager.ex.operaciones.Drones;

import me.gonzager.Misiones.Mision;

public class DronComercial extends Dron {

    public DronComercial(Integer autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);

    }

    @Override
    public Boolean esAvanzadoSegunTipo() {
        return Boolean.FALSE;
    }

}
