
import java.util.Collection;

/**
 *
 * @author wku
 */
public interface PricingStrategy {

    public static int REGULAR = 99;
    public static int VALENTINE = 0;
    public static int MOTHER = 1;

    public float calculateTotal(Collection<Product> items);
}
