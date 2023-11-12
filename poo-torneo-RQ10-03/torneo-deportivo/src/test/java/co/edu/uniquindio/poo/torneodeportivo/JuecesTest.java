package co.edu.uniquindio.poo.torneodeportivo;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.*;

public class JuecesTest {

    private static final Logger LOG = Logger.getLogger(JugadorTest.class.getName());

    @Test
    void juezDatosNulos() {
        LOG.info("Inicio prueba datos nulos");
        Jueces juez = new Jueces("Andres Correa", "001", "correavalencia334@gmail.com", "3054374735");
        assertNotNull(juez);
        LOG.info("Fin prueba datos nulos");
    }

    @Test
    void testRegistrarjueces() {
        Jueces juez1 = new Jueces("Pacho", "002", "pacho@gmail.com", "3002682946");
        Jueces juez2 = new Jueces("Andres Correa", "001", "correavalencia334@gmail.com", "3054374735");
        Collection<Jueces> jueces = new LinkedList<>();
        assertNotNull(juez1);
        juez1.registrarjueces();
        jueces.add(juez1);
        assertNotNull(juez2);
        juez2.registrarjueces();
        jueces.add(juez2);
        for (Jueces juez : jueces) {
            System.out.println(juez.getNombre());
        }
    }
}
