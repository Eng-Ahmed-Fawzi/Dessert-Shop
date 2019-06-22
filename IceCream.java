/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Fawzi
 */
public class IceCream extends DessertItem {

    //String IceCream_name;
    float IceCream_price;

    public IceCream(String name, float price) {
        super(name);
        IceCream_price = price;
    }

    @Override
    public int getCost() {
        return ((int)Math.round(IceCream_price));
    }
}

