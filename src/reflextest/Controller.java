package reflextest;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;


public class Controller implements ActionListener
{
    String tempStr="";
    Timer testTimer = new Timer();
    TimerTask testTask = null;
    View reflexWindow = new View();     
    Model reflexModel = new Model();
    int changeTime;
    
    KeyListener reflexKeyListener = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) 
        {
            System.out.println("step: "+reflexModel.step);
            if("panelSimple".equals(reflexWindow.currPanelName))
            {
                if(reflexModel.toSoon == true)
                {
                    reflexModel.step = 0;
                    reflexWindow.infoLabel.setText("TO SOON, PRESS SPACEBAR TO START AGAIN");
                    reflexModel.toSoon = false;
                    testTask.cancel();
                }
                else
                {
                    if(reflexModel.step == 0)
                    {
                        reflexModel.toSoon=true;
                        reflexWindow.backgroundLab.setVisible(false);
                        reflexWindow.testLeft.setVisible(true);
                        changeTime = reflexModel.getRandomTime(); 
                        System.out.println("Random time s: "+(float)changeTime/1000);
                        reflexWindow.infoLabel.setText("WAIT FOR WHITE SCREEN, THEN PRESS SPACEBAR");
                        tempStr = "";
                        for(int i=3; i>reflexModel.step; i--)
                            tempStr = tempStr+"*";
                        
                        reflexWindow.testLeft.setText(tempStr);
                        
                        testTask = new TimerTask() {
                            @Override
                            public void run() {
                                    reflexModel.setStartTime(); 
                                    reflexModel.toSoon=false;
                                    reflexWindow.infoLabel.setText("PRESS SPACEBAR");
                                    reflexWindow.panelSimple.setBackground(Color.white);
                                    reflexWindow.infoLabel.setForeground(new java.awt.Color(51, 51, 51));
                                    reflexWindow.testLeft.setForeground(new java.awt.Color(51, 51, 51));
                            }
                        };
                        
                        testTimer.schedule(testTask, changeTime);
                    }
                    else if(reflexModel.step < 3)
                    {
                        reflexModel.setStopTime();
                        reflexModel.toSoon=true;
                        changeTime = reflexModel.getRandomTime(); 
                        System.out.println("Random time s: "+(float)changeTime/1000);
                        reflexWindow.testLeft.setForeground(new java.awt.Color(204, 204, 204));
                        reflexWindow.infoLabel.setText("WAIT FOR WHITE SCREEN, THEN PRESS SPACEBAR");
                        reflexWindow.panelSimple.setBackground(Color.black);
                        reflexWindow.infoLabel.setForeground(new java.awt.Color(204, 204, 204));          
                        tempStr = "";
                        for(int i=3; i>reflexModel.step; i--)
                            tempStr = tempStr+"*";
                        
                        reflexWindow.testLeft.setText(tempStr);
                        
                         testTask = new TimerTask() {
                            @Override
                            public void run() {
                                    reflexModel.toSoon=false;
                                    reflexModel.setStartTime(); 
                                    reflexWindow.infoLabel.setText("PRESS SPACEBAR");
                                    reflexWindow.panelSimple.setBackground(Color.white);
                                    reflexWindow.infoLabel.setForeground(new java.awt.Color(51, 51, 51));
                                    reflexWindow.testLeft.setForeground(new java.awt.Color(51, 51, 51));
                            }
                        };
                         
                        testTimer.schedule(testTask, changeTime);
                    }
                    else if( reflexModel.step == 3)
                    {                 
                        reflexWindow.backgroundLab.setVisible(true);
                        reflexModel.setStopTime();
                        reflexWindow.infoLabel.setBounds(0, 50, 1370, 100);
                        reflexWindow.backButton.setVisible(true);
                        reflexWindow.retryButton.setVisible(true);  
                        reflexModel.step++;
                        reflexWindow.infoLabel.setText("AVERAGE TIME: "+reflexModel.setGetAverage()+" ms");
                        System.out.println("Sredni czas: "+reflexModel.setGetAverage());
                        reflexWindow.infoLabel.setForeground(new java.awt.Color(204, 204, 204));
                        reflexWindow.panelSimple.setBackground(Color.black);
                        reflexWindow.testLeft.setVisible(false);
                    }
                }
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
           
        }
    };
    public Controller()
    {
        reflexWindow.requestFocus();
        reflexWindow.panelSimple.addKeyListener(reflexKeyListener);
        reflexWindow.panelSimple.requestFocus();
        reflexWindow.retryButton.addActionListener(this);
        reflexWindow.backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if((JButton)e.getSource() ==  (JButton)reflexWindow.retryButton)
        {          
            reflexModel.step = 0;
            reflexWindow.backButton.setVisible(false);
            reflexWindow.infoLabel.setVisible(true);
            reflexWindow.retryButton.setVisible(false);  
            reflexWindow.infoLabel.setText("PRESS SPACEBAR TO START");
            reflexWindow.testLeft.setForeground(new java.awt.Color(204, 204, 204));
            reflexWindow.infoLabel.setBounds(0, 275, 1370, 100);
        }
        else if((JButton)e.getSource() ==  (JButton)reflexWindow.backButton)
        {          
            reflexModel.step = 0;
            reflexWindow.backButton.setVisible(false);
            reflexWindow.infoLabel.setVisible(true);
            reflexWindow.retryButton.setVisible(false);  
            reflexWindow.infoLabel.setText("PRESS SPACEBAR TO START");
            reflexWindow.testLeft.setForeground(new java.awt.Color(204, 204, 204));
            reflexWindow.infoLabel.setBounds(0, 275, 1370, 100);
            reflexWindow.showModesMenu();
        }
    }
}
