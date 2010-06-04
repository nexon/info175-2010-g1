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
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

   

    private JDialog aboutBox;
}
