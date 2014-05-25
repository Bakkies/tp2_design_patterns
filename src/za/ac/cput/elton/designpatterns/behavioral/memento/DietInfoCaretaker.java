/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.memento;

/**
 *
 * @author 101Lenboxs
 */
public class DietInfoCaretaker {
    Object objMemento ;
    public void saveState(DietInfo dietInfo){
        objMemento = dietInfo .save() ;
    }
    public void restoreState(DietInfo dietInfo){
        dietInfo .restore(objMemento);
    }
}
