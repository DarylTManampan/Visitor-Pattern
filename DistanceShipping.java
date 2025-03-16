import java.util.*;
public class DistanceShipping implements ShippingCalculator {
    private Map<String, Double> rates;

    public DistanceShipping() {
        rates = new HashMap<>();
        rates.put("chair", 20.0);
        rates.put("sofa", 150.0);
        rates.put("table", 100.0);
        rates.put("cabinet", 300.0);
    }

    @Override
    public double calculateCost(Furniture furniture) {
        double totalCost = rates.get(furniture.getType());
        return totalCost + (furniture.getWeight() * 3.0) + (furniture.getSize() * 4.5);
    }
}