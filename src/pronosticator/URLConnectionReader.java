package pronosticator;
import java.net.*;
import java.io.*;


/**
 * Clase realiza la conexión con meteochile para obtener los datos.
 * @author Alberto Lagos T.
 */

public class URLConnectionReader {
    String direccion;
    URLConnection conexion; //"http://www.meteochile.cl/js/pronostico_general.js"

    /**
     * Constructor de la clase, que recibe como parametro una url.
     * 
     * @param s
     */
    public URLConnectionReader(String s) {
        
        try	{
                URL weather = new URL(s);
                this.conexion = weather.openConnection();
        } catch(Exception e) {
                System.out.println("Error al Conectar");
        }
   }

    /**
     * Metodo que obtiene (lee) los datos, preeviamente establecida la conexión.
     *
     * @return String
     */

    public String obtenerDatos() {
         String ret = "";
         try	{
                BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    this.conexion.getInputStream()));
                int i = 0;
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                        ret += inputLine+' ';
                        i++;
                }
                in.close();
         } catch(Exception e) {
           
        }
         return ret;
    }

}



