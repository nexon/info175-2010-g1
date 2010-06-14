package pronosticator;

import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Clase Principal que implementa el widget (JPanel).
 * 
 * @author Alberto Lagos T.
 */

public class Pronosticator extends javax.swing.JPanel {
    
    private LinkedList<Ciudad> ciudades;
    private Parser datos;
    private Configuracion conf;
    /** Creates new form Pronosticator */
    public Pronosticator() {
        super();
        initComponents();
        ejecutar();
    }
    public void ejecutar() {
        datos = new Parser("http://www.meteochile.cl/js/pronostico_general.js");
        if(datos.obtenerEstado()) {
             Ciudad c[] = datos.generarCiudades();
            ciudades = new LinkedList();
            for(int i = 0;i<c.length-1;i++) {
                ciudades.addLast(c[i]);
                listaDeCiudades.addItem((ciudades.get(i)).obtenerNombre());
            }
        } else {
            JOptionPane.showMessageDialog(null, "HOLA");
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        listaDeCiudades = new javax.swing.JComboBox();
        tempMaxD3 = new javax.swing.JLabel();
        iconoD3 = new javax.swing.JLabel();
        tempMaxD2 = new javax.swing.JLabel();
        iconoD2 = new javax.swing.JLabel();
        tempMaxD1 = new javax.swing.JLabel();
        iconoD1 = new javax.swing.JLabel();
        tempMaxD4 = new javax.swing.JLabel();
        iconoD4 = new javax.swing.JLabel();
        fechaD2 = new javax.swing.JLabel();
        fechaD3 = new javax.swing.JLabel();
        fechaD4 = new javax.swing.JLabel();
        fechaD1 = new javax.swing.JLabel();
        pronosticoD4 = new javax.swing.JLabel();
        pronosticoD1 = new javax.swing.JLabel();
        pronosticoD2 = new javax.swing.JLabel();
        pronosticoD3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pronosticoD2RT = new javax.swing.JTextArea();

        setLocation(new java.awt.Point(500, 300));
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 300));
        setLayout(null);

        jSeparator2.setName("jSeparator2"); // NOI18N
        add(jSeparator2);
        jSeparator2.setBounds(264, 255, 0, 12);

        jSeparator1.setName("jSeparator1"); // NOI18N
        add(jSeparator1);
        jSeparator1.setBounds(0, 140, 480, 12);

        jSeparator3.setName("jSeparator3"); // NOI18N
        add(jSeparator3);
        jSeparator3.setBounds(80, 180, 0, 30);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setName("jSeparator4"); // NOI18N
        add(jSeparator4);
        jSeparator4.setBounds(140, 140, 12, 160);

        jSeparator5.setName("jSeparator5"); // NOI18N
        add(jSeparator5);
        jSeparator5.setBounds(190, 200, 0, 12);

        jSeparator6.setName("jSeparator6"); // NOI18N
        add(jSeparator6);
        jSeparator6.setBounds(190, 190, 0, 12);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setName("jSeparator7"); // NOI18N
        add(jSeparator7);
        jSeparator7.setBounds(310, 140, 10, 160);

        listaDeCiudades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Ciudad" }));
        listaDeCiudades.setName("listaDeCiudades"); // NOI18N
        listaDeCiudades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaDeCiudadesItemStateChanged(evt);
            }
        });
        add(listaDeCiudades);
        listaDeCiudades.setBounds(10, 10, 190, 27);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(pronosticator.PronosticatorApp.class).getContext().getResourceMap(Pronosticator.class);
        tempMaxD3.setFont(resourceMap.getFont("tempMaxD3.font")); // NOI18N
        tempMaxD3.setText(resourceMap.getString("tempMaxD3.text")); // NOI18N
        tempMaxD3.setName("tempMaxD3"); // NOI18N
        add(tempMaxD3);
        tempMaxD3.setBounds(160, 160, 100, 60);

        iconoD3.setText(resourceMap.getString("iconoD3.text")); // NOI18N
        iconoD3.setName("iconoD3"); // NOI18N
        add(iconoD3);
        iconoD3.setBounds(160, 210, 64, 64);

        tempMaxD2.setFont(resourceMap.getFont("tempMaxD2.font")); // NOI18N
        tempMaxD2.setText(resourceMap.getString("tempMaxD2.text")); // NOI18N
        tempMaxD2.setName("tempMaxD2"); // NOI18N
        add(tempMaxD2);
        tempMaxD2.setBounds(20, 160, 110, 60);

        iconoD2.setText(resourceMap.getString("iconoD2.text")); // NOI18N
        iconoD2.setName("iconoD2"); // NOI18N
        add(iconoD2);
        iconoD2.setBounds(20, 210, 64, 64);

        tempMaxD1.setFont(resourceMap.getFont("tempMaxD1.font")); // NOI18N
        tempMaxD1.setText(resourceMap.getString("tempMaxD1.text")); // NOI18N
        tempMaxD1.setName("tempMaxD1"); // NOI18N
        add(tempMaxD1);
        tempMaxD1.setBounds(360, 0, 110, 70);

        iconoD1.setText(resourceMap.getString("iconoD1.text")); // NOI18N
        iconoD1.setName("iconoD1"); // NOI18N
        add(iconoD1);
        iconoD1.setBounds(380, 60, 64, 64);

        tempMaxD4.setFont(resourceMap.getFont("tempMaxD4.font")); // NOI18N
        tempMaxD4.setText(resourceMap.getString("tempMaxD4.text")); // NOI18N
        tempMaxD4.setName("tempMaxD4"); // NOI18N
        add(tempMaxD4);
        tempMaxD4.setBounds(330, 160, 100, 60);

        iconoD4.setText(resourceMap.getString("iconoD4.text")); // NOI18N
        iconoD4.setName("iconoD4"); // NOI18N
        add(iconoD4);
        iconoD4.setBounds(320, 210, 64, 64);

        fechaD2.setFont(resourceMap.getFont("fechaD2.font")); // NOI18N
        fechaD2.setText(resourceMap.getString("fechaD2.text")); // NOI18N
        fechaD2.setName("fechaD2"); // NOI18N
        add(fechaD2);
        fechaD2.setBounds(20, 140, 130, 20);

        fechaD3.setFont(resourceMap.getFont("fechaD3.font")); // NOI18N
        fechaD3.setText(resourceMap.getString("fechaD3.text")); // NOI18N
        fechaD3.setName("fechaD3"); // NOI18N
        add(fechaD3);
        fechaD3.setBounds(170, 140, 130, 22);

        fechaD4.setFont(resourceMap.getFont("fechaD4.font")); // NOI18N
        fechaD4.setText(resourceMap.getString("fechaD4.text")); // NOI18N
        fechaD4.setName("fechaD4"); // NOI18N
        add(fechaD4);
        fechaD4.setBounds(340, 140, 150, 20);

        fechaD1.setFont(resourceMap.getFont("fechaD1.font")); // NOI18N
        fechaD1.setText(resourceMap.getString("fechaD1.text")); // NOI18N
        fechaD1.setName("fechaD1"); // NOI18N
        add(fechaD1);
        fechaD1.setBounds(340, 120, 140, 22);

        pronosticoD4.setText(resourceMap.getString("pronosticoD4.text")); // NOI18N
        pronosticoD4.setName("pronosticoD4"); // NOI18N
        add(pronosticoD4);
        pronosticoD4.setBounds(320, 230, 160, 90);

        pronosticoD1.setText(resourceMap.getString("pronosticoD1.text")); // NOI18N
        pronosticoD1.setName("pronosticoD1"); // NOI18N
        add(pronosticoD1);
        pronosticoD1.setBounds(10, 60, 230, 16);

        pronosticoD2.setText(resourceMap.getString("pronosticoD2.text")); // NOI18N
        pronosticoD2.setName("pronosticoD2"); // NOI18N
        add(pronosticoD2);
        pronosticoD2.setBounds(0, 230, 150, 90);

        pronosticoD3.setText(resourceMap.getString("pronosticoD3.text")); // NOI18N
        pronosticoD3.setName("pronosticoD3"); // NOI18N
        add(pronosticoD3);
        pronosticoD3.setBounds(150, 236, 160, 80);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        pronosticoD2RT.setColumns(20);
        pronosticoD2RT.setRows(5);
        pronosticoD2RT.setBorder(null);
        pronosticoD2RT.setEnabled(false);
        pronosticoD2RT.setFocusable(false);
        pronosticoD2RT.setName("pronosticoD2T"); // NOI18N
        jScrollPane1.setViewportView(pronosticoD2RT);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 190, 244, 84);
    }// </editor-fold>//GEN-END:initComponents

    private void listaDeCiudadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaDeCiudadesItemStateChanged
        // TODO add your handling code here:
        System.out.println(listaDeCiudades.getSelectedIndex());
        Ciudad tmp = ciudades.get(listaDeCiudades.getSelectedIndex());

        /* Obteniendo temperaturas */

        tempMaxD1.setText(""+tmp.obtenerPronostico().obtenerTemperaturaMax()[0]+"º");
        tempMaxD2.setText(""+tmp.obtenerPronostico().obtenerTemperaturaMax()[1]+"º");
        tempMaxD3.setText(""+tmp.obtenerPronostico().obtenerTemperaturaMax()[2]+"º");
        tempMaxD4.setText(""+tmp.obtenerPronostico().obtenerTemperaturaMax()[3]+"º");

        /* Obteniendo fechas */

        fechaD1.setText(tmp.obtenerPronostico().obtenerFecha()[0]);
        fechaD2.setText(tmp.obtenerPronostico().obtenerFecha()[1]);
        fechaD3.setText(tmp.obtenerPronostico().obtenerFecha()[2]);
        fechaD4.setText(tmp.obtenerPronostico().obtenerFecha()[3]);

        /* Obteniendo Iconos */

        System.out.println(tmp.obtenerPronostico().obtenerIconos()[0].substring(0,tmp.obtenerPronostico().obtenerIconos()[0].indexOf('.'))+".png");
        System.out.println(tmp.obtenerPronostico().obtenerIconos()[1].substring(0,tmp.obtenerPronostico().obtenerIconos()[1].indexOf('.'))+".png");
        System.out.println(tmp.obtenerPronostico().obtenerIconos()[2].substring(0,tmp.obtenerPronostico().obtenerIconos()[2].indexOf('.'))+".png");
        System.out.println(tmp.obtenerPronostico().obtenerIconos()[3].substring(0,tmp.obtenerPronostico().obtenerIconos()[3].indexOf('.'))+".png");
        iconoD1.setDisabledIcon(new ImageIcon(getClass().getResource("tiempoicons/"+tmp.obtenerPronostico().obtenerIconos()[0].substring(0,tmp.obtenerPronostico().obtenerIconos()[0].indexOf('.'))+".png")));
        iconoD2.setDisabledIcon(new ImageIcon(getClass().getResource("tiempoicons/"+tmp.obtenerPronostico().obtenerIconos()[1].substring(0,tmp.obtenerPronostico().obtenerIconos()[1].indexOf('.'))+".png")));
        iconoD3.setDisabledIcon(new ImageIcon(getClass().getResource("tiempoicons/"+tmp.obtenerPronostico().obtenerIconos()[2].substring(0,tmp.obtenerPronostico().obtenerIconos()[2].indexOf('.'))+".png")));
        iconoD4.setDisabledIcon(new ImageIcon(getClass().getResource("tiempoicons/"+tmp.obtenerPronostico().obtenerIconos()[3].substring(0,tmp.obtenerPronostico().obtenerIconos()[3].indexOf('.'))+".png")));

        iconoD1.setEnabled(false);
        iconoD2.setEnabled(false);
        iconoD3.setEnabled(false);
        iconoD4.setEnabled(false);


        /* Obteniendo los pronosticos en palabras */
        
        pronosticoD1.setText(tmp.obtenerPronostico().obtenerPronostico()[0]);
        pronosticoD2.setText(tmp.obtenerPronostico().obtenerPronostico()[1]);
        pronosticoD3.setText(tmp.obtenerPronostico().obtenerPronostico()[2]);
        pronosticoD4.setText(tmp.obtenerPronostico().obtenerPronostico()[3]);
        pronosticoD2RT.setText(tmp.obtenerPronostico().obtenerPronostico()[1]);
    }//GEN-LAST:event_listaDeCiudadesItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fechaD1;
    private javax.swing.JLabel fechaD2;
    private javax.swing.JLabel fechaD3;
    private javax.swing.JLabel fechaD4;
    private javax.swing.JLabel iconoD1;
    private javax.swing.JLabel iconoD2;
    private javax.swing.JLabel iconoD3;
    private javax.swing.JLabel iconoD4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JComboBox listaDeCiudades;
    private javax.swing.JLabel pronosticoD1;
    private javax.swing.JLabel pronosticoD2;
    private javax.swing.JTextArea pronosticoD2RT;
    private javax.swing.JLabel pronosticoD3;
    private javax.swing.JLabel pronosticoD4;
    private javax.swing.JLabel tempMaxD1;
    private javax.swing.JLabel tempMaxD2;
    private javax.swing.JLabel tempMaxD3;
    private javax.swing.JLabel tempMaxD4;
    // End of variables declaration//GEN-END:variables

}
