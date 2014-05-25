/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.state;

/**
 *
 * @author 101Lenboxs
 */
public class HappyState implements EmotionalState{
    @Override
    public String sayGoodbye() {
        return "Bye, friend !";
    }
    @Override
    public String sayHello() {
        return "Hello , friend !";
    }
}
