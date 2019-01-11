import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudNumber2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudNumber2 extends HudNumber
{
    public static int score2;
    public HudNumber2(){
    setImage("hud_0.png");
    
    
    }
    public void act() 
    {
        
        counter2();
    }    
    public void counter2(){
        if(score>=10){
            score2=score2+10;
            
        }
        if (score2>9){
            setImage("hud_1.png");
        }

        if (score2==0){
            setImage("hud_0.png");
        }
        
}
}


