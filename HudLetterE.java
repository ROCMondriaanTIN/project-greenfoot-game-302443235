import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterE extends Mover
{
   public static int letterE;
    public void act() 
    {
        FillLetterE();
    }    
    public void FillLetterE() 
    {
       if(getWorld().getObjects(LetterE.class).size()==0){
            setImage("letterE1.png");
    
       }

    }
}
