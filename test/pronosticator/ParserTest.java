/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pronosticator;

import junit.framework.TestCase;
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

    @After
    public void tearDown() {
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