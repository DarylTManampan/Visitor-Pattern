public interface Furniture {
    public void accept(ShippingCalculator furniture);
    public String getType();
    public double getWeight();
    public double getSize();
}