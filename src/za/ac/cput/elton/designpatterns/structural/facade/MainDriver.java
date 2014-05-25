/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.facade;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args){
        Facade facade = new Facade();
        int x = 3;
        System.out.println("Cube of " + x + ": "+ facade.cubeX(3));
        System.out.println("Cube of " + x + " times 2: "+ facade.cubeXTimes2(3));
        System.out.println(x + " to the sixth power times 2: "+ facade.xToSixthPowerTimes2(3));
    }
}
