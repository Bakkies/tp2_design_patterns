/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.strategy;

/**
 *
 * @author 101Lenboxs
 */
public class SkiStrategy implements Strategy{
    @Override
    public boolean checkTemperature(int temperatureInF) {
        if (temperatureInF <= 32) {
        return true;
        }else{ 
            return false ;
        }
    }
}
