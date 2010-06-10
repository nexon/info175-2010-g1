/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pronosticator;

import java.nio.charset.Charset;
import java.util.Date;

/**
 * Clase que permite obtener los datos de meteochile y.... chan chan chanchaaaan.
 * @author Alberto Lagos T.
 */
public class Parser extends URLConnectionReader {
    private String dato;

    public Parser(String s) {
        super(s);
        dato = obtenerDatos();
    }

    public String[][] getFecha() {
        String[] tmpC = this.getCiudad();
        String fechasCiudades[][] = new String[18][5];

         for(int i=0; i<fechasCiudades.length-2;i++) {
            int inicio = dato.indexOf("fechas['"+tmpC[i]+"']='");
            int finall = dato.indexOf("temperaturas['"+tmpC[i+1]+"']='");

            String fechas = dato.substring(inicio,finall-2);
            fechas = fechas.substring(fechas.indexOf('=')+2);
             for(int j=0;j<fechasCiudades[0].length; j++) {
                 fechasCiudades[i][j] = fechas.substring(0, fechas.indexOf('|'));
                fechas = fechas.substring(fechas.indexOf('|')+1);
             }       
        }
        return fechasCiudades;
    }
    public String[] getCiudad() {
        int inicio = dato.indexOf("var ciudades='");
        String ciudades1 = dato.substring(inicio,dato.length());
        String ciudad[] = ciudades1.split("var ciudades='");
        String ciudad1[] = ciudad[1].split("';");
        String ciudadesSolas[] = new String[18];
        String lista[] = new String[18];

         for(int i=0;i<ciudadesSolas.length-2;i++) {
            if(ciudad1[0].indexOf('|') != -1) {
                    ciudad1[0] = ciudad1[0].substring(ciudad1[0].indexOf('|')+1).toString();
                    lista[i] = ciudad1[0].substring(0,ciudad1[0].indexOf('|'));
            } else {
                    lista[i] =ciudad1[0];
            }
        }
        lista[16] = ciudad1[0].substring(ciudad1[0].lastIndexOf('|')+1);
        return lista;

    }
    public String[][] getImagen() {
        String[] tmpC = this.getCiudad();
        String iconosCiudades[][] = new String[18][5];
        for(int i=0;i<iconosCiudades.length-1;i++) {
            int inicio = dato.indexOf("iconos['"+tmpC[i]+"']='");
            int finall  = dato.indexOf("fechas['"+tmpC[i]+"']='");
            String iconos = dato.substring(inicio,finall-2);
            iconos = iconos.substring(iconos.indexOf('=')+2);
            for (int j=0; j<iconosCiudades[0].length-1; j++) {
                iconosCiudades[i][j] = iconos.substring(0,iconos.indexOf('|'));
                iconos = iconos.substring(iconos.indexOf('|')+1);
            }
            iconosCiudades[i][4] = iconos;
        }
        
        return iconosCiudades;
    }
    public  String[][] getTemperatura() {
        String[] tmpC = this.getCiudad();
        String temperaturaCiudades[][] = new String[18][5];
        for(int i=0;i<tmpC.length-1;i++) {
            int inicio = dato.indexOf("temperaturas['"+tmpC[i]+"']='");
            int finall = dato.indexOf("pronosticos['"+tmpC[i]+"']='");
            String temperaturas = dato.substring(inicio, finall-2);
            temperaturas = temperaturas.substring(temperaturas.indexOf('=')+2);
            temperaturaCiudades[i][0] = temperaturas.substring(1,temperaturas.indexOf('|'));
            temperaturas = temperaturas.substring(temperaturas.indexOf('|')+1);
            for(int j=1;j<temperaturaCiudades[0].length-1;j++) {
                    temperaturaCiudades[i][j] = temperaturas.substring(0,temperaturas.indexOf('|'));
                    temperaturas = temperaturas.substring(temperaturas.indexOf('|')+1);
            }
            temperaturaCiudades[i][4] = temperaturas;
        }
        return temperaturaCiudades;
    }
    public String[][] getPronostico() {
        String[] tmpC = getCiudad();
        String pronosticoCiudades[][] = new String[18][5];
        for(int i = 0;i<tmpC.length-1;i++) {
            int inicio = dato.indexOf("pronosticos['"+tmpC[i]+"']='");
            int finall = dato.indexOf("iconos['"+tmpC[i]+"']='");
            String pronostico  = dato.substring(inicio,finall-2);
            pronostico = pronostico.substring(pronostico.indexOf('=')+2);
            for(int j = 0;j<pronosticoCiudades[0].length-1;j++) {
                pronosticoCiudades[i][j] = pronostico.substring(0,pronostico.indexOf('|'));
                pronostico = pronostico.substring(pronostico.indexOf('|')+1).replace("'", "");
            }
            pronosticoCiudades[i][4] = pronostico;
        }
        return pronosticoCiudades;

    }
    public Ciudad [] generarCiudades() {
        Ciudad[] lista = new Ciudad[18];
        String[] c = getCiudad();
        for(int i =0;i<lista.length-1;i++) {
            String[] tmpTemp = getTemperatura()[i];
            Double[] tempMax = new Double[5], tempMin = new Double[5];
            tempMax[0] = Double.parseDouble(tmpTemp[0]);
            tempMin[0] = 0.0;
            for(int j=1;j<tmpTemp.length;j++) {
                tempMin[j] = Double.parseDouble(tmpTemp[j].substring(0,tmpTemp[j].indexOf('/')));
                tempMax[j] = Double.parseDouble(tmpTemp[j].substring(tmpTemp[j].indexOf('/')+1).replace("'", ""));
            }
            //String[] aa = getFecha()[i];
            Tiempo tmp = new Tiempo(getFecha()[i], tempMax, tempMin, getPronostico()[i], getImagen()[i]);
            lista[i] = new Ciudad(changeChar(c[i]), tmp);
        }

        return lista;
    }

    public static String changeChar(String s) {
        return s.replace("&ntilde;","ñ")
               .replace("&Ntilde;","Ñ")
               .replace("&aacute;","á")
               .replace("&eacute;","é")
               .replace("&iacute;","í")
               .replace("&oacute;","ó")
               .replace("&uacute;","ú");
    }
}

