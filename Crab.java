import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private Counter vidas;
    
    public Crab()
    {
        /*getWorldOfType(CrabWorld.class).addObject(vidas, 440, 20);
        vidas.setValue(3);*/
        
    }
    
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.move(4);
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3); 
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("eating.wav");
        }
        /*if(isTouching(Lobster.class))
        {
            vidas.setValue(vidas.getValue()-1);
            setLocation(102,70);
            getWorldOfType(CrabWorld.class).accedeLangosta().setLocation(250, 500);
        }*/
    }    
}
