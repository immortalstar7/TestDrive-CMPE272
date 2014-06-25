import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
   private HashMap<String,Arrowitem> arrowitem = new HashMap<String,Arrowitem>();
   public void addItem(Arrowitem item,String key)
   {arrowitem.put(key,item);
   }
    public void selectMenuItem(String key)
{
    Arrowitem item = arrowitem.get(key);
    if(item != null)
    {
    item.invoke();
    }
   
    
}

}
