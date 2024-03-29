/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pronosticator;

import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author albertolagos
 */
public class ParserTest extends TestCase {

    public ParserTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testGetCiudad() {
        Parser datos;
        String ciudad []={null,"Arica","Iquique","Antofagasta","Copiap&oacute;","La Serena/Coquimbo"
            ,"Vi&ntilde;a del Mar/Valpara&iacute;so"
            ,"Santiago Sector Centro","Rancagua","Talca","Concepci&oacute;n"
            ,"Temuco","Valdivia","Puerto Montt","Coyhaique","Punta Arenas"};
        datos = new Parser("http://www.meteochile.cl/js/pronostico_general.js");
        String c[]= datos.getCiudad();
        org.junit.Assert.assertArrayEquals(ciudad,c);
    }

    /**
     * Test of getTemperatura method, of class Parser.

     */
    @Test
    public void testGetchangeChar() {
        String aux = "Concepci&oacute;n";
        String finall = "Concepción";
        aux = Parser.changeChar(aux);
        this.assertEquals(aux, finall);
    }

}