import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

public class LifeTracker extends Actor implements LifeIncrement
{
    protected LifeIncrement lifeInc;
    
    public LifeTracker()
    {}
    
    public LifeTracker(LifeIncrement c)
    {
        lifeInc=c;
    }
    
    public void showMessage(int life)
    {
        setImage(new GreenfootImage("Life Remaining: "+life,20,Color.WHITE,new Color(0,0,0)));
    }
    
    public int lifeincrement()
    {
        return lifeInc.lifeincrement();
    }
    
    
}