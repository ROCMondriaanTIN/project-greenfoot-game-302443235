import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterL extends Mover
{
    public static int letterL;
    public void act() 
    {
        FillLetterL();
    }    
    public void FillLetterL() 
    {
       if(getWorld().getObjects(LetterL.class).size()==0){
            setImage("letterL1.png");
    
       }

       if(HudLetterL.letterL==1){
            setImage("letterL.png");
       }
    }    
}

