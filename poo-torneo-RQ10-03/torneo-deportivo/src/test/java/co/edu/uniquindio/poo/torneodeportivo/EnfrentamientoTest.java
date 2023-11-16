package co.edu.uniquindio.poo.torneodeportivo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class EnfrentamientoTest {

    private static final Logger LOG = Logger.getLogger(EstadisticasTest.class.getName());

     @Test
    void testSetEstadoPendiente() {
        
        LOG.info("inicio prueba estado pendiente ");

        List<Jueces> jueces = new ArrayList<Jueces>();
        Jueces juez1 = new Jueces("Pedro Montoya", "001", "montoyap@gmail.com", "3217042971");
        jueces.add(juez1);
        Jugador representante1 = new Jugador("Andres", "Correa", "correavalencia334@gmail.com", "3054374735", LocalDate.of(2005, 01, 15), "Masculino");
        Jugador representante2 = new Jugador("Fabian", "Londoño", "fabian@gmail.com", "3002682946", LocalDate.of(2005, 01, 15), "Masculino");
        Equipo ingenieros = new Equipo("ingenieros", representante1);
        Equipo fisicos = new Equipo("fisicos", representante2);
        Enfrentamiento enfrentamiento = new Enfrentamiento("prueba", "UQ", LocalDate.of(2023, 11, 30), ingenieros, fisicos, jueces, null);
        enfrentamiento.setEstado(false);
        System.out.println(enfrentamiento.getEstado());

        LOG.info("fin prueba estado pendiente");

    }

    @Test
    void testSetEstadoEnJuego() {
        
        LOG.info("inicio prueba estado en juego ");

        List<Jueces> jueces = new ArrayList<Jueces>();
        Jueces juez1 = new Jueces("Pedro Montoya", "001", "montoyap@gmail.com", "3217042971");
        jueces.add(juez1);
        Jugador representante1 = new Jugador("Andres", "Correa", "correavalencia334@gmail.com", "3054374735", LocalDate.of(2005, 01, 15), "Masculino");
         Jugador representante2 = new Jugador("Fabian", "Londoño", "fabian@gmail.com", "3002682946", LocalDate.of(2005, 01, 15), "Masculino");
        Equipo ingenieros = new Equipo("ingenieros", representante1);
        Equipo fisicos = new Equipo("fisicos", representante2);
        Enfrentamiento enfrentamiento = new Enfrentamiento("prueba", "UQ", LocalDate.of(2023, 11, 16), ingenieros, fisicos, jueces, null);
        enfrentamiento.setEstado(false);
        System.out.println(enfrentamiento.getEstado());

        LOG.info("fin prueba estado en juego");

    }

     @Test
    void testSetEstadoFinalizado() {
        
        LOG.info("inicio prueba estado en finalizado ");

        List<Jueces> jueces = new ArrayList<Jueces>();
        Jueces juez1 = new Jueces("Pedro Montoya", "001", "montoyap@gmail.com", "3217042971");
        jueces.add(juez1);
        Jugador representante1 = new Jugador("Andres", "Correa", "correavalencia334@gmail.com", "3054374735", LocalDate.of(2005, 01, 15), "Masculino");
         Jugador representante2 = new Jugador("Fabian", "Londoño", "fabian@gmail.com", "3002682946", LocalDate.of(2005, 01, 15), "Masculino");
        Equipo ingenieros = new Equipo("ingenieros", representante1);
        Equipo fisicos = new Equipo("fisicos", representante2);
        Enfrentamiento enfrentamiento = new Enfrentamiento("prueba", "UQ", LocalDate.of(2023, 11, 16), ingenieros, fisicos, jueces, "3-0");
        enfrentamiento.setEstado(false);
        System.out.println(enfrentamiento.getEstado());

        LOG.info("fin prueba estado en finalizado");

    }

    @Test
    void testSetEstadoAplazado() {
        
        LOG.info("inicio prueba estado en aplazado ");

        List<Jueces> jueces = new ArrayList<Jueces>();
        Jueces juez1 = new Jueces("Pedro Montoya", "001", "montoyap@gmail.com", "3217042971");
        jueces.add(juez1);
        Jugador representante1 = new Jugador("Andres", "Correa", "correavalencia334@gmail.com", "3054374735", LocalDate.of(2005, 01, 15), "Masculino");
         Jugador representante2 = new Jugador("Fabian", "Londoño", "fabian@gmail.com", "3002682946", LocalDate.of(2005, 01, 15), "Masculino");
        Equipo ingenieros = new Equipo("ingenieros", representante1);
        Equipo fisicos = new Equipo("fisicos", representante2);
        Enfrentamiento enfrentamiento = new Enfrentamiento("prueba", "UQ", LocalDate.of(2023, 11, 16), ingenieros, fisicos, jueces, null);
        enfrentamiento.setEstado(true);
        System.out.println(enfrentamiento.getEstado());

        LOG.info("fin prueba estado en aplazado");

    }
   
}
