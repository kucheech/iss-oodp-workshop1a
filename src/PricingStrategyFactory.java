
/**
 *
 * @author wku
 */
public class PricingStrategyFactory {

    public static PricingStrategy create(int occ) throws UnknownPricingStrategyTypeException {
        PricingStrategy strategy = null;

        switch (occ) {
            case PricingStrategy.REGULAR:
                strategy = new RegularDayStrategy();
                break;
            case PricingStrategy.VALENTINE:
                strategy = new ValentinesDayStrategy();
                break;
            case PricingStrategy.MOTHER:
                strategy = new MothersDayStrategy();
                break;

            default:
                throw new UnknownPricingStrategyTypeException(occ);
        }
        
        return strategy;
    }
}
