/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.decorator;

/**
 *
 * @author 101Lenboxs
 */
public abstract class AnimalDecorator implements Animal{
    Animal animal;
    
    public AnimalDecorator(Animal animal){
        this.animal = animal;
    }
}
