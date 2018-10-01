import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,247,47);
        Worm worm2 = new Worm();
        addObject(worm2,78,172);
        Worm worm3 = new Worm();
        addObject(worm3,76,399);
        Worm worm4 = new Worm();
        addObject(worm4,294,431);
        Worm worm5 = new Worm();
        addObject(worm5,439,324);
        Worm worm6 = new Worm();
        addObject(worm6,451,172);
        Worm worm7 = new Worm();
        addObject(worm7,297,214);
        Worm worm8 = new Worm();
        addObject(worm8,430,43);
        Crab crab = new Crab();
        addObject(crab,102,70);
        Lobster lobster = new Lobster();
        addObject(lobster,342,310);
        Tiempo 
    }
}
