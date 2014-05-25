/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.chainofresponsibility;

/**
 *
 * @author 101Lenboxs
 */
public abstract class PlanetHandler {
    public PlanetHandler successor ;
    public void setSuccessor(PlanetHandler successor) {
    this .successor = successor ;
    }
    public abstract void handleRequest(PlanetEnum request);
}
