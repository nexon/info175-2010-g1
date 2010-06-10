/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pronosticator;

import java.util.LinkedList;

/**
 *
 * @author albertolagos
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
