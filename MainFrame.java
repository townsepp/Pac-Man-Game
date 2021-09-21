
package PacManGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MainFrame extends javax.swing.JFrame implements KeyListener {

    
    public MainFrame() {
        initComponents();
        this.addKeyListener(this);
        this.setFocusable(true);
        this.graphicsPanel.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graphicsPanel = new PacManGame.GraphicsPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        graphicsPanel.setPreferredSize(new java.awt.Dimension(1700, 900));

        javax.swing.GroupLayout graphicsPanelLayout = new javax.swing.GroupLayout(graphicsPanel);
        graphicsPanel.setLayout(graphicsPanelLayout);
        graphicsPanelLayout.setHorizontalGroup(
            graphicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        graphicsPanelLayout.setVerticalGroup(
            graphicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graphicsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graphicsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
switch(e.getKeyCode()) {
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                this.graphicsPanel.setCurrentDirection(Direction.Left);
                break;
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                this.graphicsPanel.setCurrentDirection(Direction.Up);
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                this.graphicsPanel.setCurrentDirection(Direction.Down);
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                this.graphicsPanel.setCurrentDirection(Direction.Right);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private PacManGame.GraphicsPanel graphicsPanel;
    // End of variables declaration//GEN-END:variables
}