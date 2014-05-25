/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.adapter;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args){
        System.out.println("Class Adapter test");
        TemperatureInfo tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);
        
        System.out.println("\nObject Adapter test");
        tempInfo = new TemperatureObjectReporter();
        testTempInfo(tempInfo);
    }
    
    public static void testTempInfo(TemperatureInfo tempInfo){
        tempInfo.setTemperatureInC(0);
        System.out.println("Tempetarure in C :" + tempInfo.getTemperatureInC());
        System.out.println("Tempetarure in F :" + tempInfo.getTemperatureInF());
    
        tempInfo.setTemperatureInF(85);
        System.out.println("Tempetarure in C :" + tempInfo.getTemperatureInC());
        System.out.println("Tempetarure in F :" + tempInfo.getTemperatureInF());
    }
}
