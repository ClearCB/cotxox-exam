package edu.craptocraft.cotxox.carrera;

import edu.craptocraft.cotxox.tarifa.Tarifa;

public class Carrera {
    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;
    
    public Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }

    // Getters and setters
    public String getTarjetaCredito(){
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCosteEsperado(){
        return Tarifa.getCosteTotalEsperado(this);
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    public int getPropina() {
        return this.propina;
    }

    @Override
    public String toString(){
        StringBuilder informacionCarrera = new StringBuilder();

        informacionCarrera.append("La carrera se inicia en: " + this.getOrigen() + ".");
        informacionCarrera.append("\nEl destino es: " + this.getDestino() + ".");
        informacionCarrera.append("\nHay una distancia de: " + this.getDistancia() + " millas.");
        informacionCarrera.append("\nSe espera que el trayecto dure: " + this.getTiempoEsperado() + " minutos.");

        return informacionCarrera.toString();
    }
}
