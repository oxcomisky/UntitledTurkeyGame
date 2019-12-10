/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    public static void main(String[] args){
        new Game();
    }
    public Game(){
        gui.createGUI(CHandler);
        V.showTitleScreen();
    }
    
    public class ChoiceHandler implements ActionListener{
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

