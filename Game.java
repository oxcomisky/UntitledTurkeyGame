/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledturkeygame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author oxcom
 */
public class Game {
    JFrame window;
    Container container;
    JPanel titlePanel;
    JLabel titleLabel;
    JButton startButton;
    JPanel startButtonPanel;
    JPanel mainTextPanel;
    JTextArea gameTextArea;
    Font TitleFont = new Font("Consolas",Font.PLAIN, 60);
    Font NormalFont = new Font("Consolas",Font.PLAIN, 30);
    TitleScreenHandler SBHandler = new TitleScreenHandler();
    
    int WIDTH = 1920;
    int HEIGHT = 1080;
   
    public static void main(String[] args){
        new Game();
    }
    
    public Game(){
        
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
        titleLabel.setBounds(WIDTH/4, 100, 3*WIDTH/4, 150);
        
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(WIDTH/5,3*HEIGHT/5,3*WIDTH/5,HEIGHT/5);
        startButtonPanel.setBackground(Color.blue);
        startButtonPanel.setVisible(true);
        
        startButton = new JButton("START");
        startButton.setBackground(Color.GRAY);
        startButton.setForeground(Color.white);
        startButton.setFont(NormalFont);
        startButton.setVisible(true);
        startButton.addActionListener(SBHandler);
        
        
        titlePanel.add(titleLabel);
        startButtonPanel.add(startButton);
        
        container.add(titlePanel);
        container.add(startButtonPanel);
        
        window.setVisible(true);
    }
    public void createNewScreen(){
        //get rid of title screen 
        titlePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        //create new panel for next screen
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(WIDTH/12, HEIGHT/12, 10*WIDTH/12, 3*HEIGHT/4);
        mainTextPanel.setBackground(Color.blue);
        container.add(mainTextPanel);
        
        gameTextArea = new JTextArea();
        gameTextArea.setBackground(Color.white);
        gameTextArea.setForeground(Color.black);
        gameTextArea.setBounds(WIDTH/12,HEIGHT/12,WIDTH/2,500);
        gameTextArea.setLineWrap(true);
        gameTextArea.setText("HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING. HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.");
        
        mainTextPanel.add(gameTextArea);
        
        
        window.setVisible(true);
        
    }
    
    public class TitleScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            createNewScreen();
        }
    }
}
