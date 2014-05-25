/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.abstractfactory;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args){
        AbstractFactory abstractFactory = new AbstractFactory();
        
        SpeciesFactory speciesFactory = abstractFactory.getSpeciesFactory("reptile");
        Animal a1 = speciesFactory.getAnimal("tyrannosaurus");
        System.out.println("a1 sound: "+ a1.makeSound());
        Animal a2 = speciesFactory.getAnimal("snake");
        System.out.println("a2 sound: "+ a2.makeSound());
        
        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
        Animal a3 = speciesFactory2.getAnimal("dog");
        System.out.println("a3 sound: "+ a3.makeSound());
        Animal a4 = speciesFactory2.getAnimal("cat");
        System.out.println("a4 sound: "+ a4.makeSound());
    }
}
