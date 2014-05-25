/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 101Lenboxs
 */
public class FlyWeightFactory {
    public static FlyWeightFactory flyWeightFactory;
    private Map<String, FlyWeight> flyWeightPool;
    
    private FlyWeightFactory(){
        flyWeightPool = new HashMap();
    }
    
    public static FlyWeightFactory getInstance(){
        if(flyWeightFactory == null){
            flyWeightFactory = new FlyWeightFactory();
        }
        return flyWeightFactory;
    }
    
    public FlyWeight getFlyWeight(String key){
        if(flyWeightPool.containsKey(key)){
            return flyWeightPool.get(key);
        }else{
            FlyWeight flyWeight;
            if("add".equals(key)){
                flyWeight = new FlyWeightAdder();
            }else{
                flyWeight = new FlyWeightMultiplier();
            }
            flyWeightPool.put(key, flyWeight);
            return flyWeight;
        }
    }
}
