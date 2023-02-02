package edu.craptocraft.cotxox.conductores;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ConductorTest {

    @Test
    public void constructorTest(){

        Conductor conductorVacio = new Conductor();
        Conductor conductor = new Conductor("Abel");

        assertNotNull(conductor);
        assertNotNull(conductorVacio);
    }

    @Test
    public void calcularValoracionMediaTest(){

        Conductor conductor = new Conductor("Abel");
        conductor.setMatricula("4ABC123");
        conductor.setModelo( "Chevy Malibu");
        conductor.setValoracion((byte) 4);
        assertEquals(4.0, conductor.getValoracion(), 0);

        conductor.setValoracion((byte) 5);
        assertEquals(4.5, conductor.getValoracion(), 0);
    }
}
