/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sumaarreglos;

/**
 *
 * @author albertolagos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] aux = {1,2,3,4,5};
        double[] aux2 = {2,3};

        SumaArreglos test = new SumaArreglos(aux);
        SumaArreglos test1 = new SumaArreglos(aux2);

        System.out.println("ARREGLO 1: ");
        test.imprimir();
        System.out.println("ARREGLO 2: ");
        test1.imprimir();

        test.sumaUnoAUno(test1);
        System.out.println("ARREGLO 1 MODIFICADO: ");
        test.imprimir();

    }

}
