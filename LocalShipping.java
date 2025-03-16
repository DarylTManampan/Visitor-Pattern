import java.util.*;
public class LocalShipping implements ShippingCalculator {
    private Map<String, Double> rates;

    public LocalShipping() {
        rates = new HashMap<>();
        rates.put("chair", 20.0);
        rates.put("sofa", 50.0);
        rates.put("table", 40.0);
        rates.put("cabinet", 80.0);
    }

    @Override
    public double calculateCost(Furniture furniture) {
        double totalCost = rates.get(furniture.getType());
        return totalCost + (furniture.getWeight() *2.0) + (furniture.getSize() * 2.0);
    }
}