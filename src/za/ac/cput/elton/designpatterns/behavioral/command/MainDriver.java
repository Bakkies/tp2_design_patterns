/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.behavioral.command;

/**
 *
 * @author 101Lenboxs
 */
public class MainDriver {
    public static void main(String[] args)
    {
        Lunch lunch = new Lunch();
        Command lunchCommand = new LunchCommand(lunch);
        
        Dinner dinner = new Dinner();
        Command dinnerCommand = new DinnerCommand(dinner);
        
        MealInvoker mealInvoker = new MealInvoker(lunchCommand);
        mealInvoker.invoke();
        
        mealInvoker.setCommand(dinnerCommand);
        mealInvoker.invoke();
    }
}
