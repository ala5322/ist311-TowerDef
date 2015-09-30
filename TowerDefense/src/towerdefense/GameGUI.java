/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ala5322
 */
public class GameGUI 
{
    private void initComponents()
    {
        JFrame fullFrame = new JFrame();
        fullFrame.setSize(900, 600);
        
        Container contentPane = fullFrame.getContentPane();
        
        contentPane.setLayout(new BorderLayout());
        contentPane.setSize(900, 600);
        
        JPanel gamePanel = new JPanel(new FlowLayout());
        JPanel controlPanel = new JPanel(new FlowLayout());
        gamePanel.setSize(600, 600);
        controlPanel.setSize(300, 600);
        
        JLabel test1 = new JLabel("here is the game board");
        JLabel test2 = new JLabel("here is the control panel");
        
        gamePanel.add(test1);
        controlPanel.add(test2);
               
        contentPane.add(gamePanel, BorderLayout.WEST);
        contentPane.add(controlPanel,BorderLayout.EAST);
        
        fullFrame.setVisible(true);
        fullFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //not finished yet
        
    }
}
