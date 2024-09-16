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
     * Act - do whatever the BearEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-3);
        
        if(getX() <= 0)
        {
            resetBear();
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
