/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 *
 * @author Dener
 */
public class EightPuzzle {

    /**
     * @param args the command line arguments
     */
    private final int solution[] = {1, 2, 3, 4, 5, 6, 7, 8, 0};
    private List initialState  = new ArrayList();
    private List current  = new ArrayList();
    private Deque<String> path = new ArrayDeque<String>();
    
    public int hole (){
        return current.lastIndexOf(0);
    }
    
    public void swap (int number){
        int holeP = this.hole();
        int numberB = current.lastIndexOf(number);
        current.set(holeP, number);
        current.set(numberB, 0);
    }
    
    public EightPuzzle(List initialState) {
        this.initialState = initialState;
    }

    
    public List getInitialState() {
        return initialState;
    }   
       
    public List getCurrent() {
        return current;
    }

    public void setCurrent(List current) {
        this.current = current;
    }
    
    
    public void setStep(String step){
        path.push(step);
    }
    
    public void removeStep(){
        path.pop();
    }
    public Deque<String> getPath() {
        return path;
    }
    
    public int[] getSolution() {
        return solution;
    }
    
}
