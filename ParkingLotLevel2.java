import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ParkingLotLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParkingLotLevel2 extends World
{

    /**
     * Constructor for objects of class ParkingLotLevel2.
     * 
     */
    public ParkingLotLevel2()
    {    
        // Create a new world with 800x700 cells with a cell size of 1x1 pixels.
        super(800, 700, 1);
        
        //ROAD
        addObject(new Road(), 0, 0);
        addObject(new Road(), 100, 0);
        addObject(new Road(), 150, 150);
        addObject(new Road(), 800, 150);
        addObject(new Road(), 150, 700);
        addObject(new Road(), 300, 300); 
        addObject(new Road(), 400, 400);
        addObject(new Road(), 500, 500);
        addObject(new Road(), 600, 600);
        addObject(new Road(), 700, 700);
        
        //TREES
        addObject(new Tree(), 25,525);
        addObject(new Tree(), 75,525);
        addObject(new Tree(), 125,525);
        //
        addObject(new Tree(), 260, 700);
        addObject(new Tree(), 260, 650);
        addObject(new Tree(), 260, 600);
        addObject(new Tree(), 260, 550);
        addObject(new Tree(), 260, 500);
        addObject(new Tree(), 260, 450);
        addObject(new Tree(), 260, 400);
        //
        addObject(new Tree(), 240, 380);
        addObject(new Tree(), 190, 380);
        addObject(new Tree(), 140, 380);
        //
        addObject(new Tree(), 140, 330);
        addObject(new Tree(), 140, 280);
        addObject(new Tree(), 140, 230);
        addObject(new Tree(), 140, 180);
        //
        addObject(new Tree(), 280, 25);
        addObject(new Tree(), 280, 75);
        addObject(new Tree(), 280, 125);
        addObject(new Tree(), 280, 175);
        //
        addObject(new Tree(), 280, 380);
        addObject(new Tree(), 330, 380);
        addObject(new Tree(), 380, 380);
        addObject(new Tree(), 430, 380);
        //
        addObject(new Tree(), 430, 330);
        addObject(new Tree(), 430, 280);
        addObject(new Tree(), 430, 230);
        addObject(new Tree(), 430, 180);
        //
        addObject(new Tree(), 450, 160);
        addObject(new Tree(), 500, 160);
        addObject(new Tree(), 550, 160);
        addObject(new Tree(), 600, 160);
        addObject(new Tree(), 650, 160);
        //
        addObject(new Tree(), 775, 380);
        addObject(new Tree(), 725, 380);
        addObject(new Tree(), 675, 380);
        addObject(new Tree(), 625, 380);
        //
        addObject(new Tree(), 430, 525);
        addObject(new Tree(), 480, 525);
        addObject(new Tree(), 530, 525);
        //
        addObject(new Tree(), 560, 500);
        addObject(new Tree(), 590, 460);
        addObject(new Tree(), 620, 430);
        //
        addObject(new Tree(), 640, 685);
        addObject(new Tree(), 640, 650);
        addObject(new Tree(), 640, 610);
        
        //FINISHLINE
        addObject(new FinishLineH(), 770, 680);
        //addObject(new Tree(), 125,525);
        
        //CHECKPOINT
        addObject(new CheckPoint(), 750, 160);
        
        //RANDOM CARS
        addObject(new CarVertical(), 460, 220);
        addObject(new CarVertical(), 20, 220);
              //OUR CAR        addObject(new car(), 20, 50);
        addObject(new CarHorizontal(), 200, 20);
        addObject(new CarHorizontal(), 500,20);
        addObject(new OurCar(), 100, 650);
        //SETTING NEW LEVEL
        //Greenfoot.setWorld(new parkinglot2());
        
        
    }
}
