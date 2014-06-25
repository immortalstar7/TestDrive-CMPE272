import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
public class Help extends Actor implements Observer
{
    GreenfootImage image = new GreenfootImage(100,200); 
    OurCar subject;

    public Help()
    {
    }

    public Help(OurCar Carsubject)
    {
        this.subject=Carsubject;
        subject.attach(this);
    }

    public void update()
    {
        if(subject.getState().equalsIgnoreCase("Out of Lives"))
        {
            JOptionPane.showMessageDialog(new JInternalFrame(), "For Help! Call 911... ","Help Information", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if(subject.getState().equalsIgnoreCase("Level1 Finished"))
            {
                //do nothing
            }
            else
            {
                if(subject.getState().equalsIgnoreCase("Level2 Finished"))
                {
                    //do nothing
                } 
            }
        }
    }  
}
