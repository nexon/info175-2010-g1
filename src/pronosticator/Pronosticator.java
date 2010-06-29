package pronosticator;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        /* Verificamos las preferencias Guardadas */
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("pronosticator.properties"));
        } catch (IOException e) {
            try {
                properties.store(new FileOutputStream("pronosticator.properties"), null);
            } catch (IOException ex) {
                Logger.getLogger(Pronosticator.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         }
        datos = new Parser("http://www.meteochile.cl/js/pronostico_general.js");
        if(datos.obtenerEstado()) {
            listaDeCiudades.addItem("Seleccione Ciudad");
            Ciudad c[] = datos.generarCiudades();
            ciudades = new LinkedList();
            for(int i = 1;i<c.length-1;i++) {
                ciudades.addLast(c[i]);
                listaDeCiudades.addItem(c[i].obtenerNombre());
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay conexión, pero te mostraré los pronosticos anteriores :D");
            listaDeCiudades.addItem("Seleccione Ciudad");
            
        }
        System.out.println(properties.getProperty("ciudad"));
        if(!properties.isEmpty()) {
            listaDeCiudades.setSelectedIndex(Integer.parseInt(properties.getProperty("ciudad")));
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
        jSeparator8 = new javax.swing.JSeparator();

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
        jSeparator1.setBounds(0, 120, 480, 12);

        jSeparator3.setName("jSeparator3"); // NOI18N
        add(jSeparator3);
        jSeparator3.setBounds(80, 180, 0, 30);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setName("jSeparator4"); // NOI18N
        add(jSeparator4);
        jSeparator4.setBounds(130, 120, 12, 160);

        jSeparator5.setName("jSeparator5"); // NOI18N
        add(jSeparator5);
        jSeparator5.setBounds(190, 200, 0, 12);

        jSeparator6.setName("jSeparator6"); // NOI18N
        add(jSeparator6);
        jSeparator6.setBounds(190, 190, 0, 12);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setName("jSeparator7"); // NOI18N
        add(jSeparator7);
        jSeparator7.setBounds(300, 120, 10, 160);

        listaDeCiudades.setName("listaDeCiudades"); // NOI18N
        listaDeCiudades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaDeCiudadesItemStateChanged(evt);
            }
        });
        listaDeCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeCiudadesActionPerformed(evt);
            }
        });
        add(listaDeCiudades);
        listaDeCiudades.setBounds(10, 10, 190, 27);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(pronosticator.PronosticatorApp.class).getContext().getResourceMap(Pronosticator.class);
        tempMaxD3.setFont(resourceMap.getFont("tempMaxD3.font")); // NOI18N
        tempMaxD3.setText(resourceMap.getString("tempMaxD3.text")); // NOI18N
        tempMaxD3.setName("tempMaxD3"); // NOI18N
        add(tempMaxD3);
        tempMaxD3.setBounds(160, 160, 150, 60);

        iconoD3.setText(resourceMap.getString("iconoD3.text")); // NOI18N
        iconoD3.setName("iconoD3"); // NOI18N
        add(iconoD3);
        iconoD3.setBounds(160, 210, 64, 64);

        tempMaxD2.setFont(resourceMap.getFont("tempMaxD2.font")); // NOI18N
        tempMaxD2.setText(resourceMap.getString("tempMaxD2.text")); // NOI18N
        tempMaxD2.setName("tempMaxD2"); // NOI18N
        add(tempMaxD2);
        tempMaxD2.setBounds(20, 160, 120, 60);

        iconoD2.setText(resourceMap.getString("iconoD2.text")); // NOI18N
        iconoD2.setName("iconoD2"); // NOI18N
        add(iconoD2);
        iconoD2.setBounds(20, 210, 64, 64);

        tempMaxD1.setFont(resourceMap.getFont("tempMaxD1.font")); // NOI18N
        tempMaxD1.setText(resourceMap.getString("tempMaxD1.text")); // NOI18N
        tempMaxD1.setName("tempMaxD1"); // NOI18N
        add(tempMaxD1);
        tempMaxD1.setBounds(10, 60, 110, 70);

        iconoD1.setText(resourceMap.getString("iconoD1.text")); // NOI18N
        iconoD1.setName("iconoD1"); // NOI18N
        add(iconoD1);
        iconoD1.setBounds(380, 50, 64, 64);

        tempMaxD4.setFont(resourceMap.getFont("tempMaxD4.font")); // NOI18N
        tempMaxD4.setText(resourceMap.getString("tempMaxD4.text")); // NOI18N
        tempMaxD4.setName("tempMaxD4"); // NOI18N
        add(tempMaxD4);
        tempMaxD4.setBounds(330, 160, 150, 60);

        iconoD4.setText(resourceMap.getString("iconoD4.text")); // NOI18N
        iconoD4.setName("iconoD4"); // NOI18N
        add(iconoD4);
        iconoD4.setBounds(320, 210, 64, 64);

        fechaD2.setFont(resourceMap.getFont("fechaD2.font")); // NOI18N
        fechaD2.setText(resourceMap.getString("fechaD2.text")); // NOI18N
        fechaD2.setName("fechaD2"); // NOI18N
        add(fechaD2);
        fechaD2.setBounds(20, 130, 130, 20);

        fechaD3.setFont(resourceMap.getFont("fechaD3.font")); // NOI18N
        fechaD3.setText(resourceMap.getString("fechaD3.text")); // NOI18N
        fechaD3.setName("fechaD3"); // NOI18N
        add(fechaD3);
        fechaD3.setBounds(160, 130, 130, 20);

        fechaD4.setFont(resourceMap.getFont("fechaD4.font")); // NOI18N
        fechaD4.setText(resourceMap.getString("fechaD4.text")); // NOI18N
        fechaD4.setName("fechaD4"); // NOI18N
        add(fechaD4);
        fechaD4.setBounds(330, 130, 150, 20);

        fechaD1.setFont(resourceMap.getFont("fechaD1.font")); // NOI18N
        fechaD1.setText(resourceMap.getString("fechaD1.text")); // NOI18N
        fechaD1.setName("fechaD1"); // NOI18N
        add(fechaD1);
        fechaD1.setBounds(10, 50, 140, 22);

        jSeparator8.setName("jSeparator8"); // NOI18N
        add(jSeparator8);
        jSeparator8.setBounds(0, 150, 480, 12);
    }// </editor-fold>//GEN-END:initComponents

    private void listaDeCiudadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaDeCiudadesItemStateChanged
        /* Creamos una instancia de properties para guardar la ciudad seleccionada (o en su defecto, el index) */
        Properties properties = new Properties();
        
        if(listaDeCiudades.getSelectedIndex() != 0 ){
            properties.setProperty("ciudad", ""+(listaDeCiudades.getSelectedIndex()));
            //properties.put("tiempo", ciudades);
            properties.setProperty("tiempo", ciudades+"");
            
            Ciudad tmp = ciudades.get(listaDeCiudades.getSelectedIndex()-1);
            /* Obteniendo temperaturas */

            tempMaxD1.setText(""+tmp.obtenerPronostico().obtenerTemperaturaMax()[0]+"º");
            tempMaxD2.setText(""+tmp.obtenerPronostico().obtenerTemperaturaMin()[1]+"º/"+tmp.obtenerPronostico().obtenerTemperaturaMax()[1]+"º");
            tempMaxD3.setText(""+tmp.obtenerPronostico().obtenerTemperaturaMin()[2]+"º/"+tmp.obtenerPronostico().obtenerTemperaturaMax()[2]+"º");
            tempMaxD4.setText(""+tmp.obtenerPronostico().obtenerTemperaturaMin()[3]+"º/"+tmp.obtenerPronostico().obtenerTemperaturaMax()[3]+"º");

            /* Obteniendo fechas */

            fechaD1.setText(tmp.obtenerPronostico().obtenerFecha()[0]);
            fechaD2.setText(tmp.obtenerPronostico().obtenerFecha()[1]);
            fechaD3.setText(tmp.obtenerPronostico().obtenerFecha()[2]);
            fechaD4.setText(tmp.obtenerPronostico().obtenerFecha()[3]);

            /* Obteniendo Iconos */

            iconoD1.setDisabledIcon(new ImageIcon(getClass().getResource("tiempoicons/"+tmp.obtenerPronostico().obtenerIconos()[0].substring(0,tmp.obtenerPronostico().obtenerIconos()[0].indexOf('.'))+".png")));
            iconoD2.setDisabledIcon(new ImageIcon(getClass().getResource("tiempoicons/"+tmp.obtenerPronostico().obtenerIconos()[1].substring(0,tmp.obtenerPronostico().obtenerIconos()[1].indexOf('.'))+".png")));
            iconoD3.setDisabledIcon(new ImageIcon(getClass().getResource("tiempoicons/"+tmp.obtenerPronostico().obtenerIconos()[2].substring(0,tmp.obtenerPronostico().obtenerIconos()[2].indexOf('.'))+".png")));
            iconoD4.setDisabledIcon(new ImageIcon(getClass().getResource("tiempoicons/"+tmp.obtenerPronostico().obtenerIconos()[3].substring(0,tmp.obtenerPronostico().obtenerIconos()[3].indexOf('.'))+".png")));

            iconoD1.setEnabled(false);
            iconoD2.setEnabled(false);
            iconoD3.setEnabled(false);
            iconoD4.setEnabled(false);

            iconoD1.setToolTipText(tmp.obtenerPronostico().obtenerPronostico()[0]);
            iconoD2.setToolTipText(tmp.obtenerPronostico().obtenerPronostico()[1]);
            iconoD3.setToolTipText(tmp.obtenerPronostico().obtenerPronostico()[2]);
            iconoD4.setToolTipText(tmp.obtenerPronostico().obtenerPronostico()[3]);

            /* Escribimos en las propiedades */
            
            try {
                properties.store(new FileOutputStream("pronosticator.properties"), null);
            } catch (IOException ex) {
                System.out.println("EERRORR");
            }
            

         }
    }//GEN-LAST:event_listaDeCiudadesItemStateChanged

    private void listaDeCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeCiudadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaDeCiudadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fechaD1;
    private javax.swing.JLabel fechaD2;
    private javax.swing.JLabel fechaD3;
    private javax.swing.JLabel fechaD4;
    private javax.swing.JLabel iconoD1;
    private javax.swing.JLabel iconoD2;
    private javax.swing.JLabel iconoD3;
    private javax.swing.JLabel iconoD4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JComboBox listaDeCiudades;
    private javax.swing.JLabel tempMaxD1;
    private javax.swing.JLabel tempMaxD2;
    private javax.swing.JLabel tempMaxD3;
    private javax.swing.JLabel tempMaxD4;
    // End of variables declaration//GEN-END:variables
    @Override
    protected void paintComponent( Graphics g ) {
        super.paintComponent( g );
        int panelHeight = getHeight();
        int panelWidth = getWidth();
        GradientPaint gradientPaint = new GradientPaint( 0 , 0 , Color.GRAY , panelWidth , panelHeight , Color.WHITE );
        if( g instanceof Graphics2D ) {
            Graphics2D graphics2D = (Graphics2D)g;
            graphics2D.setPaint( gradientPaint );
            graphics2D.fillRect( 0 , 0 , panelWidth , panelHeight );
        }
    }
}