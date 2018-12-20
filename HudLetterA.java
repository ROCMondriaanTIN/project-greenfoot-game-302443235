import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterA extends Mover
{
    public static int letterA;
    public void act() 
    {
        FillLetterA();
    }    
    public void FillLetterA() 
    {
       if(getWorld().getObjects(LetterA.class).size()==0){
            setImage("letterA1.png");
    
       }
 
    }    
}
