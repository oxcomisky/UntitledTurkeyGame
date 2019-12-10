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
public class Node<T>{
    private T data;
    private ArrayList<Node> next;
    private Boolean visited;
    
    public Node(T data){
        this.data = data;
        this.next = new ArrayList<>();
        this.visited = false;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node[] getNext() {
        return this.next.toArray(new Node[0]);
    }


    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    
    public void setNext(Node[] next) {
        for(int i=0; i<next.length;i++){
            this.next.add(next[i]);
        }
    }
    
    public void addNext(T data){
        this.next.add(0,new Node(data));
    }
    
    public int countNext(){
       return this.next.size();
    }
    
}
