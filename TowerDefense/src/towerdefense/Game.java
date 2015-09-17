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
    int stage;
    int levelDifficulty;
    
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
