import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BearEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BearEnemy extends Actor
{
    /**
     *This makes the bear move from the right side of the screen to the left side
     * When it gets to the right side, it calls the resetBear function
     */
    public void act()
    {
        move(-3);
        
        if(getX() <= 0)
        {
            resetBear();
        }
    }
    
    /* 
    * To choose the bear's location, it chooses a random number to set the location either near the top or bottom
    */ 
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
