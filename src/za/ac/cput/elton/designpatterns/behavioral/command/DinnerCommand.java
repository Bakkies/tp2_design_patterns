/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.command;

/**
 *
 * @author 101Lenboxs
 */
public class DinnerCommand implements Command{
    Dinner dinner ;
    
    public DinnerCommand(Dinner dinner){
        this .dinner = dinner ;
    }
    @Override
    public void execute() {
        dinner .makeDinner() ;
    }
}
