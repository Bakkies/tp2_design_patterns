/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.abstractfactory;

/**
 *
 * @author 101Lenboxs
 */
public class AbstractFactory {
    public SpeciesFactory getSpeciesFactory(String type){
        if("mammal".equals(type)){
            return new MammalFactory();
        }else{
            return new ReptileFactory();
        }
    }
}
