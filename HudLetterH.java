import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudLetterH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudLetterH extends Mover
{
    public static int letterH;
    public void act() 
    {
        FillLetterH();
    }    
    public void FillLetterH() 
    {
       if(getWorld().getObjects(LetterH.class).size()==0){
            setImage("letterH1.png");
    
       }

       if(HudLetterH.letterH==1){
            setImage("letterH.png");
       }
    }    
}
