
import java.util.*;

public class MothersDayStrategy implements PricingStrategy {

    @Override
    public float calculateTotal(Collection<Product> items) {
        float total = 0.0f;
        Iterator<Product> iter = items.iterator();

        while (iter.hasNext()) {
            Product item = iter.next();
            float price = item.getPrice();            
            if (item instanceof Flower) {
                price *= 1.15; //markup 15%
            }
            System.out.println("MothersDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
            total += price;
        }
        return total;
    }

}
