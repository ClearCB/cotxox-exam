package edu.craptocraft.cotxox.carrera;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import edu.craptocraft.cotxox.tarifa.*;

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
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
        assertEquals("La carrera se inicia en: Aeroport Son Sant Joan."+
                     "\nEl destino es: Magaluf."+
                     "\nHay una distancia de: 7.75 millas."+
                     "\nSe espera que el trayecto dure: 10 minutos."
                                                , carrera.toString());
    }

	@Test
	public void getCosteEsperadoTarifaTest(){

		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		Carrera carrera = new Carrera(tarjetaCredito);

		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);

		assertEquals(13.9625,carrera.getCosteEsperado(),0.0);

		// Cambiamos los valores
		carrera.setDistancia(0);
		carrera.setTiempoEsperado(0);

		// Volvemos a comprobar que los valores son correctos
		assertEquals(5, Tarifa.getCosteTotalEsperado(carrera),0.0);
	}
}
