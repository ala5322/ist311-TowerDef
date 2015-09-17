/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import javax.swing.*;
/**
 *
 * @author ala5322
 */
public class MainMenuGUI
{
    private void initComponents()
    {
        JFrame mainFrame = new JFrame();
        JPanel mainMenuPanel = new JPanel();
        
        JLabel nameLabel = new JLabel("Please enter your name, son");
        JLabel difficultyLabel = new JLabel("Please select difficulty");
        JTextField nameTextBox = new JTextField("Hugh Jaynus");
        
        String [] difficulties = new String[3];
        difficulties[0]="Easy-Peasy";
        difficulties[1]="Middle-of-the-Road";
        difficulties[2]="Hard-as-F***";
        
        JComboBox difficultyComboBox = new JComboBox(difficulties);
        
        mainMenuPanel.add(nameLabel);
        mainMenuPanel.add(nameTextBox);
        mainMenuPanel.add(difficultyLabel);
        mainMenuPanel.add(difficultyComboBox);
        
        mainFrame.add(mainMenuPanel);
    
    }
    
}
