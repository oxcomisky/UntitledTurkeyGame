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
 * @param <T>
 */
public class Node<T>{
    private T data;
    private ArrayList<Node> next;
    private Boolean visited;
    
    //constructor

    /**
     *
     * @param data
     */
    public Node(T data){
        this.data = data;
        this.next = new ArrayList<>();
        this.visited = false;
    }

    //data getter

    /**
     *
     * @return data
     */
    public T getData() {
        return data;
    }
    //data setter

    /**
     *
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }
    //Node array getter

    /**
     *
     * @return Node
     */
    public Node[] getNext() {
        return this.next.toArray(new Node[0]);
    }

    //visited getter

    /**
     *
     * @return visited
     */
    public Boolean getVisited() {
        return visited;
    }

    //visited setter

    /**
     *
     * @param visited
     */
    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    //Node array setter

    /**
     *
     * @param next
     */
    public void setNext(Node[] next) {
        for(int i=0; i<next.length;i++){
            this.next.add(next[i]);
        }
    }
    
    //Adds a Node to the Node array within the current node

    /**
     *
     * @param data
     */
    public void addNext(T data){
        this.next.add(0,new Node(data));
    }
    
    //returns the count of the adjacent nodes

    /**
     *
     * @return size
     */
    public int countNext(){
       return this.next.size();
    }
    
}
