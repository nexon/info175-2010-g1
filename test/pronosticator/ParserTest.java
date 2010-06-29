/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pronosticator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author albertolagos
 */
public class ParserTest {

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

    @After
    public void tearDown() {
    }

    /**
     * Test of getFecha method, of class Parser.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Parser instance = null;
        String[][] expResult = null;
        String[][] result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCiudad method, of class Parser.
     */
    @Test
    public void testGetCiudad() {
        System.out.println("getCiudad");
        Parser instance = null;
        String[] expResult = null;
        String[] result = instance.getCiudad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagen method, of class Parser.
     */
    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Parser instance = null;
        String[][] expResult = null;
        String[][] result = instance.getImagen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemperatura method, of class Parser.
     */
    @Test
    public void testGetTemperatura() {
        System.out.println("getTemperatura");
        Parser instance = null;
        String[][] expResult = null;
        String[][] result = instance.getTemperatura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPronostico method, of class Parser.
     */
    @Test
    public void testGetPronostico() {
        System.out.println("getPronostico");
        Parser instance = null;
        String[][] expResult = null;
        String[][] result = instance.getPronostico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarCiudades method, of class Parser.
     */
    @Test
    public void testGenerarCiudades() {
        System.out.println("generarCiudades");
        Parser instance = null;
        Ciudad[] expResult = null;
        Ciudad[] result = instance.generarCiudades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeChar method, of class Parser.
     */
    @Test
    public void testChangeChar() {
        System.out.println("changeChar");
        String s = "";
        String expResult = "";
        String result = Parser.changeChar(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}