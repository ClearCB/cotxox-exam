package edu.craptocraft.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private List<Byte> valoraciones = new ArrayList<Byte>();


    public Conductor(){}

    public Conductor(String nombre){
        this.nombre = nombre;
    }
    
    // Getters and Setters


    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public double getValoracionMedia() {
        return this.valoracionMedia;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }

    public int getNumeroValoraciones(){
        return this.valoraciones.size();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setValoracionMedia() {
        this.valoracionMedia = this.calcularValoracionMedia();
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setValoracion(byte valoracion){
        this.valoraciones.add(valoracion);
        this.setValoracionMedia();
    }

    private double calcularValoracionMedia(){

        byte sumaValoriacion = 0;

        for (byte valoracion: this.valoraciones){
            sumaValoriacion+=valoracion;
        }

        return (double) sumaValoriacion / this.getNumeroValoraciones();
    }
}
