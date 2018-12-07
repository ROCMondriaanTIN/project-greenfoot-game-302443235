import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EindScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EindScherm extends World
{

    /**
     * Constructor for objects of class EindScherm.
     * 
     */
    public EindScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1120, 600, 1, false);
        this.setBackground("gameOver.png");
       
          PlayAgain playagain = new PlayAgain();
          addObject(playagain,550,429);
    
}
}
