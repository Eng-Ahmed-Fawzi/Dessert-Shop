/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Fawzi
 */
public class Sundae extends IceCream {

    public Sundae(String name, float price, String name2, float price2) {
// invoking base-class(Bicycle) constructor 
        super(name2 +" Sundae with "+name, price + price2);
    }

    @Override
    public int getCost() {
        return ((int) Math.round(IceCream_price ));
    }
}
