package reflextest;
import java.awt.Dimension;
import java.awt.Point;
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
                    reflexModel.clearTimesArr();
                }
                else
                {
                    if(reflexModel.step == 0)
                    {
                        reflexModel.toSoon=true;
                        changeTime = reflexModel.getRandomTime(); 
                        System.out.println("Random time s: "+(float)changeTime/1000);
                        reflexWindow.waitScreen();
                        tempStr = reflexModel.setTestsLeft();
                        reflexWindow.testLeft.setText(tempStr);
                        
                        testTask = new TimerTask() {
                            @Override
                            public void run() {
                                    reflexModel.setStartTime(); 
                                    reflexModel.toSoon=false;
                                    reflexWindow.whiteScreen();
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
                        reflexWindow.waitScreen(); 
                        
                        tempStr = "";
                        for(int i=3; i>reflexModel.step; i--)
                            tempStr = tempStr+"*";
                        
                        reflexWindow.testLeft.setText(tempStr);
                        
                         testTask = new TimerTask() {
                            @Override
                            public void run() {
                                    reflexModel.toSoon=false;
                                    reflexModel.setStartTime(); 
                                    reflexWindow.whiteScreen();
                            }
                        };
                         
                        testTimer.schedule(testTask, changeTime);
                    }
                    else if( reflexModel.step == 3)
                    {        
                        reflexModel.setStopTime();
                        reflexWindow.afterSimpleMenu();
                        reflexWindow.infoLabel.setText("AVERAGE TIME: "+reflexModel.setGetAverage()+" ms");
                        reflexModel.step++;
                        reflexModel.clearTimesArr();
                    }
                }
            }
            if("panelAimPrepare".equals(reflexWindow.currPanelName))
            {
                System.out.println("panelAim");
                reflexWindow.currPanelName = "panelAimGame";
                if(reflexModel.step == 0)
                {
                        reflexWindow.prepareAimScreen();
                        changeTime = reflexModel.getRandomTime();
                        Point squareP = reflexModel.getPoint();
                        
                        
                        testTask = new TimerTask() {
                            @Override
                            public void run() {
                                    reflexModel.setStartTime(); 
                                    reflexWindow.showSquare(squareP);
                                    
                            }
                        };
                        testTimer.schedule(testTask, changeTime);
                    }
            }
        }

        @Override
        public void keyPressed(KeyEvent e) 
        { 
        }

        @Override
        public void keyReleased(KeyEvent e) 
        {
        }
    };
    public Controller()
    {
        reflexWindow.panelSimple.addKeyListener(reflexKeyListener);
        reflexWindow.panelAim.addKeyListener(reflexKeyListener);
        reflexWindow.retryButton.addActionListener(this);
        reflexWindow.backButton.addActionListener(this);
        reflexWindow.buttonRetryAim.addActionListener(this);
        reflexWindow.buttonBackAim.addActionListener(this);
        reflexWindow.square.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if((JButton)e.getSource() ==  (JButton)reflexWindow.retryButton)
        {          
            reflexModel.step = 0;
            reflexWindow.resetAfterGame();
        }
        else if((JButton)e.getSource() ==  (JButton)reflexWindow.backButton)
        {          
            reflexModel.step = 0;
            reflexWindow.resetAfterGame();
            reflexWindow.showModesMenu();
        }
        else if((JButton)e.getSource() ==  (JButton)reflexWindow.square)
        {  
            reflexWindow.square.setVisible(false);
            reflexModel.setStopTime(); 
            changeTime = reflexModel.getRandomTime();
            Point squareP = reflexModel.getPoint();
             
            testTask = new TimerTask() 
            {
                @Override
                public void run() 
                {
                    reflexModel.setStartTime(); 
                    reflexWindow.showSquare(squareP);         
                }
            };
            testTimer.schedule(testTask, changeTime);
            
            if(reflexModel.step == 5)
            {
                reflexWindow.infoLabelAim.setText("AVERAGE TIME: "+reflexModel.setGetAverage()+" ms");
                reflexWindow.aimResult();
                testTask.cancel();
            }

        }
        else if((JButton)e.getSource() ==  (JButton)reflexWindow.buttonRetryAim)
        {          
            reflexModel.step = 0;
            reflexWindow.playAimTest();
            reflexModel.clearTimesArr();
        }
        else if((JButton)e.getSource() ==  (JButton)reflexWindow.buttonBackAim)
        {          
            reflexModel.step = 0;
            reflexWindow.playAimTest();
            reflexModel.clearTimesArr();
            reflexWindow.showModesMenu();
        }
    }
}
