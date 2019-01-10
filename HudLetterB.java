import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterB extends Mover
{
    public static int letterB;
    public void act() 
    {
        FillLetterB();
    }    
    public void FillLetterB() 
    {
       if(getWorld().getObjects(LetterB.class).size()==0){
            setImage("letterB1.png");
    
       }
 
    }    
}
