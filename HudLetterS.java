import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterS extends Mover
{
    public static int letterS;
    public void act() 
    {
        FillLetterS();
    }    
    public void FillLetterS() 
    {
       if(getWorld().getObjects(LetterS.class).size()==0){
            setImage("letterS1.png");
    
       }
    }
}
