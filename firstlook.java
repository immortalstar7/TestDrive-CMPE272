import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class firstlook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class firstlook extends World
{

    /**
     * Constructor for objects of class firstlook.
     * 
     */
    public firstlook()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 497, 1);
        getBackground().drawImage(new GreenfootImage("frontpage.jpg"), 0, 0);
        
        Greenfoot.setWorld(this);
        addObject(new start(),100,100);
        addObject(new Credits(), 620, 450);
        addObject(new Instruction(), 730, 450);
    }
}
