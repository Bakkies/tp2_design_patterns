/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.command;

/**
 *
 * @author 101Lenboxs
 */
public class LunchCommand implements Command{
    Lunch lunch ;
    
    public LunchCommand(Lunch lunch){
        this .lunch = lunch ;
    }
    @Override
    public void execute(){
        lunch .makeLunch() ;
    }
}
