import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterC extends Mover
{
   public static int letterC;
    public void act() 
    {
        FillLetterC();
    }    
    public void FillLetterC() 
    {
       if(getWorld().getObjects(LetterC.class).size()==0){
            setImage("letterC1.png");
    
       }
     
    }
}
