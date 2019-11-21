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
public abstract interface MapInterface {
    public String getLocation();
    public void setLocation(String newLocation);
    Boolean connectedTo();
}
