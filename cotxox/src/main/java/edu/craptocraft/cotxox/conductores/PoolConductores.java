package edu.craptocraft.cotxox.conductores;

import java.util.List;
import java.util.Optional;

public class PoolConductores {
    List<Conductor> conductores;

    public PoolConductores(List<Conductor> conductores){
        this.conductores = conductores;
    }

    public List<Conductor> getPoolConductores(){
        return this.conductores;
    }

    public Conductor asignarConductor(){

        Conductor ningunoLibre = null;
        Optional<Conductor> conductorAsignado = this.getPoolConductores().stream()
                                                     .filter(conductor -> !conductor.isOcupado())
                                                     .findFirst();

        return conductorAsignado.isPresent() ? conductorAsignado.get() : ningunoLibre;
    }
}
