/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.bridge;

/**
 *
 * @author 101Lenboxs
 */
public class SmallEngine implements Engine {
    
    int horsepower;
    
    public SmallEngine(){
        horsepower = 100;
    }
    
    @Override
    public int go() {
        System.out.println("\nThe small engine is running");
        return horsepower;
    }
}
