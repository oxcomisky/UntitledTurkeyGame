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
import java.util.*;

public abstract class Map implements MapInterface {

    static class Graph {
        int V; 
        LinkedList<Integer> adjListArray[]; 
          
        // constructor  
        Graph(int V) 
        { 
            this.V = V; 
              
            // define the size of array as  
            // number of vertices 
            adjListArray = new LinkedList[V]; 
              
            // Create a new list for each vertex 
            // such that adjacent nodes can be stored 
            for(int i = 0; i < V ; i++){ 
                adjListArray[i] = new LinkedList<>(); 
            } 
        } 
    } 
      
    // Adds an edge to an undirected graph 
    static void addEdge(Graph graph, int src, int dest) 
    { 
        // Add an undirected edge from src to dest.  
        graph.adjListArray[src].add(dest); 
        graph.adjListArray[dest].add(src); 
    } 
       
    static void printGraph(Graph graph) 
    {        
        for(int v = 0; v < graph.V; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ v); 
            System.out.print("head"); 
            for(Integer pCrawl: graph.adjListArray[v]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
        } 
    } 
       
    // Driver program to test above functions 
    public static void main(String args[]) 
    { 
        // create the graph given in above figure 
        int V = 4; 
        Graph graph = new Graph(V);  
       
        // Adding edges
        // 0 = Barn <-> 1 = House               //Key
        addEdge(graph, 0, 1);                   //Barn  = 0
                                                //House = 1
        // 0 = Barn <-> 2 = Pond                //Pond  = 2
        addEdge(graph, 0, 2);                   //Room  = 3
        
        // 1 = House <-> 2 = Pond
        addEdge(graph, 1, 2); 
        
        // 1 = House <-> 3 = Room
        addEdge(graph, 1, 3); 
        
        printGraph(graph); 
    } 
}     