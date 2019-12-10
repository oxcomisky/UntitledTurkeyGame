/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledturkeygame;

import java.util.*;

/**
 *
 * @author Jon Comisky, Jason Bendickson
 */
public class Node implements NodeInterface{
    private String data;
    private ArrayList<Node> next;
    private Boolean visited;
    
    
    /**constructor
     *
     * @param data a string that is a key for each node
     */
    public Node(String data){
        this.data = data;
        this.next = new ArrayList<>();
        this.visited = false;
    }

   
    /**data getter
     *
     * @return data the value of the string data
     */
    @Override
    public String getData() {
        return data;
    }
    
    /**data setter
     *
     * @param data set the value of the string data
     */
    
    @Override
    public void setData(String data) {
        this.data = data;
    }
    
    /**Node array getter
     *
     * @return Node[] returns the node array associated with each node
     * these are the nodes that are connected to this current node.
     */
    @Override
    public Node[] getNext() {
        return this.next.toArray(new Node[0]);
    }

    
    /**visited getter
     *
     * @return visited a way to show if the node has been visited yet.
     */
    @Override
    public Boolean getVisited() {
        return visited;
    }

    
    /**visited setter
     *
     * @param visited a way to show if the node has been visited yet.
     */
    @Override
    public void setVisited(Boolean visited) {
        this.visited = visited;
    }
    
    /**
     * note: this method deletes all previous data stored in next.
     * @param next sets the next-array to the Node[] passed to this method
     */
    //Node array setter
    @Override
    public void setNext(Node[] next) {
        for (Node next1 : next) {
            this.next.add(next1);
        }
    }
    
    
    /**Adds a Node to the Node array within the current node
     *
     * @param data 
     */
    @Override
    public void addNext(String data){
        this.next.add(0,new Node(data));
    }
    
    /**returns the count of the adjacent nodes
     *
     * @return size an int value associated with the size of the current nodes inner array
     */
    @Override
    public int countNext(){
       return this.next.size();
    }
    
}
