import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterM extends Mover
{
   public static int letterM;
    public void act() 
    {
        FillLetterM();
    }    
    public void FillLetterM() 
    {
       if(getWorld().getObjects(LetterM.class).size()==0){
            setImage("letterM1.png");
    
       }
 
    }    
}
