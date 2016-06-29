
import java.util.Vector;


public class ShoppingCart {

    Vector<Product> listOfItems = new Vector<Product>();
    private PricingStrategy strategy = null;

    public ShoppingCart() {
        strategy = new RegularDayStrategy();
    }

    public void setStrategy(int occ) {
        try {
            strategy = PricingStrategyFactory.create(occ);
        } catch (UnknownPricingStrategyTypeException ex) {
            System.out.println("UnknownPricingStrategyTypeException");
        }
    }

    public float checkout() {
        return strategy.calculateTotal(listOfItems);
    }

    public void add(Product item) {
        if (item != null) {
            listOfItems.add(item);
        }
    }

}
