/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*

  Crear y versionar en el SVN de cada grupo
un proyecto NetBeans que implemente la clase
SumaArreglos.
- SumaArreglos posee como atributo principal
un arreglo de valores double y las
funciones/métodos:
  - sumaValores: suma los valores del arreglo.
  - sumaUnoAUno: suma a los elementos del arreglo
del objeto, uno a uno, los valores del arreglo
de otro objeto SumaArreglos.
  - sumaDos: devuelve un número conteniendo el
valor de la suma de los elementos del arreglo, más
la suma de los elementos de otro objeto SumaArreglos.

- Implementar tests unitarios para la clase
SumaArreglos.


 */
package sumaarreglos;

/**
 *
 * Clase Sumadora.
 *
 * @author Nicole Millalaf S.
 * @author Astrid De La Rosa
 * @author Jose Rodriguez A.
 * @author Miguel Orellana C.
 * @author Alberto Lagos T.
 *
 */
public class SumaArreglos {
    private double[] valores;

    /*
     *
     * Constructor de la clase SumarArreglos.
     *
     * @
     *
     */

    public SumaArreglos(double[] obj) {
        this.valores = obj;
    }

    public double sumaValores() {
        double valor = 0.0;
        for(int i=0;i<valores.length;i++) {
            valor += valores[i];
        }
        return valor;
    }

    public void sumaUnoAUno(SumaArreglos obj) {
        double[] menor;
        if(this.valores.length>obj.getValores().length) {
            menor = obj.getValores();
        } else {
            menor = this.valores;
        }
        for(int i=0;i<menor.length;i++) {
            this.valores[i] += obj.getValores()[i];
        }
    }
    
    public double sumaDos(SumaArreglos obj) {
        return  obj.sumaValores()+this.sumaValores();
    }

    public double[] getValores() {
      return this.valores;
    }

    public void imprimir() {
        for(int i=0;i<this.valores.length;i++) {
            System.out.println(this.valores[i]);
        }
    }

    
}