/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.adapter;

/**
 *
 * @author 101Lenboxs
 */
public class TemperatureObjectReporter implements TemperatureInfo{

    CelciusReporter celciusReporter;
    
    public TemperatureObjectReporter(){
        celciusReporter = new CelciusReporter();
    }
    
    @Override
    public double getTemperatureInF() {
         return cToF(celciusReporter.getTemperature());
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        celciusReporter.setTemperature(fToC(temperatureInF));
    }   

    @Override
    public double getTemperatureInC() {
       return celciusReporter.getTemperature();
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        celciusReporter.setTemperature(temperatureInC);
    }
    
    private double fToC(double f){
        return ((f - 32) * 5 / 9);
    }
    private double cToF(double c){
        return ((c * 9 / 5) + 32);
    }
}
