/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Fawzi
 */
public class DessertShop {
 public final static double TAX_RATE = 6.5;        // 6.5%
  public final static String STORE_NAME = "M & M Dessert Shoppe";
  public final static int MAX_ITEM_NAME_SIZE = 25;
  public final static int COST_WIDTH = 6;

  public static String cents2dollarsAndCents(int cents) {

    String s = "";

    if (cents < 0) {
      s += "-";
      cents *= -1;
    }

    int dollars = cents/100;
    cents = cents % 100;

    if (dollars > 0)
      s += dollars;

    s +=".";

    if (cents < 10)
      s += "0";

    s += cents;
    return s;
  }
}
