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
        System.out.printf("Chair: " + local.calculateCost(chair) + " pesos\n");
        System.out.printf("Sofa: " + local.calculateCost(sofa) + " pesos\n");
        System.out.printf("Table: " + local.calculateCost(table) + " pesos\n");
        System.out.printf("Cabinet: " + local.calculateCost(cabinet) + " pesos\n");

        //Distance

        System.out.println("\nDistance Shipping Costs:");
        System.out.printf("Chair: " + distance.calculateCost(chair) + " pesos\n");
        System.out.printf("Sofa: " + distance.calculateCost(sofa) + " pesos\n");
        System.out.printf("Cabinet: " + distance.calculateCost(cabinet) + " pesos\n");
    }
}