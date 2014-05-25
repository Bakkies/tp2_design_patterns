/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.mediator;

/**
 *
 * @author 101Lenboxs
 */
public class Buyer {
    public Mediator mediator ;
    String unitOfCurrency ;

    public Buyer(Mediator mediator , String unitOfCurrency) {
        this.mediator = mediator ;
        this .unitOfCurrency = unitOfCurrency ;
    }
    public boolean attemptToPurchase(float bid) {
        System .out.println("Buyer attempting a bid of " + bid + "" + unitOfCurrency);
        return mediator .placeBid(bid , unitOfCurrency);
    }
}
