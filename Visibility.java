/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledturkeygame;

/**
 *
 * @author Jon Comisky, Jason Bendickson
 */
public class Visibility implements VisibilityInterface{
    GUI gui;
    //constructor
    /**
     *
     * @param gui
     */
    public Visibility(GUI gui){
        this.gui = gui;
    }
    
    
     /**sets visibility of the title screen to true and the secondary screen to false
     * ensure titlePanel Visible = true
     * ensure startButtonPanel Visible = true
     * ensure mainTextPanel Visible = false
     * ensure selectionButtonPanel Visible = false
     * ensure resetButtonPanel Visible = false
     */
    @Override
    public void showTitleScreen(){
        gui.titlePanel.setVisible(true);
        gui.startButtonPanel.setVisible(true);
        
        gui.mainTextPanel.setVisible(false);
        gui.selectionButtonPanel.setVisible(false);
        gui.resetButtonPanel.setVisible(false);
    }
    
    /**sets visibility of the secondary screen to true and the title screen to false
     * ensure titlePanel Visible = false
     * ensure startButtonPanel Visible = false
     * ensure mainTextPanel Visible = true
     * ensure selectionButtonPanel Visible = true
     * ensure resetButtonPanel Visible = true
     */
    @Override
    public void notTitleScreen(){
        gui.titlePanel.setVisible(false);
        gui.startButtonPanel.setVisible(false);
        
        gui.mainTextPanel.setVisible(true);
        gui.selectionButtonPanel.setVisible(true);
        gui.resetButtonPanel.setVisible(true);
    }

}
