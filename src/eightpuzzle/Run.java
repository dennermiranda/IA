/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dener
 */
public class Run {
    public static void main (String args []){
        //new GUIPuzzleF().setVisible(true);
    	
        EightPuzzle puzzle = new EightPuzzle();
        EightPuzzle puzzle1 = new EightPuzzle();
        
        
        //int test [] = {1,0,6,3,2,5,7,8,4};
        int test [] =  {0,6,1,8,4,2,3,5,7};
        List<Integer> test1 = new ArrayList<Integer>();
        
        for (int i = 0; i < 9; i++){
            test1.add(test[i]);
        }
        puzzle.setCurrent(test1);
        puzzle1.setCurrent(test1);
        System.out.println(puzzle.equals(puzzle1));
        
        /*AStar star = new AStar();
        System.out.println("Entra star");
        star.search(puzzle, 0);*/
        
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        System.out.println("Entra BFS");
        bfs.search(puzzle);
    }
}
