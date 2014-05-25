/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.proxy;

/**
 *
 * @author 101Lenboxs
 */
public class SlowThing extends Thing{

    public SlowThing() {
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    } 
}
