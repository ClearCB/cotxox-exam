package edu.craptocraft.cotxox.carrera;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CarreraTest {
    
    @Test
    public void constructorTest(){

		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;

		Carrera carrera = new Carrera(tarjetaCredito);
        assertNotNull(carrera);
        assertEquals("La carrera se inicia en: " + carrera.getOrigen()+"."+
                     "\nEl destino es: " + carrera.getDestino()+"."+
                     "\nHay una distancia de: " + carrera.getDistancia() + "Km."+
                     "\nEl cliente ha esperado: " + carrera.getTiempoEsperadoMinutos + "minutos."
                                                , carrera.toString());
    }
}
