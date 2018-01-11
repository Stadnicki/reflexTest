package reflextest;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;


public class Controller
{
    View reflexWindow = new View();     
    Model reflexModel = new Model();
    KeyListener reflexKeyListener = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) 
        {
            System.out.println("1");
            if("panelSimple".equals(reflexWindow.currPanelName))
            {
                if(reflexModel.step == 0)
                {
                    reflexWindow.infoLabel.setText("WAIT FOR WHITE SCREEN, THEN PRESS SPACE");
                    int changeTime = reflexModel.setStartTime();
                    new java.util.Timer().schedule
                    ( 
                        new java.util.TimerTask() 
                        {
                            @Override
                            public void run() {
                                System.out.println("timer: "+changeTime+" s");
                                reflexWindow.panelSimple.setBackground(Color.white);
                                reflexWindow.infoLabel.setForeground(new java.awt.Color(51, 51, 51));
                        }
                        }, 
                        changeTime*1000
                );
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
