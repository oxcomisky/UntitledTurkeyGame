/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledturkeygame;

import java.util.*;

/**
 *
 * @author oxcom
 */
public class Node<T>{
    private T data;
    private ArrayList<Node> next;
    private String body;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
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
        return next.toArray(new Node[0]);
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
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
    
    public void add(T data){
        this.next.add(0,new Node(data));
    }
    
    
}
