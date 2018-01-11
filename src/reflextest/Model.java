package reflextest;

import java.util.Random;


public class Model 
{
    int step = 0;
    int startTime, stopTime, reflexTime; 
    
    int setStartTime()
    {
        Random generator = new Random(); 
        int change = generator.nextInt(5) + 2;
        startTime = (int) System.currentTimeMillis();
        return change;
    }
    void setStopTime()
    {
        startTime = (int) System.currentTimeMillis();
    }
    int getResultTime()
    {
        reflexTime = startTime - startTime;
        return reflexTime;
    }
}
