package co.edu.uniquindio.poo.torneodeportivo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.LinkedList;


public class Jueces {

    // declaracion de variables
    private String nombre;
    private String NumLicenciaJuez;
    private String email;
    private String celular;
    private Collection<Jueces> jueces = new LinkedList<>();

    // constructor
    public Jueces(String nombre, String numLicenciaJuez, String email, String celular) {
        ASSERTION.assertion(nombre != null && !nombre.isBlank(), "El nombre completo es requerido");
        ASSERTION.assertion(numLicenciaJuez != null && !celular.isBlank(), "El celular es requerido");
        ASSERTION.assertion(email != null && !email.isBlank(), "El email es requerido");
        ASSERTION.assertion(celular != null && !celular.isBlank(), "El email es requerido");

        this.nombre = nombre;
        this.NumLicenciaJuez = numLicenciaJuez;
        this.email = email;
        this.celular = celular;
    }

    // registrar jueces
    public void registrarjueces() {
        validarJuezExiste(this);
        jueces.add(this);
    }

    public Optional<Jueces> buscarJuez(Predicate<Jueces> nombreIgual) {
        return this.jueces.stream().filter(nombreIgual).findAny();
     }
     

    /**
     * Valida que no exista ya un jugador registrado con el mismo nombre y apellido,
     * en caso de haberlo genera un assertion error.
     */
    private void validarJuezExiste(Jueces jueces) {
        Predicate<Jueces> nombreIgual = j -> j.getNombre().equals(jueces.getNombre());
        boolean existeJuez = buscarJuez(nombreIgual).isPresent();
        ASSERTION.assertion(!existeJuez, "El jugador ya esta registrado");
     }

    // declaro getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumLicenciaJuez() {
        return NumLicenciaJuez;
    }

    public void setNumLicenciaJuez(String numLicenciaJuez) {
        NumLicenciaJuez = numLicenciaJuez;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
