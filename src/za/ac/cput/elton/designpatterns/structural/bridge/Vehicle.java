/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.bridge;

/**
 *
 * @author 101Lenboxs
 */
public abstract class Vehicle {
    Engine engine;
    int weightInKilos;
    
    public abstract void drive();
    
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    
    public void reportOnSpeed(int horsepower){
        int ratio = weightInKilos / horsepower;
        if(ratio < 3){
            System.out.println("The vehicle is going at a fast speed.");
        } else if((ratio >=3) && (ratio < 8)){
            System.out.println("The vehicle is going at an average speed.");
        } else{
            System.out.println("The vehicle is going at a slow speed.");
        }
    }
}
