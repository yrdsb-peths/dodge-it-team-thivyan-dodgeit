import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
        
        Heart heart = new Heart();
        addObject(heart, 350, 360);
        
        Heart heart2 = new Heart();
        addObject(heart2, 450, 360);
        
        Heart heart3 = new Heart();
        addObject(heart3, 550, 360);
        
        int lives = 3;
    }
}
