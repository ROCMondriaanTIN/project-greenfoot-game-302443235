
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    public boolean left=true;
    public boolean mirror=true;
    private  double gravity;
    private  double acc;
    private  double drag;
    public int frame;
    int spring = -19;
    int karakter = 0;
    int loop = 0;
    int duck = 0;
    int karakterKleur=1;
    public int keyYellow =0;
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }
    public void Enemy(){

        switch(frame){
            case 1:
            setImage("p1_walk01.png");
            break;
            case 2:
            setImage("p1_walk02.png");
            break;
            case 3:
            setImage("p1_walk03.png");
            break;
            case 4:
            setImage("p1_walk04.png");
            break;
            case 5 :
            setImage("p1_walk05.png");
            case 6 :
            setImage("p1_walk06.png");
            break;
            case 7:
            setImage("p1_walk07.png");
            break;
            case 8 :
            setImage("p1_walk08.png");
            case 9 :
            setImage("p1_walk09.png");
            break;
            case 10:
            setImage("p1_walk10.png");
            break;
            case 11:
            setImage("p1_walk11.png");

            frame=0;
            break;   
        }
        frame++;
        mirrorImage();}
            public void mirrorImage(){
        if (mirror && left){ 
            getImage().mirrorHorizontally();
        }
        else if (!mirror && left){
            getImage().mirrorHorizontally();
        }
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
                Greenfoot.setWorld(new EindScherm());
                 HudNumber.score=0;
                   HudNumber2.score2=0;
                return;
            }
        }
        for (Actor LiquidWater : getIntersectingObjects(LiquidWater.class)){
            if (LiquidWater != null) {
                   getWorld().removeObject(this);
                    HudNumber.score=0;
                    HudNumber2.score2=0;
                Greenfoot.setWorld(new EindScherm());
                return;
            }
        }
        for (Actor CoinGold : getIntersectingObjects(CoinGold.class)) {
            if (CoinGold != null) {
               getWorld().removeObject(CoinGold);
                HudNumber.score=HudNumber.score+1;
              

                return;
            }
        }
    
        for (Actor Star : getIntersectingObjects(Star.class)){
            if (Star != null) {
                getWorld().removeObject(Star);
                return;
            }
        }
        
                for (Actor Key : getIntersectingObjects(Key.class)) {
            if (Key != null) {
               getWorld().removeObject(Key);
                HudKey.key= HudKey.key+1;
              
           

                return;
            }
        }
       
        for (Actor Lava : getIntersectingObjects(Lava.class)){
            if (Lava != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new EindScherm());
                return;
            }
        }
        for (Actor Spikes : getIntersectingObjects(Spikes.class)){
            if (Spikes != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new EindScherm());
                return;
            }
        }
        for (Actor LetterS : getIntersectingObjects(LetterS.class)){
            if (LetterS != null) {
                getWorld().removeObject(LetterS);
                return;
            }
        }
        for (Actor LetterC : getIntersectingObjects(LetterC.class)){
            if (LetterC != null) {
                getWorld().removeObject(LetterC);
                return;
            }
        }
        for (Actor LetterH : getIntersectingObjects(LetterH.class)){
            if (LetterH != null) {
                getWorld().removeObject(LetterH);
                return;
            }
        }
        for (Actor LetterO : getIntersectingObjects(LetterO.class)){
            if (LetterO != null) {
                getWorld().removeObject(LetterO);
                return;
            }
        }
        for (Actor LetterL : getIntersectingObjects(LetterL.class)){
            if (LetterL != null) {
                getWorld().removeObject(LetterL);
                return;
            }
        }
        for (Actor LetterA : getIntersectingObjects(LetterA.class)){
            if (LetterA != null) {
                getWorld().removeObject(LetterA);
                return;
            }
        }
        for (Actor LetterT : getIntersectingObjects(LetterT.class)){
            if (LetterT != null) {
                getWorld().removeObject(LetterT);
                return;
            }
        }
        for (Actor LetterE : getIntersectingObjects(LetterE.class)){
            if (LetterE != null) {
                getWorld().removeObject(LetterE);
                return;
            }
        }
        for (Actor LetterW : getIntersectingObjects(LetterW.class)){
            if (LetterW != null) {
                getWorld().removeObject(LetterW);
                return;
            }
        }
        for (Actor LetterR : getIntersectingObjects(LetterR.class)){
            if (LetterR != null) {
                getWorld().removeObject(LetterR);
                return;
            }
        }
        for (Actor LetterI : getIntersectingObjects(LetterI.class)){
            if (LetterI != null) {
                getWorld().removeObject(LetterI);
                return;
            }
        }
        for (Actor LetterN : getIntersectingObjects(LetterN.class)){
            if (LetterN != null) {
                getWorld().removeObject(LetterN);
                return;
            }
        }
        for (Actor LetterB : getIntersectingObjects(LetterB.class)){
            if (LetterB != null) {
                getWorld().removeObject(LetterB);
                return;
            }
        }
        for (Actor LetterM : getIntersectingObjects(LetterM.class)){
            if (LetterM != null) {
                getWorld().removeObject(LetterM);
                return;
            }
        }
        for (Actor LetterU : getIntersectingObjects(LetterU.class)){
            if (LetterU != null) {
                getWorld().removeObject(LetterU);
                return;
            }
        }
        for (Actor LetterZ : getIntersectingObjects(LetterZ.class)){
            if (LetterZ != null) {
                getWorld().removeObject(LetterZ);
                return;
            }
        }
        for (Actor LetterG : getIntersectingObjects(LetterG.class)){
            if (LetterG != null) {
                getWorld().removeObject(LetterG);
                return;
            }
        }
        
     
        
        
        
        for (Actor DoorClosed : getIntersectingObjects(Door.class)) {
            if (DoorClosed != null&&getWorld().getObjects(Key.class).size()==0) {
                Greenfoot.setWorld(new Level3());
             
            
                return;
            }
        }
        
       
        
    }
    public String positie(){
        String k = "X" + getX() + " " + "Y" + getY();
        return k;
    }
    public boolean opGrond()
    {
        Actor onder = getOneObjectAtOffset(0, getImage().getHeight()/2,Tile.class);
        return onder != null;
        
    }
     boolean onGround(){Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Tile.class);
        return under != null;}
    public void handleInput() {
        
        if ((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("space"))&&onGround() == true) {
            setImage("p1_jump.png");
            Greenfoot.playSound("jump.mp3");

            velocityY = spring;
            karakter= 1;   
        }
        if(onGround() == true){
            karakter-=1;
            setImage("p1.png");
        }
        if ((Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s"))) {
            setImage("p1_duck.png");
            velocityX = 2;
            duck =1;
        }
        if((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("space")) && duck == 1){
            setImage("p1.png");
            duck-=1;
        }
           if ((Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))) {

            velocityX = -6;  
            left=true;
            Enemy();
        }  if ((Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))) {
            velocityX = 6;
            Enemy();
            left=false;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
