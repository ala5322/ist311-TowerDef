/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

/**
 *
 * @author ala5322
 */
public class Bullet 
{
    private boolean isFiring;
    private boolean isHit;
    private int xValue;
    private int yValue;
    private int radius;
    
    Bullet(int x, int y, int r)
    {
        xValue = x;
        yValue = y;
        radius = r;
    }

    /**
     * @return the isFiring
     */
    public boolean isIsFiring() {
        return isFiring;
    }

    /**
     * @param isFiring the isFiring to set
     */
    public void setIsFiring(boolean isFiring) {
        this.isFiring = isFiring;
    }

    /**
     * @return the xValue
     */
    public int getxValue() {
        return xValue;
    }

    /**
     * @param xValue the xValue to set
     */
    public void setxValue(int xValue) {
        this.xValue = xValue;
    }

    /**
     * @return the yValue
     */
    public int getyValue() {
        return yValue;
    }

    /**
     * @param yValue the yValue to set
     */
    public void setyValue(int yValue) {
        this.yValue = yValue;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public boolean isHit()
    {
        //add some code here
        return true;
    }

    /**
     * @return the isHit
     */
    public boolean isIsHit() {
        return isHit;
    }

    /**
     * @param isHit the isHit to set
     */
    public void setIsHit(boolean isHit) 
    {
        this.isHit = isHit;
    }
}
