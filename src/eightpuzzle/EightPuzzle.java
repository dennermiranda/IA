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
public class EightPuzzle implements Comparable<EightPuzzle>{

    /**
     * @param args the command line arguments
     */
    private final int solution[] = {1, 2, 3, 4, 5, 6, 7, 8, 0};
    private List initialState  = new ArrayList();
    private List current  = new ArrayList();
    
    private Deque<String> path = new ArrayDeque<String>();
    private EightPuzzle parent = new EightPuzzle();
    private int hamming;
    public EightPuzzle getParent() {
        return parent;
    }

    public void setParent(EightPuzzle parent) {
        this.parent = parent;
    }

    public int getHamming() {
        return hamming;
    }
    
    
    public int hole (){
        return current.lastIndexOf(0);
    }

    public EightPuzzle() {
        
    }
    
    public int manhattan(){
        int x = 0;
        return x;
    }
    
    public int hamming (){
        int x = 0;
        for (int i = 0; i < 9; i++){
            if ((int )current.get(i)!= solution[i])
                x++;
        }
        this.hamming = x;
        return x;
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

    @Override
    public int compareTo(EightPuzzle o) {
        
        return Integer.compare(hamming, o.getHamming());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
