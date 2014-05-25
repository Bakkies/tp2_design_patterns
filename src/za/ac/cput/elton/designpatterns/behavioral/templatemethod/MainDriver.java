/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.templatemethod;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args)
    {
        Meals meal1 = new HamburgerMeal();
        meal1.doMeal();
        
        System.out.println();
        
        Meals meal2 = new CheeseBurgerMeal();
        meal2.doMeal();
    }
}
