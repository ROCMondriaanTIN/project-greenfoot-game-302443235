import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterZ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterZ extends Mover
{
   public static int letterZ;
    public void act() 
    {
        FillLetterZ();
    }    
    public void FillLetterZ() 
    {
       if(getWorld().getObjects(LetterZ.class).size()==0){
            setImage("letterZ1.png");
    
       }
 
    }    
}
