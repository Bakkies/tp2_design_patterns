/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.mediator;

/**
 *
 * @author 101Lenboxs
 */
public class SwedishBuyer extends Buyer{
    public SwedishBuyer(Mediator mediator){
        super(mediator , "krona");
        this.mediator.registerSwedishBuyer(this);
    }
}
