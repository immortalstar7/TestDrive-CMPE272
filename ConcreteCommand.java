/**
 * Write a description of class ConcreteCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteCommand  implements Command
{
    private receiver theReceiver;
    public void execute()
    {
    theReceiver.doAction();    }
    public void setReceiver(receiver target)
    {
    theReceiver = target; 
    }
}
