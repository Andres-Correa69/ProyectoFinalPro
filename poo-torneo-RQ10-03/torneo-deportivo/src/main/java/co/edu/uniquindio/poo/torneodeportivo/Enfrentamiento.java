package co.edu.uniquindio.poo.torneodeportivo;

import java.time.LocalDate;
import java.util.List;

public class Enfrentamiento {
    private String nombre;
    private String ubicacion;
    private LocalDate fecha;
    private Equipo equipo1;
    private Equipo equipo2;
    private List<Jueces> jueces;
    private EstadoEnfrentamiento estado;

    public Enfrentamiento(String nombre, String ubicacion, LocalDate fecha, Equipo equipo1, Equipo equipo2,
            List<Jueces> jueces, EstadoEnfrentamiento estado) {


        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.jueces = jueces;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Equipo getEquipo1() {
        return equipo1;
    }
    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }
    public Equipo getEquipo2() {
        return equipo2;
    }
    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    public List<Jueces> getJueces() {
        return jueces;
    }
    public void setJueces(List<Jueces> jueces) {
        this.jueces = jueces;
    }
    public EstadoEnfrentamiento getEstado() {
        return estado;
    }
    public void setEstado(EstadoEnfrentamiento estado) {
        this.estado = estado;
    }
    public void estadoEnfrentamiento(Enfrentamiento nombre,EstadoEnfrentamiento estado){
            System.out.println("Estado: "+estado+"Enfrentamiento: "+nombre.getUbicacion());
    }





    
}
