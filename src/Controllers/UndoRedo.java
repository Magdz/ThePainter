/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.Stack;

/**
 *
 * @author Ahmed
 */
public class UndoRedo {
    
    private static Stack<Action> Undo;
    private static Stack<Action> Redo;
    
    public UndoRedo(){
        Undo = new Stack();
        Redo = new Stack();
    }
    
    public void addUndo(Action action){
        Undo.push(action);
    }
    
    private void addRedo(Action action){
        Redo.push(action);
    }
    
    public void Undo(){
        if(Undo.isEmpty())return;
        Action action = Undo.pop();
        action.Reverse();
        Redo.push(action);
    }
    
    public void Redo(){
        if(Redo.isEmpty())return;
        Action action = Redo.pop();
        action.Do();
        Undo.push(action);
    }
}
