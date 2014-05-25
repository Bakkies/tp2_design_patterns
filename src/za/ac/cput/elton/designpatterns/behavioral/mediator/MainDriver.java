/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.mediator;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args){
        Mediator mediator = new Mediator();
        
        Buyer swedishBuyer = new SwedishBuyer(mediator);
        Buyer frenchBuyer = new FrenchBuyer(mediator);
        float sellingPriceInDollars = 10.0f;
        AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);
        DollarConverter dollarConverter = new DollarConverter(mediator);
        
        float swedishBidInKronor = 55.0f;
        
        while(!frenchBuyer.attemptToPurchase(swedishBidInKronor)){
            swedishBidInKronor += 15.0f;
        }
        
        float frechBidInEuros = 3.0f;
        while(!frenchBuyer.attemptToPurchase(frechBidInEuros)){
            frechBidInEuros += 1.5f;
        }
    }
}
