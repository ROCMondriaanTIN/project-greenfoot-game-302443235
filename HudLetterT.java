import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterT extends Mover
{
   public static int letterT;
    public void act() 
    {
        FillLetterT();
    }    
    public void FillLetterT() 
    {
       if(getWorld().getObjects(LetterT.class).size()==0){
            setImage("letterT1.png");
    
       }

    }
}
