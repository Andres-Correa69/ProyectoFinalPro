/**
 * Clase para probar el funcionamiento del Torneo
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo.torneodeportivo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class TorneoTest {
    /**
     * Instancia para el manejo de logs
     */
    private static final Logger LOG = Logger.getLogger(TorneoTest.class.getName());
    
    /**
     * Verificar que la clase Torneo almacene y recupere los datos 
     * 
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio de prueba datos completos...");
        // Almacenar los datos de prueba Copa Mundo|2023-10-01|2023-08-01|2023-09-15|24|0|0|LOCAL|GRUPAL
        Torneo torneo = new Torneo("Copa Mundo","Masculino" ,LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)0, 0,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL);

        // Recuperación y verificación de datos
        assertEquals("Copa Mundo",torneo.getNombre());
        assertEquals("Masculino",torneo.getGenero());
        assertEquals(LocalDate.of(2023, 10, 1),torneo.getFechaInicio());
        assertEquals(LocalDate.of(2023, 8, 1),torneo.getFechaInicioInscripciones());
        assertEquals(LocalDate.of(2023, 9, 15),torneo.getFechaCierreInscripciones());
        assertEquals((byte)24,torneo.getNumeroParticipantes());
        assertEquals((byte)0,torneo.getLimiteEdad());
        assertEquals(0,torneo.getValorInscripcion());
        assertEquals(TipoTorneo.LOCAL,torneo.getTipoTorneo());
        LOG.info("Fin de prueba datos completos...");
    }

    /**
     * Verficar que el jugador se pueda registrar si es igual agenero el torneo
     */
    @Test
    public void inscripcionJugadorMasculino() {
        LOG.info("Inicio de prueba datos genero Masculino...");
        // Almacenar los datos de prueba |Prueba|Masculino|null|null|24|0|0|null|LOCAL|GRUPAL
        Torneo torneo= new Torneo("Prueba","Masculino",LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)0, 0,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL);
        Jugador jugador= new Jugador("Pedro", "canchas", "pedo@gmail.com", "3127854962", LocalDate.of(2000, 8, 1), "Masculino");
        assertEquals(torneo.getGenero(),jugador.getGenero());
        
        
        LOG.info("Fin de prueba datos nulos...");
    }

    @Test
    public void inscripcionJugadorFemenino() {
        LOG.info("Inicio de prueba datos genero Masculino...");
        // Almacenar los datos de prueba |Prueba|Masculino|null|null|24|0|0|null|LOCAL|GRUPAL
        Torneo torneo= new Torneo("Prueba","Femenino",LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)0, 0,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL);
        Jugador jugador= new Jugador("Pedra", "canchas", "pedo@gmail.com", "3127854962", LocalDate.of(2000, 8, 1), "Femenino");
        assertEquals(torneo.getGenero(),jugador.getGenero());
        LOG.info("Fin de prueba datos nulos...");
    }


    /**
     * Verificar que la clase Torneo valide que se ingrese los datos
     * 
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio de prueba datos nulos...");
        // Almacenar los datos de prueba null|null|null|null|24|0|0|null|LOCAL|GRUPAL
        assertThrows(Throwable.class, ()-> new Torneo(null,null,null, null, null, (byte)24, (byte)0, 0,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL));
        
        
        LOG.info("Fin de prueba datos nulos...");
    }

    /**
     * Verificar que la clase Torneo valide que el ingreso de número de participantes negativo 
     * 
     */
    @Test
    public void participantesNegativos() {
        LOG.info("Inicio de prueba número de participantes negativo...");
        // Almacenar los datos de prueba Copa Mundo|2023-10-01|2023-08-01|2023-09-15|-24|0|0|LOCAL|GRUPAL
        assertThrows(Throwable.class, ()-> new Torneo("Copa Mundo","Masculino" ,LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 01), LocalDate.of(2023, 10, 15), (byte)-24, (byte)0, 0,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL));
        
        LOG.info("Fin de prueba  número de participantes negativo...");
    }

    /**
     * Verificar que la clase Torneo valide que el ingreso de limites de edades negativo 
     * 
     */
    @Test
    public void limiteEdadesNegativo() {
        LOG.info("Inicio de prueba limites de edades negativo...");
        // Almacenar los datos de prueba Copa Mundo|2023-10-01|2023-08-01|2023-09-15|24|-1|0|LOCAL|GRUPAL
        assertThrows(Throwable.class, ()-> new Torneo("Copa Mundo","Femenino" ,LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 01), LocalDate.of(2023, 10, 15), (byte)24, (byte)-1, 0,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL));
        
        LOG.info("Fin de prueba  limites de edades negativo...");
    }

    /**
     * Verificar que la clase Torneo valide que el ingreso de valor de inscripción negativa
     * 
     */
    @Test
    public void inscripcionNegativa() {
        LOG.info("Inicio de prueba inscripción negativa...");
        // Almacenar los datos de prueba Copa Mundo|2023-10-01|2023-08-01|2023-09-15|24|0|-1|LOCAL|GRUPAL
        assertThrows(Throwable.class, ()-> new Torneo("Copa Mundo","Masculino" ,LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 01), LocalDate.of(2023, 10, 15), (byte)24, (byte)0, -1,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL));
        
        LOG.info("Fin de prueba inscripción negativa...");
    }

    /**
     * Verificar que la clase Torneo valide que el ingreso de inscripciones posteriores a la 
     * fecha de inicio del torneo
     * 
     */
    @Test
    public void inscripcionTardia() {
        LOG.info("Inicio de prueba inscripción tardia...");
        // Almacenar los datos de prueba Copa Mundo|2023-10-01|2023-11-01|2023-11-15|24|0|0|LOCAL
        assertThrows(Throwable.class, ()-> new Torneo("Copa Mundo","Masculino",LocalDate.of(2023, 10, 1), LocalDate.of(2023, 11, 01), LocalDate.of(2023, 11, 15), (byte)24, (byte)0, 0,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL));
        
        LOG.info("Fin de prueba inscripción tardia...");
    }

    /**
     * Verificar que la clase Torneo valide que el ingreso de inicio inscripciones posteriores a 
     * la fecha de cierre de inscripciones
     * 
     */
    @Test
    public void cierreInscripcionAnteriorInicio() {
        LOG.info("Inicio de prueba Cierre inscripción anterior al inicio...");
        // Almacenar los datos de prueba Copa Mundo|2023-10-01|2023-11-01|2023-11-15|24|0|0|LOCAL|GRUPAL
        assertThrows(Throwable.class, ()-> new Torneo("Copa Mundo", "Femenino",LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 15), LocalDate.of(2023, 8, 1), (byte)24, (byte)0, 0,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL));
        
        LOG.info("Fin de prueba Cierre inscripción anterior al inicio...");
    }

    /**
     * 
     * Buscando los enfrentamientos que tubo un equipo
     * 
     */
    @Test
    public void testListadoEnfrentamientosEquipo(){
        LOG.info("inicio prueba Listadoenfrentamienos equipos");
        Torneo torneo = new Torneo("Copa Mundo","Masculino" ,LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)0, 0,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL);
        List<Jueces> jueces = new ArrayList<Jueces>();
        Jueces juez1 = new Jueces("Pedro Montoya", "001", "montoyap@gmail.com", "3217042971");
        jueces.add(juez1);
        Jugador representante1 = new Jugador("Andres", "Correa", "correavalencia334@gmail.com", "3054374735", LocalDate.of(2005, 01, 15), "Masculino");
        Jugador representante2 = new Jugador("Fabian", "Londoño", "fabian@gmail.com", "3002682946", LocalDate.of(2005, 01, 15), "Masculino");
        Equipo ingenieros = new Equipo("ingenieros", representante1);
        Equipo fisicos = new Equipo("fisicos", representante2);
        Enfrentamiento enfrentamiento0 = new Enfrentamiento("prueba0", "UQ", LocalDate.of(2023, 11, 9), ingenieros, fisicos, jueces, null);
        Enfrentamiento enfrentamiento1 = new Enfrentamiento("prueba1", "UQ", LocalDate.of(2023, 11, 10), ingenieros, fisicos, jueces, null);
        Enfrentamiento enfrentamiento2 = new Enfrentamiento("prueb2", "UQ", LocalDate.of(2023, 11, 13), ingenieros, fisicos, jueces, null);
        Enfrentamiento enfrentamiento3 = new Enfrentamiento("prueba3", "UQ", LocalDate.of(2023, 11, 18), ingenieros, fisicos, jueces, null);
        Enfrentamiento enfrentamiento4 = new Enfrentamiento("prueba4", "UQ", LocalDate.of(2023, 11, 20), ingenieros, fisicos, jueces, null);
        enfrentamiento4.setResultado("Gano 3-1");
        enfrentamiento0.setEstado(true);
        enfrentamiento1.setEstado(false);
        enfrentamiento2.setEstado(true);
        enfrentamiento3.setEstado(true);
        

        List<Enfrentamiento> listado= new ArrayList<>();
        listado.add(enfrentamiento0);
        listado.add(enfrentamiento1);
        listado.add(enfrentamiento2);
        listado.add(enfrentamiento3);
        listado.add(enfrentamiento4);
        List<Enfrentamiento> res=new ArrayList<>();
        res=torneo.listadoEnfrentamientoEquipo(listado, "ingenieros");
        for (Enfrentamiento enfrentamiento : res) {
            System.out.println(enfrentamiento.getEquipo1().getNombreCompleto()+","+enfrentamiento.getEstado()+","+enfrentamiento.getResultado());
        }
        //System.out.println("Esto imprime: "+torneo.listadoEnfrentamientoEquipo(listado, "ingenieros").toString());

        LOG.info("fin prueba Listadoenfrentamienos equipos");
    }


    /**
     * 
     * Buscando los enfrentamientos donde esta el juez
     * 
     */
    @Test
    public void testListadoJuecesEnfrentamienos(){
        LOG.info("inicio prueba Listadoenfrentamienos equipos");
        Torneo torneo = new Torneo("Copa Mundo","Masculino" ,LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)0, 0,TipoTorneo.LOCAL,CaracterTorneo.GRUPAL);
        List<Jueces> jueces = new ArrayList<Jueces>();
        List<Jueces> jueces1 = new ArrayList<Jueces>();
        Jueces juez1 = new Jueces("Pedro Montoya", "001", "montoyap@gmail.com", "3217042971");
        Jueces juez2 = new Jueces("Pablo Gutierres", "002", "montoyap@gmail.com", "3217042971");
        Jueces juez3 = new Jueces("Pitagoras Montoya", "003", "montoyap@gmail.com", "3217042971");
        jueces.add(juez1);
        jueces.add(juez2);
        jueces.add(juez3);
        jueces1.add(juez1);
        jueces1.add(juez2);

        Jugador representante1 = new Jugador("Andres", "Correa", "correavalencia334@gmail.com", "3054374735", LocalDate.of(2005, 01, 15), "Masculino");
        Jugador representante2 = new Jugador("Fabian", "Londoño", "fabian@gmail.com", "3002682946", LocalDate.of(2005, 01, 15), "Masculino");
        Equipo ingenieros = new Equipo("ingenieros", representante1);
        Equipo fisicos = new Equipo("fisicos", representante2);
        Enfrentamiento enfrentamiento0 = new Enfrentamiento("prueba0", "UQ", LocalDate.of(2023, 11, 9), ingenieros, fisicos, jueces, null);
        Enfrentamiento enfrentamiento1 = new Enfrentamiento("prueba1", "UQ", LocalDate.of(2023, 11, 10), ingenieros, fisicos, jueces1, null);
        Enfrentamiento enfrentamiento2 = new Enfrentamiento("prueb2", "UQ", LocalDate.of(2023, 11, 13), ingenieros, fisicos, jueces, null);
        Enfrentamiento enfrentamiento3 = new Enfrentamiento("prueba3", "UQ", LocalDate.of(2023, 11, 18), ingenieros, fisicos, jueces1, null);
        Enfrentamiento enfrentamiento4 = new Enfrentamiento("prueba4", "UQ", LocalDate.of(2023, 11, 20), ingenieros, fisicos, jueces, null);
        
        List<Enfrentamiento> listado= new ArrayList<>();
        listado.add(enfrentamiento0);
        listado.add(enfrentamiento1);
        listado.add(enfrentamiento2);
        listado.add(enfrentamiento3);
        listado.add(enfrentamiento4);
        List<Enfrentamiento> juez= new ArrayList<>();
        juez=torneo.listJueces(listado, juez3);
        for (Enfrentamiento enfrentamientos : juez) {
            System.out.println("Nombre del Juez: "+juez3.getNombre()+" \nEnfrentamientos:"+enfrentamientos.getNombre());
        }

        
        

        LOG.info("fin prueba Listadoenfrentamienos equipos");
    }

}
