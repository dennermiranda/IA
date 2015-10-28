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
import java.util.Set;
import java.util.HashSet;
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
    //ArrayList<EightPuzzle> visited= new ArrayList<>();
    Set<EightPuzzle> visited = new HashSet<EightPuzzle>();
    
    public void addToQueue (ArrayList suc, Queue q1){
        
        int i;
        for (i=0;i<suc.size();i++){
            
            if (!visited.contains(suc.get(i))){
                
                visited.add((EightPuzzle)suc.get(i));
                q1.add(suc.get(i));
                
            }
            
        }
    }
    
    public void search (EightPuzzle eightpuzzle){
        
        ArrayList<EightPuzzle> suc = new ArrayList<>();
        int count = 0;
        
        Queue<EightPuzzle> q1 = new LinkedList<EightPuzzle>();
        q1.offer(eightpuzzle);
        EightPuzzle var = q1.element();
        visited.add(var);
        var.setMove("Begin");
        
        while (!q1.isEmpty()){
            
            var = q1.poll();
            System.out.println("Laço "+count);
            count++;
            
            if (!var.isSolution()){
                
                suc = var.genSucessors();
                addToQueue(suc, q1);
                //path.removeLast();
                
            }else{
                System.out.println("GOAL! ");
                System.out.println(var.toString());
                break;
            }
        }
    }
    
}
