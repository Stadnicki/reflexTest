package reflextest;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class View extends javax.swing.JFrame {
    public View() 
    {
        initComponents();
        setVisible(true);
        currPanelName = "panelMenu";
        panelMenu.setVisible(true);
        panelModes.setVisible(false);
        panelSimple.setVisible(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelModes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        buttonSimple = new javax.swing.JButton();
        buttonAim = new javax.swing.JButton();
        buttonColours = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelSimple = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        panelMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        panelMenu.setPreferredSize(new java.awt.Dimension(1366, 768));
        panelMenu.setLayout(null);

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        exitButton.setForeground(new java.awt.Color(204, 204, 204));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        exitButton.setText("EXIT");
        exitButton.setToolTipText("");
        exitButton.setBorderPainted(false);
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        exitButton.setFocusPainted(false);
        exitButton.setFocusable(false);
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        exitButton.setRequestFocusEnabled(false);
        exitButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        panelMenu.add(exitButton);
        exitButton.setBounds(433, 200, 500, 100);

        startButton.setBackground(new java.awt.Color(0, 0, 0));
        startButton.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        startButton.setForeground(new java.awt.Color(204, 204, 204));
        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        startButton.setText("START");
        startButton.setBorderPainted(false);
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        startButton.setFocusCycleRoot(true);
        startButton.setFocusPainted(false);
        startButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        startButton.setRequestFocusEnabled(false);
        startButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        panelMenu.add(startButton);
        startButton.setBounds(433, 50, 500, 100);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/autor.jpg"))); // NOI18N
        jLabel3.setText("Adrian Stadnicki");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelMenu.add(jLabel3);
        jLabel3.setBounds(1226, 720, 140, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/background.gif"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        panelMenu.add(jLabel1);
        jLabel1.setBounds(0, 0, 1376, 768);

        getContentPane().add(panelMenu);
        panelMenu.setBounds(0, 0, 1366, 768);

        panelModes.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        panelModes.setPreferredSize(new java.awt.Dimension(1366, 768));
        panelModes.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/autor.jpg"))); // NOI18N
        jLabel4.setText("Adrian Stadnicki");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelModes.add(jLabel4);
        jLabel4.setBounds(1226, 720, 140, 20);

        buttonSimple.setBackground(new java.awt.Color(0, 0, 0));
        buttonSimple.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        buttonSimple.setForeground(new java.awt.Color(204, 204, 204));
        buttonSimple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        buttonSimple.setText("SIMPLE");
        buttonSimple.setBorderPainted(false);
        buttonSimple.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        buttonSimple.setFocusCycleRoot(true);
        buttonSimple.setFocusPainted(false);
        buttonSimple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSimple.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        buttonSimple.setRequestFocusEnabled(false);
        buttonSimple.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        buttonSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpleActionPerformed(evt);
            }
        });
        panelModes.add(buttonSimple);
        buttonSimple.setBounds(433, 50, 500, 100);

        buttonAim.setBackground(new java.awt.Color(0, 0, 0));
        buttonAim.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        buttonAim.setForeground(new java.awt.Color(204, 204, 204));
        buttonAim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        buttonAim.setText("AIM");
        buttonAim.setBorderPainted(false);
        buttonAim.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        buttonAim.setFocusCycleRoot(true);
        buttonAim.setFocusPainted(false);
        buttonAim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAim.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        buttonAim.setRequestFocusEnabled(false);
        buttonAim.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        buttonAim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAimActionPerformed(evt);
            }
        });
        panelModes.add(buttonAim);
        buttonAim.setBounds(433, 200, 500, 100);

        buttonColours.setBackground(new java.awt.Color(0, 0, 0));
        buttonColours.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        buttonColours.setForeground(new java.awt.Color(204, 204, 204));
        buttonColours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        buttonColours.setText("◄");
        buttonColours.setBorderPainted(false);
        buttonColours.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        buttonColours.setFocusCycleRoot(true);
        buttonColours.setFocusPainted(false);
        buttonColours.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonColours.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        buttonColours.setRequestFocusEnabled(false);
        buttonColours.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        buttonColours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColoursActionPerformed(evt);
            }
        });
        panelModes.add(buttonColours);
        buttonColours.setBounds(433, 500, 500, 100);

        buttonBack.setBackground(new java.awt.Color(0, 0, 0));
        buttonBack.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        buttonBack.setForeground(new java.awt.Color(204, 204, 204));
        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        buttonBack.setText("COLOURS");
        buttonBack.setBorderPainted(false);
        buttonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        buttonBack.setFocusCycleRoot(true);
        buttonBack.setFocusPainted(false);
        buttonBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        buttonBack.setRequestFocusEnabled(false);
        buttonBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        panelModes.add(buttonBack);
        buttonBack.setBounds(433, 350, 500, 100);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/background.gif"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        panelModes.add(jLabel2);
        jLabel2.setBounds(0, 0, 1376, 768);

        getContentPane().add(panelModes);
        panelModes.setBounds(0, 0, 1366, 768);

        panelSimple.setBackground(new java.awt.Color(24, 24, 24));
        panelSimple.setFocusTraversalPolicyProvider(true);
        panelSimple.setPreferredSize(new java.awt.Dimension(1366, 768));
        panelSimple.setLayout(null);

        infoLabel.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(204, 204, 204));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("PRESS  SPACE TO START");
        infoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelSimple.add(infoLabel);
        infoLabel.setBounds(0, 0, 1370, 770);

        getContentPane().add(panelSimple);
        panelSimple.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        panelMenu.setVisible(false);
        panelModes.setVisible(true);
        currPanelName = "panelModes";
    }//GEN-LAST:event_startButtonActionPerformed

    private void buttonAimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAimActionPerformed

    private void buttonColoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColoursActionPerformed
        panelModes.setVisible(false);
        panelMenu.setVisible(true);
        currPanelName = "panelMenu";
    }//GEN-LAST:event_buttonColoursActionPerformed

    private void buttonSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpleActionPerformed
        panelModes.setVisible(false);
        currPanelName = "panelSimple"; 
        simpleTest();
    }//GEN-LAST:event_buttonSimpleActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBackActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    Long prevTime = null;
    Long currTime = null;
    String currPanelName;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAim;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonColours;
    public javax.swing.JButton buttonSimple;
    private javax.swing.JButton exitButton;
    public javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelModes;
    public javax.swing.JPanel panelSimple;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

    void simpleTest()
    {
        
        panelSimple.setBackground(Color.black);
        panelSimple.setVisible(true);
        panelSimple.requestFocus();
    }
}
