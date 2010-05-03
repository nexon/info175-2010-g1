/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sumaarreglos;


import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;


/**
 *
 * @author albertolagos
 */
public class SumaArreglosTest extends TestCase {

    public SumaArreglosTest() {
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
     * Test of sumaValores method, of class SumaArreglos.
     */
    @Test
    public void testSumaValores() {
        double[] s = {1,2,3};
        SumaArreglos a = new SumaArreglos(s);
        double expResult = 6;
        double result = a.sumaValores();
        assertEquals(expResult, result);
    }

    /**
     * Test of sumaUnoAUno method, of class SumaArreglos.
     */
    @Test
    public void testSumaUnoAUno() {
        // TODO code application logic here
         double[] aux = {1,2,3};
        double[] aux2 = {2,3};

        SumaArreglos test = new SumaArreglos(aux);
        SumaArreglos test1 = new SumaArreglos(aux2);

        double[] expResult = {3,5,3};

        test.sumaUnoAUno(test1);
        double[] result = test.getValores();
        org.junit.Assert.assertArrayEquals(expResult, result, 0.0);

    }

    /**
     * Test of sumaDos method, of class SumaArreglos.
     */
    @Test
    public void testSumaDos() {
        /*
        System.out.println("sumaDos");
        SumaArreglos obj = null;
        SumaArreglos instance = null;
        double expResult = 0.0;
        double result = instance.sumaDos(obj);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         */
    }

    /**
     * Test of getValores method, of class SumaArreglos.
     */
    @Test
    public void testGetValores() {
        /*
        System.out.println("getValores");
        SumaArreglos instance = null;
        double[] expResult = null;
        double[] result = instance.getValores();
        this.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
         * */
    }

}