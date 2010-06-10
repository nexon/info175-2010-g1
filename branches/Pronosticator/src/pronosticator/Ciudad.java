package pronosticator;


/**
 * Clase que almacena el contenido metereologico para cada ciudad (temperatura, pronostico, etc)
 * 
 * @author Alberto Lagos T.
 */
public class Ciudad {
    private String nombre;
    private Tiempo pronostico;

    public Ciudad(String n, Tiempo pronostico) {
        nombre = n;
        this.pronostico = pronostico;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Tiempo obtenerPronostico() {
        return pronostico;
    }
}
