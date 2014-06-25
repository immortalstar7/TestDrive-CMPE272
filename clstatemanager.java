/**
 * Write a description of class clstatemanager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clstatemanager  
{
    // instance variables - replace the example below with your own
     carlevelstate level1state;
    carlevelstate level2state;
    carlevelstate currentstate;
    public clstatemanager()
    {
        level1state = new level1(this);
        level2state = new level2(this);
        currentstate = level1state;
    }
    public String change_state()
    {String v=currentstate.changestate();
        return v;
    }
    public String setstate(String stat)
    {
       currentstate = level2state;
       return stat;
    }
}
