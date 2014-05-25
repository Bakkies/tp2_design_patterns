/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.decorator;

/**
 *
 * @author 101Lenboxs
 */
public class LivingAnimal implements Animal{
    @Override
    public void describe(){
        System.out.println("\nI am an animal.");
    }
}
