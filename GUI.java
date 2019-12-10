/*
 * GUI Class for UntitledTurkeyGame
 */
package untitledturkeygame;

/**
 *
 * @author Jon Comisky, Jason Bendickson
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import untitledturkeygame.Game.ChoiceHandler;

/**
 *
 * @author Jason, Jon
 */
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
    Font TitleFont = new Font("Consolas",Font.PLAIN, 80);
    Font NormalFont = new Font("Consolas",Font.PLAIN, 14);
    Font StartButtonFont = new Font("Consolas",Font.BOLD,60);
    Font TextFont = new Font("Consolas",Font.PLAIN,10);
    
    final int WIDTH = 1080;
    final int HEIGHT = 720;
    
    //constructor

    /**
     *
     * @param CHandler (Choice Handler)
     */
    public void createGUI(ChoiceHandler CHandler){
        //create the window
        window = new JFrame();
        window.setSize(WIDTH,HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.DARK_GRAY);
        window.setLayout(null);
        
        //define the container to the windows container
        container = window.getContentPane();
        
        //create the title panel
        titlePanel = new JPanel();
        titlePanel.setBounds(WIDTH/12, HEIGHT/12, 10*WIDTH/12, 3*HEIGHT/4);
        titlePanel.setBackground(Color.black);
        
        //create the title label
        titleLabel = new JLabel("Untitled Turkey Game");
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(TitleFont);
        titleLabel.setVisible(true);
        titleLabel.setBounds(WIDTH/4, 200, 3*WIDTH/4, 300);
        
        //create the start button panel
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(WIDTH/5,3*HEIGHT/5,3*WIDTH/5,HEIGHT/5);
        startButtonPanel.setBackground(Color.BLACK);
        startButtonPanel.setVisible(true);
        
        //create the start button
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(StartButtonFont);
        startButton.setVisible(true);
        startButton.addActionListener(CHandler);
        startButton.setFocusPainted(false);
        startButton.setActionCommand("start");
        
        //add the title label and start button to their panels
        titlePanel.add(titleLabel);
        startButtonPanel.add(startButton);
        
        //add the title panels to the container
        container.add(titlePanel);
        container.add(startButtonPanel);
        
        //create the main text panel
        
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(WIDTH/12, HEIGHT/12, 10*WIDTH/12, 3*HEIGHT/4);
        mainTextPanel.setBackground(Color.DARK_GRAY);
        
        //create the text area
        //this is where the text goes that tells you what you are doing
        gameTextArea = new JTextArea();
        gameTextArea.setBackground(Color.DARK_GRAY);
        gameTextArea.setForeground(Color.white);
        gameTextArea.setBounds(WIDTH/6,HEIGHT/12,5*WIDTH/6,HEIGHT/4);
        gameTextArea.setLineWrap(true);
        gameTextArea.setFont(NormalFont);
        gameTextArea.setText("HELLO THIS IS THE TEXT AREA WHERE THE GAME TELLS YOU WHAT IS HAPPENING.");
        mainTextPanel.add(gameTextArea);
        
        //button panel creation
        selectionButtonPanel = new JPanel();
        selectionButtonPanel.setBounds(WIDTH/10, HEIGHT/2, 8*WIDTH/10, 2*HEIGHT/5);
        selectionButtonPanel.setBackground(Color.black);
        selectionButtonPanel.setVisible(true);
        selectionButtonPanel.setLayout(new GridLayout(4,1));
        
        //button creation
        //these buttons are the buttons that allow the user to interact with the game
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
        
        //add the buttons to the selection panel
        selectionButtonPanel.add(B1);
        selectionButtonPanel.add(B2);
        selectionButtonPanel.add(B3);
        selectionButtonPanel.add(B4);
        
        //set action listener for buttons
        B1.addActionListener(CHandler);
        B1.setActionCommand("B1");
        B2.addActionListener(CHandler);
        B2.setActionCommand("B2");
        B3.addActionListener(CHandler);
        B3.setActionCommand("B3");
        B4.addActionListener(CHandler);
        B4.setActionCommand("B4");
        
        //setup the reset button.
        resetButtonPanel = new JPanel();
        reset = new JButton("Reset");
        reset.setFont(NormalFont);
        reset.setBackground(Color.black);
        reset.setForeground(Color.white);
        reset.addActionListener(CHandler);
        reset.setActionCommand("reset");
        resetButtonPanel.setBackground(Color.DARK_GRAY);
        resetButtonPanel.setBounds(4*WIDTH/10, 0 , 2*WIDTH/10, HEIGHT/11);
        resetButtonPanel.add(reset);
        
        //add the panels to the container
        container.add(resetButtonPanel);
        container.add(selectionButtonPanel);
        container.add(mainTextPanel);
        //set the window to visible to make everything appear
        window.setVisible(true);
        
        
    }
}
