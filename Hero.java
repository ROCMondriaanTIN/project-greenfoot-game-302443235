
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
            }
        }
        for (Actor LiquidWater : getIntersectingObjects(LiquidWater.class)){
            if (LiquidWater != null) {
                getWorld().removeObject(this);
                return;
            }
        }
        for (Actor CoinGold : getIntersectingObjects(CoinGold.class)){
            if (CoinGold != null) {
                getWorld().removeObject(CoinGold);
                return;
            }
        }
        for (Actor Star : getIntersectingObjects(Star.class)){
            if (Star != null) {
                getWorld().removeObject(Star);
                return;
            }
        }
        for (Actor Key : getIntersectingObjects(Key.class)){
            if (Key != null) {
                getWorld().removeObject(Key);
                return;
            }
        }
}
        
    public boolean opGrond()
    {
        Actor onder = getOneObjectAtOffset(0, getImage().getHeight()/2,Tile.class);
        return onder != null;
        
    }
    public void handleInput() {
        if (Greenfoot.isKeyDown("up")&& opGrond()==true) {
            velocityY = -20;
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 5;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
