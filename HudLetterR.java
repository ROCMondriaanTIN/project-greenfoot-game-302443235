import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterR extends Mover
{
   public static int letterR;
    public void act() 
    {
        FillLetterR();
    }    
    public void FillLetterR() 
    {
       if(getWorld().getObjects(LetterR.class).size()==0){
            setImage("letterR1.png");
    
       }
 
    }    
}
