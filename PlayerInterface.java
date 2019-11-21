/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledturkeygame;

/**
 *
 * @author Jason
 */
public interface PlayerInterface {
    
    void reset();
    
    void quit();
    
    public void move();
    
    public boolean checkEvents();
   
}
