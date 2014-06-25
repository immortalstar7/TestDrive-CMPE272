import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class parkinglot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ParkingLotLevel1 extends World
{

    /**
     * Constructor for objects of class parkinglot.
     * 
     */
    public ParkingLotLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1); 
        
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
        
        addObject(new CarVertical(),185, 275);
        addObject(new CarVertical(), 690, 500);
        
        addObject(new CarHorizontal(), 275, 20);
        addObject(new CarHorizontal(), 370, 20);
        addObject(new CarHorizontal(), 465, 20);
        addObject(new CarHorizontal(), 560, 20);
        
        addObject(new CarHorizontal(), 275, 80);
        addObject(new CarHorizontal(), 550, 150);
        addObject(new CarHorizontal(), 50, 180);
        addObject(new CarHorizontal(), 50, 100);
        addObject(new CarHorizontal(), 50, 140);
        addObject(new CarHorizontal(), 150, 550);
        addObject(new CarHorizontal(), 150, 500);

              
        addObject(new Tree(), 220,50);
        addObject(new Tree(), 220,100);
        addObject(new Tree(), 220, 150);
        addObject(new Tree(), 220, 200);
        addObject(new Tree(), 220, 250);
        addObject(new Tree(), 220, 300);
        addObject(new Tree(), 220, 350);
        //
        addObject(new Tree(), 150, 350);
        addObject(new Tree(), 150, 350);
        addObject(new Tree(), 150, 400);
        addObject(new Tree(), 150, 450);
        //
        addObject(new Tree(), 150, 600);
        addObject(new Tree(), 200, 600);
        addObject(new Tree(), 250, 600);
        addObject(new Tree(), 300, 600);
        addObject(new Tree(), 350, 600);
        addObject(new Tree(), 400, 600);
        addObject(new Tree(), 450, 600);
        addObject(new Tree(), 500, 600);
        addObject(new Tree(), 550, 600);
        addObject(new Tree(), 600, 600);
        //
        addObject(new Tree(), 650, 600);
        addObject(new Tree(), 650, 550);
        addObject(new Tree(), 650, 500);
        addObject(new Tree(), 650, 450);
        addObject(new Tree(), 650, 400);
        //
        addObject(new Tree(), 775, 200);
        addObject(new Tree(), 725, 200);
        addObject(new Tree(), 675, 200);
        addObject(new Tree(), 625, 200);
        addObject(new Tree(), 575, 200);
        addObject(new Tree(), 525, 200);
        addObject(new Tree(), 485, 200);
        //
        addObject(new Tree(), 450, 200);
        addObject(new Tree(), 450, 250);
        addObject(new Tree(), 450, 300);
        addObject(new Tree(), 450, 350);
        addObject(new Tree(), 450, 400);
        //
        addObject(new Tree(), 475, 450);
        addObject(new Tree(), 425, 450);
        addObject(new Tree(), 375, 450);
        
        //CHECKPOINTS
        addObject(new CheckPoint(), 745, 615);
               
        //FINISHLINE
        addObject(new FinishLineV(), 775, 55);
        
        addObject(new OurCar(), 55 , 25);
        
        //SETTING NEW LEVEL
        //Greenfoot.setWorld(new parkinglot2());
    }

}