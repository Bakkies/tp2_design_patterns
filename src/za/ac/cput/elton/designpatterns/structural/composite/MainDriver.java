/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.composite;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args){
        Leaf leaf1 = new Leaf("Bob");
        Leaf leaf2 = new Leaf("Fred");
        Leaf leaf3 = new Leaf("Sue");
        Leaf leaf4 = new Leaf("Ellen");
        Leaf leaf5 = new Leaf("Joe");
        
        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);
        
        Composite composite2 = new Composite();
        composite2.add(leaf3);
        composite2.add(leaf4);
        
        Composite composite3 = new Composite();
        composite3.add(leaf1);
        composite3.add(leaf2);
        composite3.add(leaf5);
        
        System.out.println("Calling 'sayHello' on leaf1");
        leaf1.sayHello();
        
        System.out.println("\nCalling 'sayHello' on composite1");
        composite1.sayHello();
        
        System.out.println("\nCalling 'sayHello' on composite2");
        composite2.sayHello();
        
        System.out.println("\nCalling 'sayGoodbye' on composite3");
        composite3.sayGoodbye();
    }
}
