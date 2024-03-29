package pronosticator;

/**
 * Clase que permite obtener los datos de meteochile y parsea los datos (ciudades, pronostico del tiempo, etc).
 * @author Alberto Lagos T.
 */
public class Parser extends URLConnectionReader {
    private String dato;

    /**
     *  Constructor de clase.
     *  @param s
     *  @author Alberto Lagos T.
     */

    public Parser(String s) {
        super(s);
        dato = obtenerDatos();
    }

    /**
     *  Metodo que obtiene las fechas (todas) de los dias.
     *  @return String[][]
     *  @author Alberto Lagos T.
     */

    public String[][] getFecha() {
        String[] tmpC = this.getCiudad();
        String fechasCiudades[][] = new String[17][5];

         for(int i=1; i<fechasCiudades.length-2;i++) {
            int inicio = dato.indexOf("fechas['"+tmpC[i]+"']='");
            int finall = dato.indexOf("temperaturas['"+tmpC[i+1]+"']='");

            String fechas = dato.substring(inicio,finall-2);
            fechas = fechas.substring(fechas.indexOf('=')+2);
             for(int j=0;j<fechasCiudades[0].length; j++) {
                 fechasCiudades[i][j] = fechas.substring(0, fechas.indexOf('|'));
                fechas = fechas.substring(fechas.indexOf('|')+1);
                fechasCiudades[i][j] = changeChar(fechasCiudades[i][j]);
             }
        }
        int inicio = dato.indexOf("fechas['Punta Arenas']='");
        int finall = dato.indexOf("temperaturas['Isla de Pascua']='");
        String fechas = dato.substring(inicio,finall-2);
        fechas = fechas.substring(fechas.indexOf('=')+2);
        for(int j=0;j<fechasCiudades[0].length; j++) {
            fechasCiudades[15][j] = fechas.substring(0, fechas.indexOf('|'));
            fechas = fechas.substring(fechas.indexOf('|')+1);
            fechasCiudades[15][j] = changeChar(fechasCiudades[15][j]);
        }

        return fechasCiudades;
    }

    /**
     *  Metodo que obtiene las ciudades (todas) desde Metochile.
     *
     *  @return String[]
     *  @author Alberto Lagos T.
     */

    public String[] getCiudad() {
        int inicio = dato.indexOf("var ciudades='");
        String ciudades1 = dato.substring(inicio,dato.length());
        String ciudad[] = ciudades1.split("var ciudades='");
        String ciudad1[] = ciudad[1].split("';");
        String lista[] = new String[16];
        lista[1] = "Arica";
         for(int i=2;i<lista.length;i++) {
              ciudad1[0] = ciudad1[0].substring(ciudad1[0].indexOf('|')+1).toString();
              lista[i] =  ciudad1[0].substring(0,ciudad1[0].indexOf('|'));
             /*
            if(ciudad1[0].indexOf('|') != -1) {
                    ciudad1[0] = ciudad1[0].substring(ciudad1[0].indexOf('|')+1).toString();
                    lista[i] =  ciudad1[0].substring(0,ciudad1[0].indexOf('|'));
            } else {
                    lista[i] = ciudad1[0];
            }
              */
        }
        //lista[15] = ciudad1[0].substring(ciudad1[0].lastIndexOf('|')+1);
        


        return lista;

    }

     /**
     *  Metodo que obtiene el nombre de los iconos a utilizar para los pronosticos del tiempo
     *
     *  @return String[][]
     *  @author Alberto Lagos T.
     */
    public String[][] getImagen() {
        String[] tmpC = this.getCiudad();
        String iconosCiudades[][] = new String[17][5];
        for(int i=1;i<iconosCiudades.length-1;i++) {
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

     /**
     *  Metodo que obtiene las temperaturas (todas) correspondientes a las ciudades y a los dias.
     *
     *  @return String[][]
     *  @author Alberto Lagos T.
     */
    public  String[][] getTemperatura() {
        String[] tmpC = this.getCiudad();
        String temperaturaCiudades[][] = new String[17][5];
        for(int i=1;i<tmpC.length;i++) {
            int inicio = dato.indexOf("temperaturas['"+tmpC[i]+"']='");
            int finall = dato.indexOf("pronosticos['"+tmpC[i]+"']='");
            String temperaturas = dato.substring(inicio, finall-2);
            temperaturas = temperaturas.substring(temperaturas.indexOf('=')+2);
            //if(temperaturas.charAt(0) == '-') {
            if(!Character.isDigit(temperaturas.charAt(0))) {
                 if(temperaturas.charAt(0) == '-') {
                    temperaturaCiudades[i][0] = temperaturas.substring(0,temperaturas.indexOf('|'));
                    temperaturas = temperaturas.substring(temperaturas.indexOf('|')+1);
                 } else {
                    temperaturaCiudades[i][0] = temperaturas.substring(1,temperaturas.indexOf('|'));
                    temperaturas = temperaturas.substring(temperaturas.indexOf('|')+1);
                 }                             

            } else {
                temperaturaCiudades[i][0] = temperaturas.substring(0,temperaturas.indexOf('|'));
                temperaturas = temperaturas.substring(temperaturas.indexOf('|')+1);
            }
            for(int j=1;j<temperaturaCiudades[0].length-1;j++) {
                    temperaturaCiudades[i][j] = temperaturas.substring(0,temperaturas.indexOf('|'));
                    temperaturas = temperaturas.substring(temperaturas.indexOf('|')+1);
            }
            temperaturaCiudades[i][4] = temperaturas;
        }
        return temperaturaCiudades;
    }

     /**
     *  Metodo que obtiene el pronostico (en texto) para cada ciudad.
     *
     *  @return String[][]
     *  @author Alberto Lagos T.
     */
    public String[][] getPronostico() {
        String[] tmpC = getCiudad();
        String pronosticoCiudades[][] = new String[17][5];
        for(int i = 1;i<tmpC.length-1;i++) {
            int inicio = dato.indexOf("pronosticos['"+tmpC[i]+"']='");
            int finall = dato.indexOf("iconos['"+tmpC[i]+"']='");
            String pronostico  = dato.substring(inicio,finall-2);
            pronostico = pronostico.substring(pronostico.indexOf('=')+2);
            for(int j = 1;j<pronosticoCiudades[0].length-1;j++) {
                pronosticoCiudades[i][j] = pronostico.substring(0,pronostico.indexOf('|'));
                pronostico = pronostico.substring(pronostico.indexOf('|')+1).replace("'", "");
            }
            pronosticoCiudades[i][4] = pronostico;
        }
        return pronosticoCiudades;

    }

     /**
     *  Metodo que genera objetos de la clase Ciudad que contienen los datos metereologicos para cada ciudad.
     *
     *  @return String[]
     *  @author Alberto Lagos T.
     */
    public Ciudad [] generarCiudades() {
        Ciudad[] lista = new Ciudad[16];
        String[][] todasTemperaturas = getTemperatura();
        String region[] = {"XV","I","II", "III", "IV", "V","RM", "VI", "VII", "VIII", "IX", "XIV", "X", "XI", "XII", "V", "V", "",""};
        String[] c = getCiudad();
        for(int i =1;i<lista.length;i++) {
            c[i] = region[i-1]+" - "+c[i];
        }
        for(int i =1;i<lista.length;i++) {
            Double[] tempMax = new Double[5], tempMin = new Double[5];
            String[] tmpTemp = todasTemperaturas[i];
            if(!Character.isDigit(tmpTemp[0].charAt(0))) {
                if(tmpTemp[0].charAt(0) == '-') {
                    tempMax[0] = Double.parseDouble(tmpTemp[0].substring(tmpTemp[0].indexOf('/')+1).replace("'", ""));
                    tempMin[0] = Double.parseDouble(tmpTemp[0].substring(0,tmpTemp[0].indexOf('/')));
                } else {
                    tempMax[0] = Double.parseDouble(tmpTemp[0]);
                }
            } else {
                tempMax[0] = Double.parseDouble(tmpTemp[0].substring(tmpTemp[0].indexOf('/')+1).replace("'", ""));
                //tempMin[0] = Double.parseDouble(tmpTemp[0].substring(0,tmpTemp[0].indexOf('/')));
            }
            for(int j=1;j<tmpTemp.length;j++) {
                tempMin[j] = Double.parseDouble(tmpTemp[j].substring(0,tmpTemp[j].indexOf('/')));
                tempMax[j] = Double.parseDouble(tmpTemp[j].substring(tmpTemp[j].indexOf('/')+1).replace("'", ""));
            }
            
            Tiempo tmp = new Tiempo(getFecha()[i], tempMax, tempMin, getPronostico()[i], getImagen()[i]);
            lista[i] = new Ciudad(changeChar(c[i]), tmp);
        }
        return lista;
    }

     /**
     *  Metodo que cambia los caracteres especiales (acentos y ñ) que entrega Meteochile.
     *
     *  @param s
     *  @return String[]
     *  @author Alberto Lagos T.
     */
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

