/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pronosticator;
import java.net.*;
import java.io.*;
import java.util.Date;
/**
 *
 * @author albertolagos
 */
public class URLConnectionReader {
    String direccion;
    URLConnection conexion; //"http://www.meteochile.cl/js/pronostico_general.js"

    public URLConnectionReader(String s) {
        
        try	{
                URL weather = new URL(s);
                this.conexion = weather.openConnection();
        } catch(Exception e) {
                System.out.println("Error al Conectar");
        }
   }

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



