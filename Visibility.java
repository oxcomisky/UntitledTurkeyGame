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
public class Visibility {
    GUI gui;
    public Visibility(GUI gui){
        this.gui = gui;
    }
    public void showTitleScreen(){
        gui.titlePanel.setVisible(true);
        gui.startButtonPanel.setVisible(true);
        
        gui.mainTextPanel.setVisible(false);
        gui.selectionButtonPanel.setVisible(false);
        gui.resetButtonPanel.setVisible(false);
    }
    public void notTitleScreen(){
        gui.titlePanel.setVisible(false);
        gui.startButtonPanel.setVisible(false);
        
        gui.mainTextPanel.setVisible(true);
        gui.selectionButtonPanel.setVisible(true);
        gui.resetButtonPanel.setVisible(true);
    }
}
