/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Fawzi
 */
public class Candy extends DessertItem {

    //String Candy_name;
    public double Candy_weight;
    public double Candy_price;
    public double Candy_cost;

    public Candy(String name, double weight, double price) {
        super(name);
        Candy_weight = weight;
        Candy_price = price;
    }

    @Override
    public int getCost() {
        Candy_cost = Candy_weight * Candy_price;
        return ((int) Math.round(Candy_cost));
    }
}
