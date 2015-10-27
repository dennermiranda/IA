/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
//import sun.invoke.empty.Empty;
//import java.util.ha

/**
 *
 * @author Dener
 * @author Pedro Frazao
 */
public class BreadthFirstSearch {
    
    //get the 
    //check if it is the goal
    //not the goal? Then... 
    
    //get first then generates
    
    //EightPuzzle eightpuzzle = new EightPuzzle();
    //ArrayList<EightPuzzle> suc = new ArrayList<>();
    HashMap<Integer, EightPuzzle> visited= new HashMap<Integer, EightPuzzle>();
    
    public void addToQueue (ArrayList suc, Queue q1){
        
        int i;
        for (i=0;i<=suc.size();i++){
            
            if (!visited.containsValue(suc.get(i))){
                
                visited.put(suc.get(i).hashCode(), (EightPuzzle)suc.get(i));
                q1.add(suc.get(i));
                
            }
            
        }
    }
    
    public void search (EightPuzzle eightpuzzle){
        
        ArrayList<EightPuzzle> suc = new ArrayList<>();
        
        //Queue q1 = new Queue();
        Queue<EightPuzzle> q1 = new LinkedList<EightPuzzle>();
        EightPuzzle var = q1.element();
        visited.put(var.hashCode(), var);
        
        while (!q1.isEmpty()){
            
            var = q1.poll();
            
            if (!var.isSolution()){
                
                suc = var.genSucessors();
                addToQueue(suc, q1);
                
            }else{
                System.out.println("GOAL! ");
            }
        }
    }
    
}
