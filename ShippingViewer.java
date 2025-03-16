public class ShippingViewer {
    public static void main(String[] args) {
        Furniture chair = new FurnitureProperties("chair", 5.0, 3.0);
        Furniture sofa = new FurnitureProperties("sofa", 50.0, 30.0);
        Furniture table = new FurnitureProperties("table", 30.0, 10.0);
        Furniture cabinet = new FurnitureProperties("cabinet", 70.0, 20.0);

        ShippingCalculator local = new LocalShipping();
        ShippingCalculator distance = new DistanceShipping();

        //Display

        System.out.println("\nFurniture Shippng Fees\n");

        //Local

        System.out.println("Local Shipping Costs:");
        System.out.println("Chair: " + local.calculateCost(chair) + " pesos\n");
        System.out.println("Sofa: " + local.calculateCost(sofa) + " pesos\n");
        System.out.println("Table: " + local.calculateCost(table) + " pesos\n");
        System.out.println("Cabinet: " + local.calculateCost(cabinet) + " pesos\n");

        //Distance

        System.out.println("\nDistance Shipping Costs:");
        System.out.println("Chair: " + distance.calculateCost(chair) + " pesos\n");
        System.out.println("Sofa: " + distance.calculateCost(sofa) + " pesos\n");
        System.out.println("Cabinet: " + distance.calculateCost(cabinet) + " pesos\n");
    }
}