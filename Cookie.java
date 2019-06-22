/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Fawzi
 */
public class Cookie extends DessertItem {

    //String Cookie_name;
    public int Cookie_number;
    public double Cookie_price;
    public double Cookie_cost;

    public Cookie(String name, int number, double price) {
        super(name);
        Cookie_number = number;
        Cookie_price = price;
    }

    @Override
    public int getCost() {
        Cookie_cost = Cookie_number * Cookie_price / 12;
        return ((int) Math.round(Cookie_cost));
    }
}
