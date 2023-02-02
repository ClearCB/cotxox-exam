package edu.craptocraft.cotxox.tarifa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.cotxox.carrera.Carrera;

public class TarifaTest {

    // Test para la funcion coste de la distancia: 1.35 por milla
    @Test
    public void getCosteDistanciaTest(){
        
        assertEquals(0,Tarifa.getCosteDistancia(0),0.0);
        assertEquals(1.35,Tarifa.getCosteDistancia(1),0.0);
        assertEquals(2.70,Tarifa.getCosteDistancia(2),0.0);
        assertEquals(3.375,Tarifa.getCosteDistancia(2.5),0.0);
        assertEquals(10.4625,Tarifa.getCosteDistancia(7.75),0.0);
    }

    // Test para la funcion coste del tiempo: 0.35 por minuto
    @Test
    public void getCosteTiempoTest(){

        assertEquals(0, Tarifa.getCosteTiempo(0),0.0);
        assertEquals(0.35, Tarifa.getCosteTiempo(1),0.0);
        assertEquals(0.70, Tarifa.getCosteTiempo(2),0.0);
        assertEquals(1.75, Tarifa.getCosteTiempo(5),0.0);
        assertEquals(3.5, Tarifa.getCosteTiempo(10),0.0);
    }

    // Test para la funcion coste total esperado.
    @Test
    public void getCosteTotalEsperadoTest(){

        // Creamos las variables para el objeto carrera
        String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;

        // Instanciamos un objeto
		Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);

        // Comprobamos que el valor es el esperado
        assertEquals(13.9625, Tarifa.getCosteTotalEsperado(carrera),0.0);

        // Cambiamos los valores
        carrera.setDistancia(0);
        carrera.setTiempoEsperado(0);

        // Volvemos a comprobar que los valores son correctos
        assertEquals(5, Tarifa.getCosteTotalEsperado(carrera),0.0);

    }
}
