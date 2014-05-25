/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.factorymethod;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args){
        AnimalFactory animalFactory = new AnimalFactory();
        
        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound: "+ a1.makeSound());
    
        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a1 sound: "+ a2.makeSound());
        
    }
}
