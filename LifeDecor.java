import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
public class LifeDecor extends LifeTracker
{
    OurCar oc=new OurCar();
    
    public LifeDecor(LifeIncrement c)
    {
        super(c);
    }

     public int lifeincrement()
    {
        super.lifeincrement();
        return addedBehavior();
    }
    
    private int addedBehavior()
    {
        int lifed=oc.getLife();
        super.showMessage(lifed++);
        return lifed++;
    }
}

