/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

import java.util.ArrayList;
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
    
    
    public void addToQueue (ArrayList suc, Queue q1){
        
        int i;
        for (i=0;i<=suc.size();i++){
            //checar se é igual ao inicial
            q1.add(suc.get(i));
            
        }
    }
    
    public void search (EightPuzzle eightpuzzle){
        
        ArrayList<EightPuzzle> suc = new ArrayList<>();
        
        //Queue q1 = new Queue();
        Queue<EightPuzzle> q1 = new LinkedList<EightPuzzle>();
        
        while (!q1.isEmpty()){
            
            EightPuzzle var = q1.poll();
            
            if (!var.isSolution()){
                
                var.genSucessors();
                addToQueue(suc, q1);
                
            }else{
                System.out.println("GOAL! ");
            }
        }
    }
    
}
