/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends clstate 
{
// instance variables - replace the example below with your own
  
  
  public level2 (clstatemanager cl)
  {super(cl);
    }
  public String changestate()
    {
        String b = clm.setstate("level1");
    return b;
    }
}
