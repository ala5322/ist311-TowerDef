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
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

/**
 *
 * @author ala5322
 */
//comment
//comment
//john comment
public class GameGUI 
{
    public GameGUI()
    {
        initComponents();
    }
    public void initComponents()
    {
        final int WIDTH_ONE = 900;
        final int WIDTH_TWO = 300;
        final int HEIGHT = 600;
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        b3.setVisible(false);
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JButton b6 = new JButton();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();
        JButton b10 = new JButton();
        JButton b11 = new JButton();
        JButton b12 = new JButton();
        JButton b13 = new JButton();
        JButton b14 = new JButton();
        JButton b15 = new JButton();
        b15.setVisible(false);
        JButton b16 = new JButton();
        JButton b17 = new JButton();
        JButton b18 = new JButton();
        JButton b19 = new JButton();
        JButton b20 = new JButton();
        JButton b21 = new JButton();
        JButton b22 = new JButton();
        JButton b23 = new JButton();
        JButton b24 = new JButton();
        JButton b25 = new JButton();
        JButton b26 = new JButton();
        JButton b27 = new JButton();
        b27.setVisible(false);
        JButton b28 = new JButton();
        JButton b29 = new JButton();
        JButton b30 = new JButton();
        JButton b31 = new JButton();
        JButton b32 = new JButton();
        JButton b33 = new JButton();
        JButton b34 = new JButton();
        JButton b35 = new JButton();
        JButton b36 = new JButton();
        JButton b37 = new JButton();
        JButton b38 = new JButton();
        JButton b39 = new JButton();
        b39.setVisible(false);
        JButton b40 = new JButton();
        JButton b41 = new JButton();
        JButton b42 = new JButton();
        JButton b43 = new JButton();
        b43.setVisible(false);
        JButton b44 = new JButton();
        b44.setVisible(false);
        JButton b45 = new JButton();
        b45.setVisible(false);
        JButton b46 = new JButton();
        b46.setVisible(false);
        JButton b47 = new JButton();
        b47.setVisible(false);
        JButton b48 = new JButton();
        JButton b49 = new JButton();
        JButton b50 = new JButton();
        JButton b51 = new JButton();
        b51.setVisible(false);
        JButton b52 = new JButton();
        JButton b53 = new JButton();
        JButton b54 = new JButton();
        JButton b55 = new JButton();
        b55.setVisible(false);
        JButton b56 = new JButton();
        JButton b57 = new JButton();
        JButton b58 = new JButton();
        JButton b59 = new JButton();
        b59.setVisible(false);
        JButton b60 = new JButton();
        JButton b61 = new JButton();
        JButton b62 = new JButton();
        JButton b63 = new JButton();
        b63.setVisible(false);
        JButton b64 = new JButton();
        JButton b65 = new JButton();
        JButton b66 = new JButton();
        JButton b67 = new JButton();
        b67.setVisible(false);
        JButton b68 = new JButton();
        JButton b69 = new JButton();
        JButton b70 = new JButton();
        JButton b71 = new JButton();
        b71.setVisible(false);
        JButton b72 = new JButton();
        JButton b73 = new JButton();
        JButton b74 = new JButton();
        JButton b75 = new JButton();
        b75.setVisible(false);
        JButton b76 = new JButton();
        JButton b77 = new JButton();
        JButton b78 = new JButton();
        JButton b79 = new JButton();
        b79.setVisible(false);
        JButton b80 = new JButton();
        JButton b81 = new JButton();
        JButton b82 = new JButton();
        JButton b83 = new JButton();
        b83.setVisible(false);
        JButton b84 = new JButton();
        JButton b85 = new JButton();
        JButton b86 = new JButton();
        JButton b87 = new JButton();
        b87.setVisible(false);
        JButton b88 = new JButton();
        b88.setVisible(false);
        JButton b89 = new JButton();
        b89.setVisible(false);
        JButton b90 = new JButton();
        b90.setVisible(false);
        JButton b91 = new JButton();
        b91.setVisible(false);
        JButton b92 = new JButton();
        JButton b93 = new JButton();
        JButton b94 = new JButton();
        JButton b95 = new JButton();
        b95.setVisible(false);
        JButton b96 = new JButton();
        JButton b97 = new JButton();
        JButton b98 = new JButton();
        JButton b99 = new JButton();
        JButton b100 = new JButton();
        JButton b101 = new JButton();
        JButton b102 = new JButton();
        JButton b103 = new JButton();
        JButton b104 = new JButton();
        JButton b105 = new JButton();
        JButton b106 = new JButton();
        JButton b107 = new JButton();
        b107.setVisible(false);
        JButton b108 = new JButton();
        JButton b109 = new JButton();
        JButton b110 = new JButton();
        JButton b111 = new JButton();
        JButton b112 = new JButton();
        JButton b113 = new JButton();
        JButton b114 = new JButton();
        JButton b115 = new JButton();
        JButton b116 = new JButton();
        JButton b117 = new JButton();
        JButton b118 = new JButton();
        JButton b119 = new JButton();
        b119.setVisible(false);
        JButton b120 = new JButton();
        JButton b121 = new JButton();
        JButton b122 = new JButton();
        JButton b123 = new JButton();
        JButton b124 = new JButton();
        JButton b125 = new JButton();
        JButton b126 = new JButton();
        JButton b127 = new JButton();
        JButton b128 = new JButton();
        JButton b129 = new JButton();
        JButton b130 = new JButton();
        JButton b131 = new JButton();
        b131.setVisible(false);
        JButton b132 = new JButton();
        JButton b133 = new JButton();
        JButton b134 = new JButton();
        JButton b135 = new JButton();
        JButton b136 = new JButton();
        JButton b137 = new JButton();
        JButton b138 = new JButton();
        JButton b139 = new JButton();
        JButton b140 = new JButton();
        JButton b141 = new JButton();
        JButton b142 = new JButton();
        JButton b143 = new JButton();
        b143.setVisible(false);
        JButton b144 = new JButton();
        //kkkkkkk
        //create the JFrame and set size
        JFrame fullFrame = new JFrame();
        fullFrame.setSize(WIDTH_ONE, HEIGHT);
        
        //create the content pane and set the layout and size
        Container contentPane = fullFrame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.setSize(WIDTH_ONE, HEIGHT);
        
       
        
        //create the control and game panels. Set size and color as well.
        JPanel backPanel = new JPanel();
        backPanel.setLayout(null);
        backPanel.setPreferredSize(new Dimension(HEIGHT, HEIGHT));
        JPanel gamePanel = new JPanel(new FlowLayout());
        gamePanel.setPreferredSize(new Dimension(HEIGHT, HEIGHT));
        JPanel controlPanel = new JPanel(new BorderLayout());
        controlPanel.setPreferredSize(new Dimension(WIDTH_TWO, HEIGHT));
        controlPanel.setBackground(Color.gray);
        gamePanel.setBackground(Color.blue);
        
        GridLayout gameLayout = new GridLayout(12,12);
        gamePanel.setLayout(gameLayout);
        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17,
            b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30,
            b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, 
            b41, b42, b43, b44, b45, b46, b47, b48, b49, b50,
            b51, b52, b53, b54, b55, b56, b57, b58, b59, b60,
            b61, b62, b63, b64, b65, b66, b67, b68, b69, b70,
            b71, b72, b73, b74, b75, b76, b77, b78, b79, b80,
            b81, b82, b83, b84, b85, b86, b87, b88, b89, b90,
            b91, b92, b93, b94, b95, b96, b97, b98, b99, b100,
            b101, b102, b103, b104, b105, b106, b107, b108, b109, b110,
            b111, b112, b113, b114, b115, b116, b117, b118, b119, b120,
            b121, b122, b123, b124, b125, b126, b127, b128, b129, b130,
            b131, b132, b133, b134, b135, b136, b137, b138, b139, b140,
            b141, b142, b143, b144};
         
        for(int i = 0; i < 144; i++)
        {
            gamePanel.add(buttons[i]);
        }
        
        
        JButton enemy = new JButton();
        enemy.setBounds(100, 0, 20, 20);
        enemy.setBackground(Color.black);
        backPanel.add(enemy);
        
        backPanel.add(gamePanel);
        
        //temp labels
        JTextField moneyField = new JTextField(10);
        JTextField scoreField = new JTextField(10);
        //add the weapon options to the control panel
        //add score, money and etc to control panel
        JLabel moneyLabel = new JLabel("Money: ");
        JLabel scoreLabel = new JLabel("Score: ");
        
        JPanel moneyPanel = new JPanel(new BorderLayout());
        moneyPanel.setPreferredSize(new Dimension(150, 50));
        moneyPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        moneyPanel.setBackground(Color.gray);
        moneyPanel.add(moneyLabel, BorderLayout.NORTH);
        moneyPanel.add(moneyField, BorderLayout.SOUTH);
        
        JPanel scorePanel = new JPanel(new BorderLayout());
        scorePanel.setPreferredSize(new Dimension(150, 50));
        scorePanel.setBorder(BorderFactory.createRaisedBevelBorder());
        scorePanel.setBackground(Color.gray);
        scorePanel.add(scoreLabel, BorderLayout.NORTH);
        scorePanel.add(scoreField, BorderLayout.SOUTH);
        
        JPanel moneyScorePanel = new JPanel(new BorderLayout());
        scorePanel.setBackground(Color.gray);
        moneyScorePanel.add(moneyPanel, BorderLayout.WEST);
        moneyScorePanel.add(scorePanel, BorderLayout.EAST);
        
        //next wave button
        JButton nextWaveButton = new JButton("Next Wave");
        nextWaveButton.setPreferredSize(new Dimension(150, 50));
        JButton restartButton = new JButton("Restart Game");
        restartButton.setPreferredSize(new Dimension(150, 50));
        restartButton.setVisible(true);
        nextWaveButton.setVisible(true);
                
        JPanel wavePanel = new JPanel(new BorderLayout());
        wavePanel.setPreferredSize(new Dimension(300, 50));
        wavePanel.add(nextWaveButton, BorderLayout.WEST);
        wavePanel.add(restartButton, BorderLayout.EAST);
        
        JButton healthModule = new JButton("HEALTH SHIT");
        
        JPanel healthPanel = new JPanel(new FlowLayout());
        healthPanel.setPreferredSize(new Dimension(300, 200));
        healthPanel.add(healthModule);
        
        //weapon buttons
        ImageIcon eraser = new ImageIcon("eraser.jpg");
        ImageIcon football = new ImageIcon("paperFootball.png");
        ImageIcon book = new ImageIcon("book.png");
        
        JButton eraserButton = new JButton(eraser);
        eraserButton.setPreferredSize(new Dimension(50, 50));
        eraserButton.setVisible(true);
        JButton paperFBButton = new JButton(football);
        paperFBButton.setPreferredSize(new Dimension(50, 50));
        paperFBButton.setVisible(true);
        JButton homeworkButton = new JButton(book);
        homeworkButton.setPreferredSize(new Dimension(50, 50));
        homeworkButton.setVisible(true);
        
        eraserButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // primes the eraser to be placed. Selects it? like witha borderaround it maybe
                JFrame parent = new JFrame();
                JOptionPane.showMessageDialog(parent, "selects eraser i guess.");
                EraserCannon.createWeapon();
            }
        });
        
        paperFBButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // primes the paper fb to be placed. Selects it? like witha borderaround it maybe
                JFrame parent = new JFrame();
                JOptionPane.showMessageDialog(parent, "selects paper fb i guess.");
                //FootballLauncher.createWeapon();
            }
        });
        
        homeworkButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // primes the homework to be placed. Selects it? like witha borderaround it maybe
                JFrame parent = new JFrame();
                JOptionPane.showMessageDialog(parent, "selects homework i guess.");
                //HomeworkTosser.createWeapon();
            }
        });
        
        
        
        JLabel eraserLabel1 = new JLabel("Eraser Cannon $20.");
        JLabel eraserLabel2 = new JLabel("Small Range Large Damage");
        JLabel eraserLabel3 = new JLabel("                                       ");
        JLabel paperFBLabel1 = new JLabel("Paper Football Launcher $10.");
        JLabel paperFBLabel2 = new JLabel("Long Range Small Damage");
        JLabel paperFBLabel3 = new JLabel("                                       ");
        JLabel homeworkLabel1 = new JLabel("Homework Tosser $15.");
        JLabel homeworkLabel2 = new JLabel("Medium Range Medium Damage");
        
        JPanel weaponButtonPanel = new JPanel(new FlowLayout());
        weaponButtonPanel.setPreferredSize(new Dimension(75, 300));
        JPanel weaponLabelPanel = new JPanel(new FlowLayout());
        weaponLabelPanel.setPreferredSize(new Dimension(225, 300));
        
        weaponButtonPanel.add(eraserButton);
        weaponButtonPanel.add(paperFBButton);
        weaponButtonPanel.add(homeworkButton);
        
        weaponLabelPanel.add(eraserLabel1);
        weaponLabelPanel.add(eraserLabel2);
        weaponLabelPanel.add(eraserLabel3);
        weaponLabelPanel.add(paperFBLabel1);
        weaponLabelPanel.add(paperFBLabel2);
        weaponLabelPanel.add(paperFBLabel3);
        weaponLabelPanel.add(homeworkLabel1);
        weaponLabelPanel.add(homeworkLabel2);
        
        JPanel weaponPanel = new JPanel(new BorderLayout());
        weaponPanel.add(weaponButtonPanel, BorderLayout.WEST);
        weaponPanel.add(weaponLabelPanel, BorderLayout.EAST);
       
        JPanel topHalfPanel = new JPanel(new BorderLayout());
        topHalfPanel.setPreferredSize(new Dimension(300, 100));
        JPanel botHalfPanel = new JPanel(new BorderLayout());
        botHalfPanel.setPreferredSize(new Dimension(300, 500));
        
        //weapon labels
        topHalfPanel.add(moneyScorePanel, BorderLayout.NORTH);
        topHalfPanel.add(wavePanel, BorderLayout.SOUTH);
        
        botHalfPanel.add(healthPanel, BorderLayout.NORTH);
        botHalfPanel.add(weaponPanel, BorderLayout.SOUTH);
        
        controlPanel.add(topHalfPanel, BorderLayout.NORTH);
        controlPanel.add(botHalfPanel, BorderLayout.SOUTH);
        
        //add the game and control panels to the content pane     
        contentPane.add(backPanel, BorderLayout.WEST);
        contentPane.add(controlPanel,BorderLayout.EAST);
        
        fullFrame.pack();
        fullFrame.setVisible(true);
        fullFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
