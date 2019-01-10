import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterI extends Mover
{
    public static int letterI;
    public void act() 
    {
        FillLetterI();
    }    
    public void FillLetterI() 
    {
       if(getWorld().getObjects(LetterI.class).size()==0){
            setImage("letterI1.png");
    
       }
 
    }    
}
