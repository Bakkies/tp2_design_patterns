/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.abstractfactory;

/**
 *
 * @author 101Lenboxs
 */
public class ReptileFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type){
        if("snake".equals(type)){
            return new Snake();
        }else {
            return new Tyrannosaurus();
        }
    }
}
