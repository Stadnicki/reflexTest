package reflextest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Model 
{
    int step = 0;
    long startTime, stopTime, reflexTime, averageTime=0;
    boolean toSoon = false;
    List<Long> resList = new ArrayList<>();
    
    int getRandomTime()
    {
        Random generator = new Random(); 
        int change = generator.nextInt(300) + 150;
        return change;
    }
    
    void setStartTime()
    {
        startTime = System.nanoTime();
        step++;
        System.out.println("step: "+step);
        //startTime = System.currentTimeMillis();
        startTime = System.nanoTime();
    }
    void setStopTime()
    {
        stopTime = System.nanoTime();
        System.out.println("startTIme: "+startTime);
        System.out.println("stopTime: "+stopTime);
        reflexTime = stopTime-startTime;
        reflexTime = reflexTime/1000000; 
        System.out.println("reflexTime: "+reflexTime);
        System.out.println(reflexTime);
        resList.add(reflexTime);
    }
    long setGetAverage()
    {
        int i;
        averageTime = 0;
        for(i = 0; i < resList.size(); i++)
            averageTime += resList.get(i);
    
        return (averageTime / resList.size());
    }
}
