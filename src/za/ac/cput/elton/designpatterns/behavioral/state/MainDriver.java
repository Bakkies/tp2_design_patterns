/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.state;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args){
        Person person = new Person(new HappyState());
        System.out.println("Hello in happy state : " + person.sayHello());
        System.out.println("Goodbye in happy state : " + person.sayGoodbye());
        
        person.setEmotionalState(new SadState());
        System.out.println("Hello in sad state : " + person.sayHello());
        System.out.println("Goodbye in sad state : " + person.sayGoodbye());
    }
}
