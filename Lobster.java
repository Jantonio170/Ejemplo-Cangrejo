import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    private int pasos;
    
    public Lobster()
    {
        pasos = 0;
    }
    
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        pasos ++;
        if(pasos == 5)
        {
            turn(Greenfoot.getRandomNumber(180)-90); 
                //se le resta 90 para que de un aleatorio entre -90 y 90
            pasos = 0;
        }
        
        if(isTouching(Crab.class))
        {
            CrabWorld myMundo = (CrabWorld)this.getWorld();
            myMundo.decrementaVidas();
            this.setLocation(342,310);
            //removeTouching(Crab.class);
        }

    }    
}
