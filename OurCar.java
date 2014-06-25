import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import greenfoot.Greenfoot;
public class OurCar extends Actor implements Subject
{
   
    int state;
    boolean flag = true;
    static int life=2;
    int a=0;
    boolean status=true;
    Clock clock = new Clock();
    LifeTracker lifeT=new LifeTracker();
    public ArrayList<Observer> obs;
    public String subjectState;
private Arrow arrowlist = new Arrow();
List<Memento> savedStates = new ArrayList<Memento>();
 
Originator originator = new Originator();
        clstatemanager p = new clstatemanager();
        //originator.set("State2");
    public OurCar()
    {
        
        obs=new ArrayList<Observer>();
        Help help = new Help(this);
        Scorecard scorecard = new Scorecard(this);
originator.set("0");
savedStates.add(originator.saveToMemento());
 String tempstate = originator.restoreFromMemento(savedStates.get(savedStates.size()-1));
 state = Integer.parseInt(tempstate);
 
    }

    public void act() 
    {
        getWorld().addObject(clock, 680,33);
        getWorld().addObject(lifeT,680,12);
        
        Arrowitem up= new Arrowitem();
        Arrowitem down= new Arrowitem();
        Arrowitem left= new Arrowitem();
        Arrowitem right= new Arrowitem();
        Command do_up= new ConcreteCommand();
        Command do_down= new ConcreteCommand();
        Command do_left= new ConcreteCommand();
        Command do_right= new ConcreteCommand();
        do_up.setReceiver(new receiver(){ public void doAction()
                                                        {move(5);}});
        do_down.setReceiver(new receiver(){ public void doAction()
                                                        {move(-5);}});
        do_right.setReceiver(new receiver(){ public void doAction()
                                                        {turn(5);}});
        do_left.setReceiver(new receiver(){ public void doAction()
                                                        {turn(-5);}});
       up.setCommand(do_up);
       down.setCommand(do_down);
       left.setCommand(do_left);
      
      right.setCommand(do_right);
      
      arrowlist.addItem(up,"1");
      arrowlist.addItem(down,"2");
      arrowlist.addItem(left,"3");
      arrowlist.addItem(right,"4");
      checkKeyPress();
    }    

    void checkKeyPress()
    {
        if(status)
        {
            clock.startClock();
            lifeT.showMessage(life);
            status=false;
        }
        if(Greenfoot.isKeyDown("up"))
        {
            arrowlist.selectMenuItem("1");
            checkCollision();
            if(Greenfoot.isKeyDown("up"))
            {
                arrowlist.selectMenuItem("1");
                checkCollision();
                //setRotation(90);
            }
            if(Greenfoot.isKeyDown("right"))
            {
                arrowlist.selectMenuItem("4");
                checkCollision();
            }
            if(Greenfoot.isKeyDown("left"))
            {
                arrowlist.selectMenuItem("3");
                checkCollision();
            }
            if(Greenfoot.isKeyDown("down"))
            {
                arrowlist.selectMenuItem("2");
                checkCollision();
            }
        }
        if(Greenfoot.isKeyDown("down"))
        { 
            if(Greenfoot.isKeyDown("up"))
            {
                arrowlist.selectMenuItem("1");
                checkCollision();
            }
            if(Greenfoot.isKeyDown("right"))
            {
                arrowlist.selectMenuItem("4");
                checkCollision();
            }
            if(Greenfoot.isKeyDown("left"))
            {
                arrowlist.selectMenuItem("3");
                checkCollision();
            }
            if(Greenfoot.isKeyDown("down"))
            {
                arrowlist.selectMenuItem("2");
                checkCollision();
            }
        }
    }

    void checkCollision()
    {
        if(isTouching(CarVertical.class)|| isTouching(CarHorizontal.class)||isTouching(Tree.class))
        {
            Greenfoot.playSound("305787_SOUNDDOGS__cr.mp3");
            if(life>0)
            {
                life--;
                Greenfoot.stop();
                switch(state)
                    {
                        case 0:
                    //if(originator.restoreFromMemento(savedStates.get(savedStates.size()-1)).equals("State0"))
                    {
                        if(ParkingLotLevel1.class.isInstance(getWorld()))
                        {   this.setLocation(55,25);
                            this.setRotation(360);
                            lifeT.showMessage(life); 
                            Greenfoot.start();
                            break;
                        }
                        else
                        {
                            this.setLocation(50,650);
                            this.setRotation(360);
                            lifeT.showMessage(life); 
                            Greenfoot.start();
                            break;
                        }
                    }
                    case 1:
                    {
                        if(ParkingLotLevel1.class.isInstance(getWorld()))
                        {   
                            this.setLocation(745, 615);
                            this.setRotation(270);
                            lifeT.showMessage(life); 
                            Greenfoot.start();
                           break; 
                        }
                        else
                        {
                            this.setLocation(750, 130);
                            this.setRotation(90);
                            lifeT.showMessage(life); 
                            Greenfoot.start();
                           break;
                        }
                    }   
             
                }
                

            }
        
            else
            {
                if(life==0)
                {
                    clock.stopClock();
                    this.setState("Out of Lives");
                    status=true;
                    Greenfoot.stop();
                }
            }

        }
        if(isTouching(CheckPoint.class))
        {

            if(flag &&  originator.restoreFromMemento(savedStates.get(savedStates.size()-1)).equals("0"))
            {
                originator.set("1");
                
                savedStates.add(originator.saveToMemento());
                flag=false;
                a=1;
                Component obj=new CarUpgrade(new ConcreteComponent());
                
                int decorator=obj.operation();
                String tempstate = originator.restoreFromMemento(savedStates.get(savedStates.size()-1));
                state = Integer.parseInt(tempstate);
                
                if(decorator==0)
                {
                    setImage("car02-n.png");
                }
                LifeIncrement ob=new LifeDecor(new LifeComponent());
                int lifedc=ob.lifeincrement();
                lifeT.showMessage(lifedc);
                life=lifedc;
            }
            /*else
            {
                if(!flag&&state==1&&a!=1)
                {
                    state++;
                    flag=true;
                }

            }*/
        }
        if(isTouching(FinishLineV.class))
        {
            clock.stopClock();
            this.setState("Level1 Finished");
        }
        if(isTouching(FinishLineH.class))
        {
            clock.stopClock();
            this.setState("Level2 Finished");
            Greenfoot.stop();
        }
    }

    public void attach(Observer newObserver)
    {
        obs.add(newObserver);
    }

    public void detach(Observer removeObserver)
    {
        obs.remove(removeObserver);
    }

    public void notifyObserver()
    {
        for(Observer observer:obs)
        {
            observer.update();
        }
    }

    public void setState(String success)
    {
        this.subjectState=success;
        String currentState=success;
        notifyObserver();
    }

    public String getState()
    {
        return subjectState;
    }

    public int getLife()
    {
        return life;
    }
}