package pronosticator;

import java.io.Serializable;


/**
 * Clase que almacena el contenido metereologico para cada ciudad (temperatura, pronostico, etc)
 * 
 * @author Alberto Lagos T.
 */
public class Ciudad implements Serializable{
    private String nombre;
    private Tiempo pronostico;

    /**
     * Constructor de la Clase
     *
     * @param String
     * @param Tiempo
     * 
     */
    public Ciudad(String n, Tiempo pronostico) {
        nombre = n;
        this.pronostico = pronostico;
    }

    /**
     * Obtiene el nombre de la ciudad
     * 
     * @return String
     *
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Obtiene el pronostico para la ciudad
     *
     * @return Tiempo
     * 
     */
    public Tiempo obtenerPronostico() {
        return pronostico;
    }

}
