/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledturkeygame;

import java.util.*;

public class Player implements PlayerInterface {
    
    String name;
    
    int playerLocation;
        
    public boolean eventArray[];
    
    @Override
    public void reset(){
        playerLocation = 0;
        Arrays.fill(eventArray, false);
    }
    
    @Override
    public void quit(){
        System.exit(0);
    }
    
    /**
     *
     */
    @Override
    public void move(){ //connectedTo,location
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean checkEvents(){
       return false; 
    }
    
}//end class
