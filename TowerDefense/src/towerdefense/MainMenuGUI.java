/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author John
 */
public class MainMenuGUI 
{
    public MainMenuGUI()
    {
        
    }
    
    public void initComponents()
    {
        JFrame mainFrame = new JFrame();
        Container contentPane = mainFrame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setSize(200, 600);
        
        JPanel mainMenuPanel = new JPanel(new FlowLayout());
        mainMenuPanel.setPreferredSize(new Dimension(200, 600));
        JPanel namePanel = new JPanel(new BorderLayout());
        JPanel diffPanel = new JPanel(new BorderLayout());
        JPanel setupPanel = new JPanel(new BorderLayout());
        JButton startGameButton = new JButton();
        
        JLabel nameLabel = new JLabel("Please enter your name, son");
        JLabel difficultyLabel = new JLabel("Please select difficulty");
        JTextField nameTextBox = new JTextField("HughJaynus", 15);
        startGameButton.setText("Start Game!");
        startGameButton.setSize(100, 20);
        
        startGameButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (nameTextBox.getText().length() < 3 || nameTextBox.getText().length() > 10)
                {
                    JFrame parent = new JFrame();
                    JOptionPane.showMessageDialog(parent, "Please enter a user name that is more than 3 or less than 10 characters!");
                }
                else 
                {
                    //CALL GAME GUI
                    GameGUI theGameGUI = new GameGUI();
                    theGameGUI.initComponents();
                    mainFrame.dispose();
                }
            }
        });
        
        String [] difficulties = new String[3];
        difficulties[0]="Easy-Peasy";
        difficulties[1]="Middle-of-the-Road";
        difficulties[2]="Hard-as-F***";
        
        JComboBox difficultyComboBox = new JComboBox(difficulties);
        
        namePanel.add(nameLabel, BorderLayout.NORTH);
        namePanel.add(nameTextBox, BorderLayout.SOUTH);
        diffPanel.add(difficultyLabel, BorderLayout.NORTH);
        diffPanel.add(difficultyComboBox, BorderLayout.SOUTH);
        setupPanel.add(namePanel, BorderLayout.NORTH);
        setupPanel.add(diffPanel, BorderLayout.SOUTH);
        mainMenuPanel.add(setupPanel);
        mainMenuPanel.add(startGameButton);
        mainMenuPanel.setSize(200, 600);
        contentPane.add(mainMenuPanel);
        
        mainFrame.setSize(900, 600);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
