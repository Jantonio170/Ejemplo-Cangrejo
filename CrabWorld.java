import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    private Counter vidas;
    private Crab crab;
    private Lobster lobster;
    private GreenfootSound musica;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld(int numGusanos)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        
        crab = new Crab();
        this.addObject(crab,102,70);
        
        lobster = new Lobster();
        this.addObject(lobster,342,310);
        
        Tiempo tiempo = new Tiempo();
        this.addObject(tiempo, 60, 20);
        
        vidas = new Counter("Vidas: ");
        this.addObject(vidas, 440, 20);
        vidas.setValue(3);
        
        creaGusanos(numGusanos);
        
        musica = new GreenfootSound("ufo-t-balt.mp3");
        //prepare();
    }
    
    public void started()
    {
        //Greenfoot.playSound("ufo-t-balt.mp3");
        musica.playLoop();
    }
    
    public void stopped()
    {
        musica.pause();
    }
    
    //Generar una cantidad N de gusanos en posiciones aleatorias
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    /*private void prepare()
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
        
        
    }*/
    
    public void creaGusanos(int N)
    {
        
        for(int i=0; i<N; i++)
        {
            Worm worm;
            worm = new Worm();
            this.addObject(worm, Greenfoot.getRandomNumber(499), Greenfoot.getRandomNumber(499));
        }
    }
    
    public void decrementaVidas()
    {
        int valor = vidas.getValue()-1;
        vidas.setValue(valor);
        crab.setLocation(102, 70);
        if(valor == 0)
        {
            Greenfoot.stop();
        }
    }
    
    public Lobster accedeLangosta()
    {
        return lobster; 
    }
}
