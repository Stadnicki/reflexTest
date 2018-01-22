package reflextest;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

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
        buttonGoBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelSimple = new javax.swing.JPanel();
        retryButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        testLeft = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        backgroundLab = new javax.swing.JLabel();
        panelAim = new javax.swing.JPanel();
        testsLeftAim = new javax.swing.JLabel();
        buttonRetryAim = new javax.swing.JButton();
        buttonBackAim = new javax.swing.JButton();
        square = new javax.swing.JButton();
        infoLabelAim = new javax.swing.JLabel();
        animatedBackAim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
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
        jLabel3.setBounds(0, 2, 140, 20);

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

        buttonGoBack.setBackground(new java.awt.Color(0, 0, 0));
        buttonGoBack.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        buttonGoBack.setForeground(new java.awt.Color(204, 204, 204));
        buttonGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        buttonGoBack.setText("◄");
        buttonGoBack.setBorderPainted(false);
        buttonGoBack.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        buttonGoBack.setFocusCycleRoot(true);
        buttonGoBack.setFocusPainted(false);
        buttonGoBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonGoBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        buttonGoBack.setRequestFocusEnabled(false);
        buttonGoBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        buttonGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoBackActionPerformed(evt);
            }
        });
        panelModes.add(buttonGoBack);
        buttonGoBack.setBounds(433, 350, 500, 100);

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
        panelSimple.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        panelSimple.setFocusTraversalPolicyProvider(true);
        panelSimple.setPreferredSize(new java.awt.Dimension(1366, 768));
        panelSimple.setLayout(null);

        retryButton.setBackground(new java.awt.Color(0, 0, 0));
        retryButton.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        retryButton.setForeground(new java.awt.Color(204, 204, 204));
        retryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        retryButton.setText("RETRY");
        retryButton.setBorderPainted(false);
        retryButton.setVisible(false);
        retryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        retryButton.setFocusCycleRoot(true);
        retryButton.setFocusPainted(false);
        retryButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        retryButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        retryButton.setRequestFocusEnabled(false);
        retryButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        retryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryButtonActionPerformed(evt);
            }
        });
        panelSimple.add(retryButton);
        retryButton.setBounds(433, 200, 500, 100);

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 204, 204));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        backButton.setText("◄");
        backButton.setBorderPainted(false);
        backButton.setVisible(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        backButton.setFocusCycleRoot(true);
        backButton.setFocusPainted(false);
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        backButton.setRequestFocusEnabled(false);
        backButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        panelSimple.add(backButton);
        backButton.setBounds(433, 350, 500, 100);

        testLeft.setFont(new java.awt.Font("Verdana", 1, 120)); // NOI18N
        testLeft.setForeground(new java.awt.Color(204, 204, 204));
        testLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        testLeft.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        testLeft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelSimple.add(testLeft);
        testLeft.setBounds(0, 390, 1370, 380);

        infoLabel.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(204, 204, 204));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("PRESS  SPACEBAR TO START\n");
        infoLabel.setToolTipText("");
        infoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        infoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelSimple.add(infoLabel);
        infoLabel.setBounds(0, 275, 1370, 100);

        backgroundLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/background.gif"))); // NOI18N
        backgroundLab.setMaximumSize(new java.awt.Dimension(1366, 768));
        backgroundLab.setMinimumSize(new java.awt.Dimension(1366, 768));
        backgroundLab.setPreferredSize(new java.awt.Dimension(1366, 768));
        backgroundLab.setVisible(true);
        panelSimple.add(backgroundLab);
        backgroundLab.setBounds(0, 0, 1376, 768);

        getContentPane().add(panelSimple);
        panelSimple.setBounds(0, 0, 1366, 768);

        panelAim.setLayout(null);

        testsLeftAim.setFont(new java.awt.Font("Verdana", 1, 120)); // NOI18N
        testsLeftAim.setForeground(new java.awt.Color(204, 204, 204));
        testsLeftAim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        testsLeftAim.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelAim.add(testsLeftAim);
        testsLeftAim.setBounds(0, 580, 1366, 200);
        testsLeftAim.setVisible(false);
        testsLeftAim.getAccessibleContext().setAccessibleName("");
        testsLeftAim.getAccessibleContext().setAccessibleDescription("");

        buttonRetryAim.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        buttonRetryAim.setForeground(new java.awt.Color(204, 204, 204));
        buttonRetryAim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        buttonRetryAim.setText("RETRY");
        buttonRetryAim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRetryAim.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        buttonRetryAim.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        panelAim.add(buttonRetryAim);
        buttonRetryAim.setBounds(433, 200, 500, 100);
        buttonRetryAim.setVisible(false);

        buttonBackAim.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        buttonBackAim.setForeground(new java.awt.Color(204, 204, 204));
        buttonBackAim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/basic.jpg"))); // NOI18N
        buttonBackAim.setText("◄");
        buttonBackAim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonBackAim.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/pressed.jpg"))); // NOI18N
        buttonBackAim.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/rollover.jpg"))); // NOI18N
        panelAim.add(buttonBackAim);
        buttonBackAim.setBounds(433, 350, 500, 100);
        buttonBackAim.setVisible(false);
        panelAim.add(square);
        square.setBounds(470, 130, 100, 100);
        square.setVisible(false);

        infoLabelAim.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        infoLabelAim.setForeground(new java.awt.Color(204, 204, 204));
        infoLabelAim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabelAim.setText("<html><center>CLICK ON WHITE SQUARE WHEN YOU SEE IT <br>PRESS SPACEBAR TO START</center></html>");
        panelAim.add(infoLabelAim);
        infoLabelAim.setBounds(0, 275, 1366, 100);

        animatedBackAim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reflextest/background.gif"))); // NOI18N
        animatedBackAim.setText("jLabel5");
        panelAim.add(animatedBackAim);
        animatedBackAim.setBounds(0, 0, 1366, 768);

        getContentPane().add(panelAim);
        panelAim.setBounds(0, 0, 1366, 768);
        panelAim.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    public void whiteScreen()
    {
        infoLabel.setText("PRESS SPACEBAR");
        panelSimple.setBackground(Color.white);
        infoLabel.setForeground(new java.awt.Color(51, 51, 51));
        testLeft.setForeground(new java.awt.Color(51, 51, 51));
    }

    public void afterSimpleMenu()
    {
        animatedBack();
        infoLabel.setBounds(0, 50, 1370, 100);
        backButton.setVisible(true);
        retryButton.setVisible(true); 
        testLeft.setVisible(false);
        infoLabel.setForeground(new java.awt.Color(204, 204, 204));
        panelSimple.setBackground(Color.black);
    }
    
    public void resetAfterGame()
    {
        backButton.setVisible(false);
        infoLabel.setVisible(true);
        retryButton.setVisible(false);  
        infoLabel.setText("PRESS SPACEBAR TO START");
        testLeft.setForeground(new java.awt.Color(204, 204, 204));
        infoLabel.setBounds(0, 275, 1370, 100);
    }
    
    public void animatedBack()
    {
        backgroundLab.setVisible(true);
    }
    
    
    public void waitScreen()
    {
        testLeft.setForeground(new java.awt.Color(204, 204, 204));
        infoLabel.setText("WAIT FOR WHITE SCREEN, THEN PRESS SPACEBAR");
        panelSimple.setBackground(Color.black);
        infoLabel.setForeground(new java.awt.Color(204, 204, 204));    
        testLeft.setVisible(true);
        backgroundLab.setVisible(false);
    }
    
    public void prepareAimScreen()
    {
        animatedBackAim.setVisible(false);
        infoLabelAim.setForeground(new java.awt.Color(204, 204, 204));   
        panelAim.setBackground(Color.black);
        infoLabelAim.setVisible(false);
        buttonRetryAim.setVisible(false);
        buttonBackAim.setVisible(false);
    }
    
    public void setDots(int testsNum, int step)
    {
        String temp="";
        int i;
        i = testsNum-step;
        for(; i>0; i--)
        {
            temp += '*';
        }
        testsLeftAim.setText(temp);
        testsLeftAim.setVisible(true);
    }
    
    public void aimResult()
    {
        animatedBackAim.setVisible(true);
        infoLabelAim.setVisible(true);
        infoLabelAim.setBounds(0, 50, 1370, 100);
        buttonRetryAim.setVisible(true);
        buttonBackAim.setVisible(true);
    }
    
    public void showSquare(Point p)
    {
        square.setVisible(true);
        square.setLocation(p);
    }
    
    public void showMainMenu()
    {
        panelSimple.setVisible(false);
        panelModes.setVisible(false);
        panelMenu.setVisible(true);
        panelAim.setVisible(false);
        infoLabel.setText("PRESS  SPACEBAR TO START");
        currPanelName = "panelMenu";
    }
    
    public void showModesMenu()
    {
        panelSimple.setVisible(false);
        panelModes.setVisible(true);
        panelMenu.setVisible(false);
        panelAim.setVisible(false);
        infoLabel.setText("PRESS  SPACEBAR TO START");
        currPanelName = "panelModes";
    }
 
    public void playAimTest()
    {
        panelModes.setVisible(false);
        infoLabelAim.setText("<html><center>CLICK ON WHITE SQUARE WHEN YOU SEE IT <br>PRESS SPACEBAR TO START</center></html>");
        panelAim.setVisible(true);
        currPanelName = "panelAimPrepare";
        panelAim.requestFocus();
        infoLabelAim.setBounds(0, 275, 1370, 100);
        infoLabelAim.setVisible(true);
        buttonRetryAim.setVisible(false);
        buttonBackAim.setVisible(false);
    }
    
    public void simpleTest()
    {
        panelModes.setVisible(false);
        panelSimple.setBackground(Color.black);
        panelSimple.setVisible(true);
        panelSimple.requestFocus();
        currPanelName = "panelSimple"; 
    }
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        panelMenu.setVisible(false);
        panelModes.setVisible(true);
        currPanelName = "panelModes";
    }//GEN-LAST:event_startButtonActionPerformed

    private void buttonAimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAimActionPerformed
            playAimTest();
    }//GEN-LAST:event_buttonAimActionPerformed

    private void buttonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoBackActionPerformed
        panelModes.setVisible(false);
        panelMenu.setVisible(true);
        currPanelName = "panelMenu";
    }//GEN-LAST:event_buttonGoBackActionPerformed

    private void buttonSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpleActionPerformed
         simpleTest();
    }//GEN-LAST:event_buttonSimpleActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retryButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new View().setVisible(true);
        });
    }

    Long prevTime = null;
    Long currTime = null;
    String currPanelName;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animatedBackAim;
    public javax.swing.JButton backButton;
    public javax.swing.JLabel backgroundLab;
    private javax.swing.JButton buttonAim;
    public javax.swing.JButton buttonBackAim;
    private javax.swing.JButton buttonGoBack;
    public javax.swing.JButton buttonRetryAim;
    public javax.swing.JButton buttonSimple;
    private javax.swing.JButton exitButton;
    public javax.swing.JLabel infoLabel;
    public javax.swing.JLabel infoLabelAim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel panelAim;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelModes;
    public javax.swing.JPanel panelSimple;
    public javax.swing.JButton retryButton;
    public javax.swing.JButton square;
    private javax.swing.JButton startButton;
    public javax.swing.JLabel testLeft;
    private javax.swing.JLabel testsLeftAim;
    // End of variables declaration//GEN-END:variables

}
