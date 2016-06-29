
import java.util.*;

public class ValentinesDayStrategy implements PricingStrategy {

    public float calculateTotal(Collection<Product> items) {
        float total = 0.0f;
        Iterator<Product> iter = items.iterator();

        while (iter.hasNext()) {
            Product item = iter.next();
            float price = item.getPrice();
            if (item instanceof Toy) {
                price *= 1.25; //markup 25%
            }
            System.out.println("ValentinesDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
            total += price;
        }
        return total;
    }

}
