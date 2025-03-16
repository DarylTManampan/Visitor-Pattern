public class FurnitureProperties implements Furniture {
    private String type;
    private double weight;
    private double size;

    public FurnitureProperties(String type, double weight, double size) {
        this.type = type;
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void accept(ShippingCalculator furniture) {
    }
}