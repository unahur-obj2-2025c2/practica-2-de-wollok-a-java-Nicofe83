package me.gonzager.ex.operaciones.Drones;

import me.gonzager.Misiones.Mision;

public abstract class Dron {
    private Integer autonomia = 0;
    private final Integer procesamiento;
    private Mision mision;

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public Dron(Integer autonomia, Integer procesamiento, Mision mision) {
        this.procesamiento = procesamiento;
        this.autonomia = autonomia;
    }

    public Integer getProcesamiento() {
        return procesamiento;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }

    public Integer eficienciaOperativa() {
        return this.autonomia * 10 + mision.eficienciaOperativa();
    }

    public abstract Boolean esAvanzadoSegunTipo();

    public Boolean esAvanzado() {
        return this.esAvanzadoSegunTipo();
    }
}
