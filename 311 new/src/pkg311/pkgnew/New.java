/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311.pkgnew;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.CENTER;
import java.lang.reflect.Array;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author John
 */
public class New 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        initComponents();
    }
    
    public static void initComponents()
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
        JTextField nameTextBox = new JTextField("Hugh Jaynus", 15);
        startGameButton.setText("Start Game!");
        startGameButton.setSize(100, 20);
        
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
