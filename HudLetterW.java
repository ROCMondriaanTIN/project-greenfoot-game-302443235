import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterW here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterW extends Mover
{
    public static int letterW;
    public void act() 
    {
        FillLetterW();
    }    
    public void FillLetterW() 
    {
       if(getWorld().getObjects(LetterW.class).size()==0){
            setImage("letterW1.png");
    
       }
    }    
}
