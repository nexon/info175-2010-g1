    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pronosticator;

import java.util.Date;

/**
 *
 * @author albertolagos
 */
public class Tiempo {
    private String fecha[];
    private Double tMax[];
    private Double tMin[];
    private String descripcion[];
    private String imagen[];

    public Tiempo(String fecha[], Double tMax[], Double tMin[], String descripcion[], String imagen[]) {
        this.fecha = fecha;
        this.tMax  = tMax;
        this.tMin  = tMin;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String[] obtenerFecha() {
        return fecha;
    }

    public String[] obtenerPronostico() {
        return descripcion;
    }
    
    public Double[] obtenerTemperaturaMax() {
        return tMax;
    }

    public Double[] obtenerTemperaturaMin() {
        return tMin;
    }

    public String[] obtenerIconos() {
        return imagen;
    }
}
