/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledturkeygame;

/**
 *
 * @author oxcom
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import untitledturkeygame.Game.ChoiceHandler;

public class GUI {
    String position;
    JFrame window;
    Container container;
    JPanel titlePanel;
    JLabel titleLabel;
    JButton startButton;
    JButton B1;
    JButton B2;
    JButton B3;
    JButton B4;
    JButton reset;
    JPanel resetButtonPanel;
    JPanel startButtonPanel;
    JPanel mainTextPanel;
    JPanel selectionButtonPanel;
    JTextArea gameTextArea;
    Font TitleFont = new Font("Consolas",Font.PLAIN, 140);
    Font NormalFont = new Font("Consolas",Font.PLAIN, 24);
    Font StartButtonFont = new Font("Consolas",Font.BOLD,60);
    Font TextFont = new Font("Consolas",Font.PLAIN,14);
    TitleScreenHandler SBHandler = new TitleScreenHandler();
    
    final int WIDTH = 1920;
    final int HEIGHT = 1080;
    
    public void createGUI(ChoiceHandler CHandler){
        window = new JFrame();
        window.setSize(WIDTH,HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.DARK_GRAY);
        window.setLayout(null);
        
        container = window.getContentPane();
        
        titlePanel = new JPanel();
        titlePanel.setBounds(WIDTH/12, HEIGHT/12, 10*WIDTH/12, 3*HEIGHT/4);
        titlePanel.setBackground(Color.black);
        
        titleLabel = new JLabel("Untitled Turkey Game");
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(TitleFont);
        titleLabel.setVisible(true);
        titleLabel.setBounds(WIDTH/4, 200, 3*WIDTH/4, 300);
        
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(WIDTH/5,3*HEIGHT/5,3*WIDTH/5,HEIGHT/5);
        startButtonPanel.setBackground(Color.BLACK);
        startButtonPanel.setVisible(true);
        
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(StartButtonFont);
        startButton.setVisible(true);
        startButton.addActionListener(CHandler);
        startButton.setFocusPainted(false);
        startButton.setActionCommand("start");
        
        
        titlePanel.add(titleLabel);
        startButtonPanel.add(startButton);
        
        container.add(titlePanel);
        container.add(startButtonPanel);
        
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(WIDTH/12, HEIGHT/12, 10*WIDTH/12, 3*HEIGHT/4);
        mainTextPanel.setBackground(Color.DARK_GRAY);
        
        gameTextArea = new JTextArea();
        gameTextArea.setBackground(Color.DARK_GRAY);
        gameTextArea.setForeground(Color.white);
        gameTextArea.setBounds(WIDTH/6,HEIGHT/12,5*WIDTH/6,HEIGHT/4);
        gameTextArea.setLineWrap(true);
        gameTextArea.setFont(NormalFont);
        gameTextArea.setText("HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING. HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.");
        mainTextPanel.add(gameTextArea);
        
        selectionButtonPanel = new JPanel();
        selectionButtonPanel.setBounds(WIDTH/4, HEIGHT/2, WIDTH/2, 2*HEIGHT/5);
        selectionButtonPanel.setBackground(Color.black);
        selectionButtonPanel.setVisible(true);
        selectionButtonPanel.setLayout(new GridLayout(4,1));
        
        B1 = new JButton("Opt 1");
        B2 = new JButton("Opt 2");
        B3 = new JButton("Opt 3");
        B4 = new JButton("Opt 4");
        
        B1.setBackground(Color.black);
        B1.setForeground(Color.WHITE);
        B2.setBackground(Color.black);
        B2.setForeground(Color.WHITE);
        B3.setBackground(Color.black);
        B3.setForeground(Color.WHITE);
        B4.setBackground(Color.black);
        B4.setForeground(Color.WHITE);
        
        B1.setFont(TextFont);
        B2.setFont(TextFont);
        B3.setFont(TextFont);
        B4.setFont(TextFont);
       
        B1.setFocusPainted(false);
        B2.setFocusPainted(false);
        B3.setFocusPainted(false);
        B4.setFocusPainted(false);
        
        selectionButtonPanel.add(B1);
        selectionButtonPanel.add(B2);
        selectionButtonPanel.add(B3);
        selectionButtonPanel.add(B4);
        
        B1.addActionListener(CHandler);
        B1.setActionCommand("B1");
        B2.addActionListener(CHandler);
        B2.setActionCommand("B2");
        B3.addActionListener(CHandler);
        B3.setActionCommand("B3");
        B4.addActionListener(CHandler);
        B4.setActionCommand("B4");
        
        resetButtonPanel = new JPanel();
        reset = new JButton("Reset");
        reset.setFont(NormalFont);
        reset.setBackground(Color.black);
        reset.setForeground(Color.white);
        resetButtonPanel.setBackground(Color.DARK_GRAY);
        resetButtonPanel.setBounds(4*WIDTH/10, 0 , 2*WIDTH/10, HEIGHT/11);
        resetButtonPanel.add(reset);
        
        container.add(resetButtonPanel);
        container.add(selectionButtonPanel);
        container.add(mainTextPanel);
        window.setVisible(true);
        
        
    }
    public class TitleScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            
        }
    }
}
