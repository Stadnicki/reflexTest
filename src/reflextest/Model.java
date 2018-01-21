package reflextest;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Model 
{
    int step = 0;
    long startTime, stopTime, reflexTime, averageTime=0;
    boolean toSoon = false;
    List<Long> resList = new ArrayList<>();
    
    public void clearTimesArr()
    {
        resList.clear();
    }
    
    int getRandomTime()
    {
        Random generator = new Random(); 
        int change = generator.nextInt(4500) + 750;
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
    
    public Point getPoint()
    {
        Random genP = new Random();
        int x = genP.nextInt(1166)+50;
        int y = genP.nextInt(560)+10;
        Point squareP = new Point(x,y);
        return squareP;
    }    
    
    long setGetAverage()
    {
        int i;
        for(i = 0; i < resList.size(); i++)
            System.out.print( resList.get(i) + "+");
        
        System.out.print( "/" + resList.size() + " = "); 
        averageTime = 0;
        for(i = 0; i < resList.size(); i++)
            averageTime += resList.get(i);
        
        System.out.println( averageTime / resList.size()); 
    
        return (averageTime / resList.size());
    }
    
    public String setTestsLeft()
    {
        String tempStr;
        tempStr = "";
        for(int i=3; i>step; i--)
            tempStr = tempStr+"*";
        
        return tempStr;
    }
}
