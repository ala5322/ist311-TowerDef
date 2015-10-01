/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

/**
 *
 * @author ala5322
 */
public class GameGUI 
{
    public GameGUI()
    {
        
    }
    public void initComponents()
    {
        final int WIDTH_ONE = 900;
        final int WIDTH_TWO = 300;
        final int HEIGHT = 600;
        //create the JFrame and set size
        JFrame fullFrame = new JFrame();
        fullFrame.setSize(WIDTH_ONE, HEIGHT);
        
        //create the content pane and set the layout and size
        Container contentPane = fullFrame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.setSize(WIDTH_ONE, HEIGHT);
        
        //create the control and game panels. Set size and color as well.
        JPanel gamePanel = new JPanel(new FlowLayout());
        gamePanel.setPreferredSize(new Dimension(HEIGHT, HEIGHT));
        JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.setPreferredSize(new Dimension(WIDTH_TWO, HEIGHT));
        controlPanel.setBackground(Color.gray);
        gamePanel.setBackground(Color.blue);
        
        //temp labels
        JTextField moneyField = new JTextField(10);
        JTextField scoreField = new JTextField(10);
        //add the weapon options to the control panel
        //add score, money and etc to control panel
        JLabel moneyLabel = new JLabel("Money: ");
        JLabel scoreLabel = new JLabel("Score: ");
        
        JPanel moneyPanel = new JPanel(new BorderLayout());
        moneyPanel.setBackground(Color.gray);
        moneyPanel.add(moneyLabel, BorderLayout.NORTH);
        moneyPanel.add(moneyField, BorderLayout.SOUTH);
        
        JPanel scorePanel = new JPanel(new BorderLayout());
        scorePanel.setBackground(Color.gray);
        scorePanel.add(scoreLabel, BorderLayout.NORTH);
        scorePanel.add(scoreField, BorderLayout.SOUTH);
        
        //create weapon buttons
        ImageIcon eraserImage = new ImageIcon("eraser.jpg");
        JButton eraserButton = new JButton(eraserImage);
        
        controlPanel.add(moneyPanel);
        controlPanel.add(scorePanel);
        controlPanel.add(eraserButton);
        
        //add the game and control panels to the content pane     
        contentPane.add(gamePanel, BorderLayout.WEST);
        contentPane.add(controlPanel,BorderLayout.EAST);
        
        fullFrame.pack();
        fullFrame.setVisible(true);
        fullFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
