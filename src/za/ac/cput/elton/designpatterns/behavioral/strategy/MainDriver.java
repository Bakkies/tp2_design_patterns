/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.strategy;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args){
        int tempInf = 60;
        
        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(tempInf, skiStrategy);
        
        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for skiing? " + context.getResult());
        
        Strategy hikeStrategy = new HikeStrategy();
        context.setStrategy(hikeStrategy);
        
        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for hiking? " + context.getResult());
        
    }
}
