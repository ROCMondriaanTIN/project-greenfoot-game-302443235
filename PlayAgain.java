import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayAgain extends Mover
{
public PlayAgain(){


setImage("playAgain.png");}

    

    public void act() 
    {
        // Add your action code here.

       
        if(Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("space")){

            Greenfoot.setWorld(new BeginScherm());
            
        }    
         if(Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("space")){

            Greenfoot.setWorld(new BeginScherm());
            
        }    

    }}
