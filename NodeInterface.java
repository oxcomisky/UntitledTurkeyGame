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
public interface NodeInterface {
    
    /**data getter
     *
     * @return data the value of the string data
     */
    public String getData();
            
    /**data setter
     *
     * @param data set the value of the string data
     */
    public void setData(String data);
    
    /**Node array getter
     *
     * @return Node[] returns the node array associated with each node
     * these are the nodes that are connected to this current node.
     */
    public Node[] getNext();
    
    /**visited getter
     *
     * @return visited a way to show if the node has been visited yet.
     */
    public Boolean getVisited();
    
    /**visited setter
     *
     * @param visited a way to show if the node has been visited yet.
     */
    public void setVisited(Boolean visited);
    
    /**
     * note: this method deletes all previous data stored in next.
     * @param next sets the next-array to the Node[] passed to this method
     */
    //Node array setter
    public void setNext(Node[] next);
    
    /**Adds a Node to the Node array within the current node
     *
     * @param data 
     */
    public void addNext(String data);
    
    /**returns the count of the adjacent nodes
     *
     * @return size an int value associated with the size of the current nodes inner array
     */
    public int countNext();
}
