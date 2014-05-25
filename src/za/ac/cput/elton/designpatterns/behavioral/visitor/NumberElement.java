/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.visitor;

/**
 *
 * @author 101Lenboxs
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);
}
