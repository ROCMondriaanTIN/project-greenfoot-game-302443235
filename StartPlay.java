import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartPlay extends Mover
{
     
                  boolean firstTrun = true;
    /**
     * Act - do whatever the StartPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    
setImage("start.png");
            
               
        if(Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("space")){
       
            Greenfoot.setWorld(new MyWorld());
        

        }}
}
