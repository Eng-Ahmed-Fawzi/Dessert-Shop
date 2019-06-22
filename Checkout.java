
import java.util.ArrayList;

/**
 *
 * @author Ahmed Fawzi
 */
public class Checkout {

    ArrayList<DessertItem> items;
    protected int sum = 0;

    public Checkout() {
        items = new ArrayList<>();
    }

    public void enterItem(DessertItem item) {
        items.add(item);
    }

    public void clear() {
        items.clear();
    }

    public int numberOfItems() {
        return ((int) items.size());
    }

    @Override
    public java.lang.String toString() {
        String result = DessertShoppe.STORE_NAME + "\n";
        result += "--------------------\n";
        for (int i = 0; i < numberOfItems(); i++) {
            if (items.get(i) instanceof Candy) {
                Candy c = (Candy) items.get(i);
                result += c.Candy_weight + " lbs. @ " + DessertShoppe.cents2dollarsAndCents((int) c.Candy_price) + "/lb.\n";
                result += items.get(i).name;
                for (int j = items.get(i).name.length(); j < 31; j++) {
                    result += " ";
                }
                result += DessertShoppe.cents2dollarsAndCents(items.get(i).getCost()) + "\n";
            } else if (items.get(i) instanceof Cookie) {
                Cookie ck = (Cookie) items.get(i);
                result += ck.Cookie_number + " @ " + DessertShoppe.cents2dollarsAndCents((int) ck.Cookie_price) + "/dz.\n";
                result += items.get(i).name;
                for (int j = items.get(i).name.length(); j < 31; j++) {
                    result += " ";
                }
                result += DessertShoppe.cents2dollarsAndCents(items.get(i).getCost()) + "\n";
            } else if (items.get(i) instanceof IceCream || items.get(i) instanceof Sundae) {
                result += items.get(i).name;
                for (int j = items.get(i).name.length(); j < 31; j++) {
                    result += " ";
                }
                result += DessertShoppe.cents2dollarsAndCents(items.get(i).getCost()) + "\n";
            } else {
                result += "\n**********Wrong Format************\n";
            }
        }
        result += "-----------------------------------\n";
        result += "Tax:";
        String totalPay = DessertShoppe.cents2dollarsAndCents(totalTax());
        if (totalPay.length() > DessertShoppe.COST_WIDTH) {
            totalPay = totalPay.substring(0, DessertShoppe.COST_WIDTH);
        }
        for (int j = 4; j < 28; j++) {
            result += " ";
        }
        result += "$   " + totalPay + "\n";

        result += "Total Cost:";
        totalPay = DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax());
        if (totalPay.length() > DessertShoppe.COST_WIDTH) {
            totalPay = totalPay.substring(0, DessertShoppe.COST_WIDTH);
        }
        for (int j = 11; j < 28; j++) {
            result += " ";
        }
        result += "$ " + totalPay + "\n";

        return result;
    }

    public int totalTax() {
        return ((int) (Math.round(totalCost() * (DessertShoppe.TAX_RATE / 100))));
    }

    public int totalCost() {
        //make sum into zero, and calculate price from every item
        sum = 0;
        for (int i = 0; i < numberOfItems(); i++) {
            sum += items.get(i).getCost();
        }
        return sum;
    }
}
