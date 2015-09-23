/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.awt.BorderLayout;
import javax.swing.*;
/**
 *
 * @author ala5322 
 */
public class MainMenuGUI
{
    public void initComponents()
    {
        JFrame mainFrame = new JFrame();
        JPanel mainMenuPanel = new JPanel();
        JPanel namePanel = new JPanel(new BorderLayout());
        JPanel diffPanel = new JPanel(new BorderLayout());
        
        JLabel nameLabel = new JLabel("Please enter your name, son");
        JLabel difficultyLabel = new JLabel("Please select difficulty");
        JTextField nameTextBox = new JTextField("Hugh Jaynus", 15);
        
        String [] difficulties = new String[3];
        difficulties[0]="Easy-Peasy";
        difficulties[1]="Middle-of-the-Road";
        difficulties[2]="Hard-as-F***";
        
        JComboBox difficultyComboBox = new JComboBox(difficulties);
        
        namePanel.add(nameLabel, BorderLayout.PAGE_START);
        namePanel.add(nameTextBox, BorderLayout.PAGE_END);
        diffPanel.add(difficultyLabel, BorderLayout.NORTH);
        diffPanel.add(difficultyComboBox, BorderLayout.SOUTH);
        mainMenuPanel.add(namePanel);
        mainMenuPanel.add(diffPanel);
        
        mainFrame.add(mainMenuPanel);
        mainFrame.setSize(300, 700);
        mainFrame.setVisible(true);
        
       
    }
    
}


