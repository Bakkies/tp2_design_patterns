/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.mediator;

/**
 *
 * @author 101Lenboxs
 */
public class FrenchBuyer extends Buyer{
    public FrenchBuyer(Mediator mediator){
        super(mediator , "euro");
        this .mediator.registerFrenchBuyer(this);
    }
}
