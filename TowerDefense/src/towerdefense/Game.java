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
public class Game 
{
    private int stage;
    private int levelDifficulty;
    private String difficulty;
    Enemy[] enemyList = new Enemy[100];
    Weapon[] weaponList = new Weapon[100];
    
    public int getStage()
    {
        return stage;
    }
    public int getLevelDifficulty()
    {
        return levelDifficulty;
    }
    public void setEasy()
    {
        difficulty = "Easy ";
    }
    public void setMedium()
    {
        difficulty = "Medium ";
    }
    public void setHard()
    {
        difficulty = "Hard ";
    }
    
    //check status? What does it mean??
    
}
