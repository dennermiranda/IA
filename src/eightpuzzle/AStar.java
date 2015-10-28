/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Dener
 * @author Pedro Frazao
 */
public class AStar {
    
    //ArrayList<EightPuzzle> visited= new ArrayList<>();
    Set<EightPuzzle> visited = new HashSet<EightPuzzle>();
    //private Deque<String> path = new ArrayDeque<String>();
    public void addToQueue (ArrayList<EightPuzzle> suc, PriorityQueue<EightPuzzle> q1){
        
        int i;
        for (i=0;i<suc.size();i++){
            
            if (!visited.contains(suc.get(i))){
                
                visited.add((EightPuzzle)suc.get(i));
                q1.offer(suc.get(i));
                
            }
            
        }
    }
    
    public void search (EightPuzzle eightpuzzle, int heur){
        
    	int count = 0;
    	
        ArrayList<EightPuzzle> suc = new ArrayList<>();
        
        System.out.println("Inicia Star");
        //Queue q1 = new Queue();
        PriorityQueue<EightPuzzle> q1 = new PriorityQueue<>();
        if (heur == 0)
            eightpuzzle.hamming();
        else
            eightpuzzle.manhattan();
        q1.offer(eightpuzzle);
        EightPuzzle var = q1.element();
        visited.add(var);
        var.setMove("Begin");
        System.out.println("Antes While");
        while (!q1.isEmpty()){
            //System.out.println("LACO");
            var = q1.poll();
            count++;
            //path.add(var.getMove());
            if (!var.isSolution()){
                
                suc = var.genSucessors(heur);
                addToQueue(suc, q1);
                //path.removeLast();
            }else{
                System.out.println("GOAL! ");
                System.out.println(path(var));
                System.out.println(var.toString());
                break;
                
            }
        }
        System.out.println(count);
        System.out.println("Saiu");
    }
    
    public String path(EightPuzzle puzzle){
        StringBuilder path = new StringBuilder();
        //path.append("hue");
        int count = 0;
        EightPuzzle next = new EightPuzzle();
        next = puzzle;
        //System.out.println("hue");
        while(next!=null){
            path.append(next.getMove());
            next = next.getParent();
            if (next!=null)
                path.append("; ");
            count++;
        }
        path.append("; "+ count);
        return path.toString();
    }
    
}
