/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.abstractfactory;

/**
 *
 * @author 101Lenboxs
 */
public class MammalFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type){
        if("dog".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
