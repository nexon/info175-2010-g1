package pronosticator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que permite guardar/rescatar la ultima ciudad seleccionada en caso de cerrar/abrir el widget.
 * 
 * @author Alberto Lagos T.
 */
public class Configuracion implements java.io.Serializable {
    private Properties properties = new Properties();

    /**
     * Constructor de la Clase
     */
    public Configuracion() {
        try {
            properties.load(new FileInputStream("pronosticator.properties"));
        } catch (IOException e) {
            try {
                properties.store(new FileOutputStream("pronosticator.properties"), null);
            } catch (IOException ex) {
                Logger.getLogger(Pronosticator.class.getName()).log(Level.SEVERE, null, ex);
            }

         }
        properties.setProperty("ficheroListaDeCiudades","objListaCiudad.ser");
    }

    /**
     * Metodo que obtiene la lista de ciudades que ha sido serializada en el fichero.
     * 
     * @param fichero
     * @return
     */
    public LinkedList<Ciudad> obtenerListaDeCiudades(String fichero) {
        LinkedList<Ciudad> tmp = null;
        try {
            FileInputStream fis = new FileInputStream(fichero);
            try {
                ObjectInputStream in = new ObjectInputStream(fis);
                try {
                    tmp = (LinkedList<Ciudad>) in.readObject();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Pronosticator.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(Pronosticator.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pronosticator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tmp;
    }

   /**
    * Metodo que guarda la lista de ciudades (serializandola) en el fichero de nombre fichero
    * @param ciudades
    * @param fichero
    */
    public void guardarListaDeCiudades(LinkedList<Ciudad> ciudades, String fichero) {
        FileOutputStream fos;
            try {
                fos = new FileOutputStream(fichero);
                ObjectOutputStream out;
                try {
                    out = new ObjectOutputStream(fos);
                    out.writeObject(ciudades);
                } catch (IOException ex) {
                    Logger.getLogger(Pronosticator.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Pronosticator.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    /**
     * Metodo que guarda la ultima seleccion dentro de las properties
     *
     * @param String
     * @return void
     *
     */
    public void guardarUltimaSeleccion(String ciudad) {
         properties.setProperty("ciudad", ciudad);
    }

     /**
     * Metodo que obtiene la ultima seleccion de ciudad
     *
     * @return String
     *
     */
    public String obtenerUltimaSeleccion() {
        return properties.getProperty("ciudad");
    }

    /**
     * Metodo obtiene el fichero en donde se guardara la lista enlazada de ciudades
     *
     * @return String
     *
     */
    public String obtenerFicheroDeCiudades() {
        return properties.getProperty("ficheroListaDeCiudades");
    }

    /**
     * Metodo que devuelve verdadero o falso, dependiendo si esta vacio o no el objeto property
     *
     * @return boolean
     *
     */
    public boolean isEmpty() {
        return properties.isEmpty();
    }

    /**
     * Metodo que guarda todo en property
     *
     * @author Alberto Lagos T.
     */
    public void guardarTodo() {
        try {
            properties.store(new FileOutputStream("pronosticator.properties"), null);
        } catch (IOException ex) {
            System.out.println("EERRORR");
        }
    }
}
