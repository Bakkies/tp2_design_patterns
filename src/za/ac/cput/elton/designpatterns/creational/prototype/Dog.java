/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.prototype;

/**
 *
 * @author 101Lenboxs
 */
public class Dog implements Prototype{
    String sound;
    public Dog(String sound){
        this.sound = sound;
    }
    
    @Override
    public Prototype doClone() {
        return new Dog(sound);
    }
    
    @Override
    public String toString(){
        return "This dog says " + sound;
    }
}
