/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1  extends clstate
{
    // instance variables - replace the example below with your own
    public level1 (clstatemanager vmm)
    {
        super(vmm);
    }
    public String changestate()
    {
        String b = clm.setstate("level2");
    return b;
    }
}
