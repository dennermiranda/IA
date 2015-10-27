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
import java.util.Objects;

/**
 *
 * @author Dener
 * @author Pedro Frazao
 */
public class EightPuzzle implements Comparable<EightPuzzle>{

    /**
     * @param args the command line arguments
     */
    private final int solution[] = {1, 2, 3, 4, 5, 6, 7, 8, 0};
    private List<Integer> initialState  = new ArrayList<Integer>();
    private List<Integer> current  = new ArrayList<Integer>();
    
    private Deque<String> path = new ArrayDeque<String>();
    private EightPuzzle parent = null;
    private String move;
    //private int hamming;
    private int h = 0;
    private int hash;

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }
    
    @Override
    public String toString() {
        return "EightPuzzle{" + "current=" + current + ", path=" + path + '}';
    }
    
    
    public int getH() {
        return h;
    }
    
    public boolean isSolution(){
        boolean sol = true;
        for (int i = 0; i <9; i ++){
            if ((int)current.get(i)!= solution [i])
                sol = false;
        }
        return sol;
    }
    public EightPuzzle getParent() {
        return parent;
    }

    public void setParent(EightPuzzle parent) {
        this.parent = parent;
    }

    
    
    public int hole (){
        return current.lastIndexOf(0);
    }

    public EightPuzzle() {
        
    }
    
    public int manhattan(){
        //int z = 0;
        
        int index = -1;
        
        for (int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                index++;
                
                int val = ((int)current.get(index)-1);
                
                if(val!=-1){
                    int horiz = val %3;
                    int vert = val / 3;
                    this.h += Math.abs(vert - (y)) + Math.abs(horiz - (x));                   
                    
                }
            }
        }
        
        
        return h;
    }
    
    public int hamming (){
        int x = 0;
        for (int i = 0; i < 9; i++){
            if ((int )current.get(i)!= solution[i])
                x++;
        }
        this.h = x;
        return x;
    }
    
    public void swap (int number){
        int holeP = this.hole();
        int indexTo = current.lastIndexOf(number);
        int x = current.set(holeP, number);
        int z = current.set(indexTo, 0);
    }
    
    public EightPuzzle(List<Integer> initialState) {
        this.initialState = initialState;
    }

    
    public List<Integer> getInitialState() {
        return initialState;
    }   
       
    public List<Integer> getCurrent() {
        return current;
    }

    public void setCurrent(List<Integer> current) {
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
        
        return Integer.compare(h, o.getH());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<EightPuzzle> genSucessors (){
        ArrayList<EightPuzzle> suc = new ArrayList<>();
        int hole = hole();
        
        //left
        if(hole != 0 && hole != 3 && hole !=6)
            swap(hole-1, suc, "Right");
        
        //top
        if (hole != 6 && hole != 7 && hole != 8)
            swap(hole+3, suc, "Down");
        
        //bottom
        if (hole != 0 && hole != 1 && hole != 2)
            swap(hole-3, suc, "Up");
        
        //right
        if (hole != 2 && hole != 5 && hole != 8)
            swap(hole+1, suc, "Left");
            
        return suc;
    }
    
    public void swap(int hole1, ArrayList<EightPuzzle> suc, String step){
        
        EightPuzzle puzzle = new EightPuzzle(this.current);
        List<Integer> newCurrent = new ArrayList<>(this.current);
        puzzle.setCurrent(newCurrent);
        
        
        int posNext = hole1;
        int holeOld = puzzle.hole();
        int valueOfNext = puzzle.getCurrent().get(hole1);
        puzzle.getCurrent().set(holeOld, valueOfNext);
        puzzle.getCurrent().set(posNext, 0);
        puzzle.setMove(step);
        puzzle.setParent(this);
        //puzzle.swap(hole1);
        suc.add(puzzle);
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.current);
        this.hash = hash;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        final EightPuzzle other = (EightPuzzle) obj;
        if (this.getCurrent().equals(other.getCurrent())) {
            return true;
        }
        return false;
    }

    public ArrayList<EightPuzzle> genSucessors(int heur) {
        ArrayList<EightPuzzle> suc = genSucessors();
        if(heur == 0){
            for (EightPuzzle suc1 : suc) {
                suc1.hamming();
            }
        }
        else{
            for (EightPuzzle suc1 : suc) {
                suc1.manhattan();
            }
        }
        return suc;
        
    }    
}
