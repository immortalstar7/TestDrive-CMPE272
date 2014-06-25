import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrowitem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrowitem extends Actor implements Invoker 
{
   private Command theCommand;
   public void setCommand(Command cmd)
   {
   theCommand = cmd;
       
    }
      public void invoke()
    {
        theCommand.execute();
    }}
