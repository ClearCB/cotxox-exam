package edu.craptocraft.cotxox.tarifa;

import edu.craptocraft.cotxox.carrera.Carrera;

public final class Tarifa {
    protected static final double COSTE_MILLA = 1.35;
    protected static final double COSTE_MINUTO = 0.35;
    protected static final double COSTE_MINIMO = 5;
    protected static final double PORCENTAJE_COMISION = 20;

    private Tarifa(){}

    public static double getCosteDistancia(double distancia){
        
        return distancia*COSTE_MILLA;
    }

    public static double getCosteTiempo(int tiempo){

        return tiempo*COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera){

        double coste = Tarifa.getCosteTiempo(carrera.getTiempoEsperado()) +  Tarifa.getCosteDistancia(carrera.getDistancia());

        return ( (coste > Tarifa.COSTE_MINIMO) ? coste : Tarifa.COSTE_MINIMO);
    }



}
