import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudKey extends Mover
{
public static int key;
    public void act() 
    {
        FillKey();
    }    
    
    public void FillKey(){
        if(getWorld().getObjects(Key.class).size()==0){
            setImage("keyBlue1.png");
    
        }

        if(HudKey.key==1){
            setImage("keyBlue.png");
            }
}
}
