package reflextest;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
//import java.awt.event.ActionListener;


public class Controller
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
                        reflexWindow.testLeft.setVisible(true);
                        changeTime = reflexModel.getRandomTime(); 
                        reflexWindow.infoLabel.setText("WAIT FOR WHITE SCREEN, THEN PRESS SPACEBAR");
                        
                        tempStr = "";
                        for(int i=3; i>reflexModel.step; i--)
                        {
                            tempStr = tempStr+"*";
                        }
                        System.out.println("tempStr "+tempStr);
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
                        
                        testTimer.schedule(testTask, changeTime*10);
                    }
                    else if(reflexModel.step < 3)
                    {
                        reflexModel.setStopTime();
                        reflexModel.toSoon=true;
                        reflexWindow.testLeft.setForeground(new java.awt.Color(204, 204, 204));
                        reflexWindow.infoLabel.setText("WAIT FOR WHITE SCREEN, THEN PRESS SPACEBAR");
                        reflexWindow.panelSimple.setBackground(Color.black);
                        reflexWindow.infoLabel.setForeground(new java.awt.Color(204, 204, 204));
                        
                                                
                        tempStr = "";
                        for(int i=3; i>reflexModel.step; i--)
                        {
                            tempStr = tempStr+"*";
                        }
                        System.out.println("tempStr "+tempStr);
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
                         
                        testTimer.schedule(testTask, changeTime*10);
                    }
                    else if( reflexModel.step == 3)
                    {                 
                        reflexModel.setStopTime();
                        reflexModel.step++;
                        reflexWindow.infoLabel.setText("AVERAGE TIME: "+reflexModel.setGetAverage());
                        System.out.println("Sredni czas: "+reflexModel.setGetAverage());
                        reflexWindow.infoLabel.setForeground(new java.awt.Color(204, 204, 204));
                        reflexWindow.panelSimple.setBackground(Color.black);
                        reflexWindow.testLeft.setVisible(false);
                    }
                    else if(reflexModel.step == 4 )
                    {
                        reflexWindow.testLeft.setForeground(new java.awt.Color(204, 204, 204));
                        reflexWindow.showModesMenu();
                        reflexModel.step = 0;
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
        reflexWindow.buttonSimple.addActionListener((ActionEvent e) -> 
        {
        });
    }
}
