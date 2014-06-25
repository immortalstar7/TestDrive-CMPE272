import greenfoot.*; 
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
public class ConcreteComponent implements Component
{
    public int operation()
    {
         int reply=JOptionPane.showConfirmDialog(new JInternalFrame(), "Congo! You earned 1 LIFE :) \n Do you want to upgrade the car?","Decorator", JOptionPane.YES_NO_OPTION);
         return reply;
    }
}
