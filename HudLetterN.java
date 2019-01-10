import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterN extends Mover
{
    public static int letterN;
    public void act() 
    {
        FillLetterN();
    }    
    public void FillLetterN() 
    {
       if(getWorld().getObjects(LetterN.class).size()==0){
            setImage("letterN1.png");
    
       }
 
    }    
}
