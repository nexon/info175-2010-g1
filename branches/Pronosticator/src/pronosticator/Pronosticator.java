/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Pronosticator.java
 *
 * Created on 28-may-2010, 15:20:40
 */

package pronosticator;

/*
 *
 * @author albertolagos
 */
public class Pronosticator extends javax.swing.JPanel {
    private Ciudad ciudades;
    private URLConnectionReader conexion;
    private Configuracion conf;
    /** Creates new form Pronosticator */
    public Pronosticator() {
        super();
        initComponents();
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
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(380, 269));
        setLayout(null);

        jSeparator2.setName("jSeparator2"); // NOI18N
        add(jSeparator2);
        jSeparator2.setBounds(264, 255, 0, 2);

        jSeparator1.setName("jSeparator1"); // NOI18N
        add(jSeparator1);
        jSeparator1.setBounds(0, 140, 390, 2);

        jSeparator3.setName("jSeparator3"); // NOI18N
        add(jSeparator3);
        jSeparator3.setBounds(80, 180, 0, 30);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setName("jSeparator4"); // NOI18N
        add(jSeparator4);
        jSeparator4.setBounds(120, 140, 50, 120);

        jSeparator5.setName("jSeparator5"); // NOI18N
        add(jSeparator5);
        jSeparator5.setBounds(190, 200, 50, 10);

        jSeparator6.setName("jSeparator6"); // NOI18N
        add(jSeparator6);
        jSeparator6.setBounds(190, 190, 50, 10);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setName("jSeparator7"); // NOI18N
        add(jSeparator7);
        jSeparator7.setBounds(250, 140, 10, 120);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Ciudad" }));
        jComboBox1.setName("jComboBox1"); // NOI18N
        add(jComboBox1);
        jComboBox1.setBounds(10, 20, 110, 20);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(pronosticator.PronosticatorApp.class).getContext().getResourceMap(Pronosticator.class);
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(20, 170, 70, 60);

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(140, 170, 70, 60);

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(280, 20, 70, 60);

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(270, 170, 70, 60);

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(350, 150, 30, 20);

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(80, 150, 30, 20);

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(210, 150, 30, 20);

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(20, 230, 60, 14);

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        add(jLabel9);
        jLabel9.setBounds(140, 230, 60, 14);

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        add(jLabel10);
        jLabel10.setBounds(270, 230, 60, 14);

        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N
        add(jLabel11);
        jLabel11.setBounds(280, 100, 70, 14);

        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N
        add(jLabel12);
        jLabel12.setBounds(140, 10, 50, 40);

        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N
        add(jLabel13);
        jLabel13.setBounds(270, 240, 80, 14);

        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N
        add(jLabel14);
        jLabel14.setBounds(140, 60, 80, 14);

        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N
        add(jLabel15);
        jLabel15.setBounds(20, 240, 80, 14);

        jLabel16.setText(resourceMap.getString("jLabel16.text")); // NOI18N
        jLabel16.setName("jLabel16"); // NOI18N
        add(jLabel16);
        jLabel16.setBounds(140, 240, 80, 14);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables

}
