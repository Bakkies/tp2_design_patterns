/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.flyweight;

/**
 *
 * @author 101Lenboxs
 */
public class FlyWeightMultiplier implements FlyWeight{
    String operation;
    
    public FlyWeightMultiplier(){
        operation = "multiplying";
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public void doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + ": " + (a * b));
    }
    
}
