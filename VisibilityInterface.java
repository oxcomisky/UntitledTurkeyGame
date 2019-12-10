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
public interface VisibilityInterface {
    /**sets visibility of the title screen to true and the secondary screen to false
     * ensure titlePanel Visible = true
     * ensure startButtonPanel Visible = true
     * ensure mainTextPanel Visible = false
     * ensure selectionButtonPanel Visible = false
     * ensure resetButtonPanel Visible = false
     */
    public void showTitleScreen();
    
    /**sets visibility of the secondary screen to true and the title screen to false
     * ensure titlePanel Visible = false
     * ensure startButtonPanel Visible = false
     * ensure mainTextPanel Visible = true
     * ensure selectionButtonPanel Visible = true
     * ensure resetButtonPanel Visible = true
     */
    public void notTitleScreen();
}
