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
    
    Game(int s, int ld, String d)
    {
        stage = s;
        levelDifficulty = ld;
        difficulty = d;
    }
    
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
    
    //method to see how much health an enemy has remaining after being hit 
    public int remainingEnemyHealth(int health, int damage)
    {
        //not enough damage to kill enemy
        if (damage < health)
            health = health - damage;
        //more damage than enemy health; enemy dies
        else
            health = 0;
        return health;
    }
}
