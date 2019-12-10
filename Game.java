/*
 * Game Class and Choice Handler Class for plaer choice selection.
 */
package untitledturkeygame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author Jon Comisky, Jason Bendickson
 */
public class Game {
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
    ChoiceHandler CHandler = new ChoiceHandler();
    GUI gui = new GUI();
    Visibility V = new Visibility(gui);
    Story story = new Story(this,gui,V);
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        new Game(); //call game
    }
    /**
     * require showTitleScreen = true
     */
    //constructor
    public Game(){
        gui.createGUI(CHandler);
        V.showTitleScreen();
    }
    
    //choice handler allows for a clean way to switch between each story element
    //as well as start and reset the game
    //this class allows for one method to handle all of the button presses
    /**
     * @ensure choice (return the players choice)
     */
    public class ChoiceHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            String choice = evt.getActionCommand();
                switch(choice){
                    case "reset": V.showTitleScreen();story.reset();break;
                    case "start": V.notTitleScreen();story.barn(); break;
                    case "B1": story.selectPosition(nextPosition1); break;
                    case "B2": story.selectPosition(nextPosition2); break;
                    case "B3": story.selectPosition(nextPosition3);break;
                    case "B4": story.selectPosition(nextPosition4);break;
                }
            }
        }
            
}

