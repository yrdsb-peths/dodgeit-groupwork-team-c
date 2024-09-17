import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BearEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BearEnemy extends Actor
{
    //This is the code that allows the Bear Enemy to move
    private boolean waiting;
    private int waitingTimer;
    
    public BearEnemy()
    {
        waitingTimer = 120; 
        waiting = true;
    }
    public void act()
    {
        if(waiting)
        {
            waitingTimer--;
            if(waitingTimer== 0 )
            {
                waiting = false;
                Hero p = getWorld().getObjects(Hero.class).get(0);
            }
        }
        else
        {
            move(-8);
            if(isAtEdge())
            {
                resetBear();
            }
        }
    }
    
    public void resetBear()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600,100);
        }
        else
        {
            setLocation(600,300);
        }
    }
}
