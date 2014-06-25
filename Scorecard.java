import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
/**
 * Write a description of class Scorecard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorecard extends Actor implements Observer
{
    GreenfootImage image = new GreenfootImage(600,600); 
    Clock clock = new Clock();
    OurCar subject;
    public Scorecard()
    {}

    public Scorecard(OurCar Carsubject)
    {
        this.subject=Carsubject;
        subject.attach(this);
    }

    public void update()
    {
        String scoretime=clock.getTime();
        
clstatemanager p= new clstatemanager();
        if(subject.getState().equals("Out of Lives"))
        {
            JOptionPane.showMessageDialog(new JInternalFrame(), "Sorry! Game Over :( \n Please Try Again","Game Over", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if(subject.getState().equalsIgnoreCase("Level1 Finished") && p.change_state().equalsIgnoreCase("Level2"))
            {
                JOptionPane.showMessageDialog(new JInternalFrame(), "Congratulations! :) \n Time Taken for Level 1 : "+ scoretime +"\n Click on OK to go to next level","Level Unlocked", JOptionPane.INFORMATION_MESSAGE);
                Greenfoot.setWorld(new ParkingLotLevel2());
            }
            else
            {
                if(subject.getState().equalsIgnoreCase("Level2 Finished"))
                {
                    JOptionPane.showMessageDialog(new JInternalFrame(), "Congratulations! :) \n You have completed the game","Victory", JOptionPane.INFORMATION_MESSAGE);
                } 
            }
        }
    }

}