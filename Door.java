import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Tile
{
    int level = 1;
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Door(String images, int width, int heigth){
        super(images, width, heigth);
    }
    
    public Door(String param1, int param2, int param3, int level){
        super(param1, param2, param3);
        this.level = level;
    }
    
    public void act() 
    {
        for (Actor hero : getIntersectingObjects(Hero.class)){
            if(hero != null){
                if (level == 54){
                    Level2 l2 = new Level2();
                    Greenfoot.setWorld(l2);
                    break;
                }
                if (level == 83 ) {
                    Level3 l3 = new Level3();
                    Greenfoot.setWorld(l3);
                    break;
                }
                if (level == 117) {
                    Level4 l4 = new Level4();
                    Greenfoot.setWorld(l4);
                    break;
                }
                if (level == 35) {
                    Level5 l5 = new Level5();
                    Greenfoot.setWorld(l5);
                    break;
                }
            }
        }
     
    }    
}
