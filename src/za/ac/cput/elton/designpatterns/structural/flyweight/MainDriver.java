/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.flyweight;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args){
        FlyWeightFactory flyWeightFactory = FlyWeightFactory.getInstance();
    
        for(int i = 0; i < 5; i++){
            FlyWeight flyWeightAdder = flyWeightFactory.getFlyWeight("add");
            flyWeightAdder.doMath(i, i);
            
            FlyWeight flyWeightMultiplier = flyWeightFactory.getFlyWeight("multiply");
            flyWeightMultiplier.doMath(i, i);
        }
    }
}
