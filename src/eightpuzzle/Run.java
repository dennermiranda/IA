/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

/**
 *
 * @author Dener
 */
public class Run {
    public static void main (String args []){
        new GUIPuzzleF().setVisible(true);
        EightPuzzle puzzle = new EightPuzzle();
        
        if(!puzzle.isSolution()){
            
        }
    }
}
