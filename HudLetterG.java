import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterG extends Mover
{
   public static int letterG;
    public void act() 
    {
        FillLetterG();
    }    
    public void FillLetterG() 
    {
       if(getWorld().getObjects(LetterG.class).size()==0){
            setImage("letterG1.png");
    
       }
 
    }    
}
