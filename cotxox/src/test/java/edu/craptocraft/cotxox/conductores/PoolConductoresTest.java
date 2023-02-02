package edu.craptocraft.cotxox.conductores;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PoolConductoresTest {

    @Test
    public void constructorTest() {

        PoolConductores poolConductores = new PoolConductores(new ArrayList<>());
        assertNotNull(poolConductores);
    }

    @Test
    public void comprobarLongitud() {

        PoolConductores conductores = new PoolConductores(new ArrayList<>());

        assertEquals(0, conductores.getPoolConductores().size());
		List<Conductor> poolConductores = new ArrayList<Conductor>();
		Conductor conductor = null;

		String[] nombres = { "Samantha", "Fox", "Mola" };
		for (String nombre : nombres) {
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}

		String[] matricula = { "4ABC123", "5DHJ444", "7JKK555" };
		String[] modelos = { "Chevy Malibu", "Toyota Prius", "Mercedes A" };

		int index = 0;
		for (Conductor conductora : poolConductores) {
			conductora.setMatricula(matricula[index]);
			conductora.setModelo(modelos[index]);
			// suponemos que las conductoras tienen una valoracion inicial de 4 stars
			conductora.setValoracion((byte) 4);
			index++;
		}

		// Creamos el objeto flota de conductores, de la clase PoolConductores.

		PoolConductores conductoresGreat = new PoolConductores(poolConductores);
        assertEquals(3, conductoresGreat.getPoolConductores().size());

    }
}
