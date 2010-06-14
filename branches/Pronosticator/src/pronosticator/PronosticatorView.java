/*
 * PronosticatorView.java
 */

package pronosticator;

import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * The application's main frame.
 */
public class PronosticatorView extends FrameView {

    public PronosticatorView(SingleFrameApplication app) {
        super(app);
        Pronosticator ap = new Pronosticator();
        ap.setBounds(0, 0, 600 , 600);
        ap.setVisible(true);
        this.getFrame().add(ap);
        initComponents();
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = PronosticatorApp.getApplication().getMainFrame();
            aboutBox = new PronosticatorAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        PronosticatorApp.getApplication().show(aboutBox);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(pronosticator.PronosticatorApp.class).getContext().getResourceMap(PronosticatorView.class);
        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

   

    private JDialog aboutBox;
}
