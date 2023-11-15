package co.edu.uniquindio.poo.torneodeportivo;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class EnfrentamientoTest {
    @Test
    void testSetEstadoEnJuego() {
        Jugador representante1 = new Jugador("Andres", "Correa", "correavalencia334@gmail.com", "3054374735", LocalDate.of(2005, 01, 15), "Masculino");
        Jugador representante2 = new Jugador("Andres", "Correa", "correavalencia334@gmail.com", "3054374735", LocalDate.of(2005, 01, 15), "Masculino");
        Equipo ingenieros = new Equipo("ingenieros", representante1);
        Equipo fisicos = new Equipo("fisicos", representante2);
        Enfrentamiento enfrentamiento = new Enfrentamiento("prueba", "UQ", LocalDate.of(2023, 11, 15), ingenieros, fisicos, null, null);
        System.out.println(enfrentamiento.getEstado());

    }
}
