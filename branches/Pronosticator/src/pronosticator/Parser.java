/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pronosticator;

import java.util.Date;

/**
 * Clase que permite obtener los datos de meteochile y.... chan chan chanchaaaan.
 * @author Alberto Lagos T.
 */
public class Parser extends URLConnectionReader {
    private String dato;

    public Parser(String s) {
        super("http://www.meteochile.cl/js/pronostico_general.js");
        dato = obtenerDatos();
    }

    public Date[] getFecha() {
        Date[] ret = new Date[99];
        return ret;
    }
    public String[] getCiudad() {
        String[] ret = new String[99];
        return ret;

    }
    public String[] getImagen() {
        String[] ret = new String[99];
        return ret;
    }
    public Double[] getTemperatura() {
        Double[] ret = new Double[99];
        return ret;
    }
    public String[] getPronostico() {
        String[] ret = new String[99];
        return ret;
    }
    public String [] generarCiudades() {
        String[] ret = new String[99];
        int inicio = dato.indexOf("var ciudades='");
        String ciudades = dato.substring(inicio,dato.length());
        String ciudad[] = ciudades.split("|");

        ciudad[ciudad.length] = ciudad[ciudad.length].substring(0,ciudad[ciudad.length].length()-2);
        
        return ret;
    }

}

