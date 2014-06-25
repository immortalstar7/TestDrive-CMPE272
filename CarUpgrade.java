import greenfoot.*; 

import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
public class CarUpgrade extends Decorator 
{
 
    public CarUpgrade(Component c)
    {
        super(c);
    }
    
    public int operation()
    {
        int reply=super.operation();
        return addedBehavior(reply);
    }
    public int addedBehavior(int reply)
    {
        if(reply==0)
        {
            JOptionPane.showMessageDialog(new JInternalFrame(), "Car Upgraded!!","Benefit", JOptionPane.INFORMATION_MESSAGE);
            return 0;
        }
        else
        {
            JOptionPane.showMessageDialog(new JInternalFrame(), "Car Not Upgraded.","Thanks", JOptionPane.INFORMATION_MESSAGE);
            return 1;
        }
    }
}
