/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.singleton;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args){
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.sayHello();
    }
}
