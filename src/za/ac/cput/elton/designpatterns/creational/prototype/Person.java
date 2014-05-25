/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.prototype;

/**
 *
 * @author 101Lenboxs
 */
public class Person implements Prototype{
    String name;
    public Person(String name){
        this.name = name;
    }
    
    @Override
    public Prototype doClone() {
        return new Person(name);
    }
    
    @Override
    public String toString(){
        return "This person is named " + name;
    }
}
