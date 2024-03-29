/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Fawzi
 */
public abstract class DessertItem {
   protected String name;
  
/**
 * Null constructor for DessertItem class
 */
  public DessertItem() {
    this("");
  }
/**
 * Initializes DessertItem data
     * @param name
 */   
  public DessertItem(String name) {
    if (name.length() <= DessertShoppe.MAX_ITEM_NAME_SIZE)
      this.name = name;
    else 
      this.name = name.substring(0,DessertShoppe.MAX_ITEM_NAME_SIZE);
  }
/**
 * Returns name of DessertItem
 * @return name of DessertItem
 */  
  public final String getName() {
    return name;
  }
/**
 * Returns cost of DessertItem
 * @return cost of DessertItem
 */  
  public abstract int getCost();   
}
