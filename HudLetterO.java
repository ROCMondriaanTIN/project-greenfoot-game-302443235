import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterO extends Mover
{
    public static int letterO;
    public void act() 
    {
        FillLetterO();
    }    
    public void FillLetterO() 
    {
       if(getWorld().getObjects(LetterO.class).size()==0){
            setImage("letterO1.png");
    
       }

    }    
}
