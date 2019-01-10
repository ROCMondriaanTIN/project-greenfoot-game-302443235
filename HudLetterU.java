import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterU extends Mover
{
    public static int letterU;
    public void act() 
    {
        FillLetterU();
    }    
    public void FillLetterU() 
    {
       if(getWorld().getObjects(LetterU.class).size()==0){
            setImage("letterU1.png");
    
       }
 
    }    
}
