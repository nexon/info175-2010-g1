package pronosticator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Properties;

/**
 * Clase que permite guardar/rescatar la ultima ciudad seleccionada en caso de cerrar/abrir el widget.
 * 
 * @author Alberto Lagos T.
 */
public class Configuracion implements java.io.Serializable {
    private LinkedList<Ciudad> ciudades;

    public Configuracion(LinkedList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    /* alkslñaksñlk */
    public LinkedList<Ciudad> obtenerDatosGuardados() {
        return ciudades;
    }
    public void guardarDatos(LinkedList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
