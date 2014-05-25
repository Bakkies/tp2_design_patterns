/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.bridge;

/**
 *
 * @author 101Lenboxs
 */
public class BigEngine implements Engine {
    
    int horsepower;
    
    public BigEngine(){
        horsepower = 350;
    }
    
    @Override
    public int go() {
        System.out.println("\nThe big engine is running");
        return horsepower;
    }
}
