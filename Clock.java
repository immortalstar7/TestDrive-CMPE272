import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clock extends Actor
{
    GreenfootImage image=new GreenfootImage(50,50);  
    private long startingTime;  
    int time;
    private boolean counting = false;
    static String stoppingTime="";
        /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       
    public void act() 
    {  
        if (counting) {  
            displayTime(System.currentTimeMillis() - startingTime); 
        } 
       
    }  
      
    private void displayTime(long time) {  
        time /= 1000;  
        long minutes = time/60;  
        long seconds = time % 60;  
        String tim = "Time Elapsed "+minutes + ":" + seconds;  
       setImage(new GreenfootImage(tim, 30, Color.YELLOW, new Color(0, 0, 0, 0)));  
    }  
      
    public void startClock() {  
        counting = true;  
        startingTime = System.currentTimeMillis();  
    }  
      
    public void stopClock()
    {
        counting = false;
        long stopTime=System.currentTimeMillis();
        long StoppingTime = stopTime-startingTime;
        StoppingTime/=1000;
        long StoppingTimemin = StoppingTime/60;
        long StoppingTimesec = StoppingTime%60;
        String str="Total Time: ";
        stoppingTime=StoppingTimemin+":"+StoppingTimesec;
        setImage(new GreenfootImage(str+stoppingTime, 30, Color.GREEN, new Color(0, 0, 0, 0)));
    }
   
   public String getTime()
   {
       String getTime=stoppingTime;
       return getTime;
   }
}
