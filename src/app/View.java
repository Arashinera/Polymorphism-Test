package app;

public class View {

    static String name;
    static int productCode;
    static String color;
    static int quantity;
    static double pricePerItem;
    static String roundPricePerItem;
    static String roundCost;
    static String roundDiscount;
    static String roundDiagonal;
    static String roundWeight;
    static String roundTotalWeight;
    static String productData;
    static double screenHeight;
    static double screenLength;
    static double weightPerItem;
    static double totalWeight;
    static final String CURRENCY = "EUR";
    static final String DIAGONAL_MEASURE = "sm";
    static final String WEIGHT_MEASURE = "kg";

    public static void handleLaptop() {
        name = "ASUS ROG g15";
        productCode = 1735;
        color = "Space Grey";
        quantity = 3;
        pricePerItem = 788.9;
        screenHeight = 20;
        screenLength = 30;
        ElectronicServiceLaptop service = new ElectronicServiceLaptop(name, color, productCode,
                pricePerItem, quantity,
                screenHeight, screenLength);
        roundPricePerItem = Rounder.roundValue(pricePerItem);
        roundCost = Rounder.roundValue(service.calcCost());
        roundDiscount = Rounder.roundValue(service.calcCost());
        roundDiagonal = Rounder.roundDiagonal(service.calcScreenDiagonal());
        productData = "Product: " + name + "\nProduct Code : " + productCode
                + "\nProduct quantity : " + quantity
                + "\nPrice per item : " + CURRENCY + " " + roundPricePerItem
                + "\nColor : " + color + "\nDiagonal : " + roundDiagonal + DIAGONAL_MEASURE
                + "\nTotal cost : " + CURRENCY + " " + roundCost
                + "\nDiscount cost : " + CURRENCY + " " + roundDiscount;
        getOutput(productData);
        section();
    }

    public static void handleSmartphone() {
        name = "Sony Xperia Pro I";
        productCode = 9899;
        color = "Black";
        quantity = 7;
        pricePerItem = 1100;
        screenHeight = 13;
        screenLength = 7;
        ElectronicServiceSmartphone service = new ElectronicServiceSmartphone(name, color, productCode,
                pricePerItem, quantity,
                screenHeight, screenLength);
        roundPricePerItem = Rounder.roundValue(pricePerItem);
        roundCost = Rounder.roundValue(service.calcCost());
        roundDiscount = Rounder.roundValue(service.calcDiscount());
        roundDiagonal = Rounder.roundDiagonal(service.calcScreenDiagonal());
        productData = "Product: " + name + "\nProduct Code : " + productCode
                + "\nProduct quantity : " + quantity
                + "\nPrice per item : " + CURRENCY + " " + roundPricePerItem
                + "\nColor : " + color + "\nDiagonal : " + roundDiagonal + DIAGONAL_MEASURE
                + "\nTotal cost : " + CURRENCY + " " + roundCost
                + "\nDiscount cost : " + CURRENCY + " " + roundDiscount;
        getOutput(productData);
        section();
    }

    public static void handleTV() {
        name = "Sony Sci-Fi";
        productCode = 8943;
        color = "White";
        quantity = 3;
        pricePerItem = 1999;
        screenHeight = 80;
        screenLength = 140;
        weightPerItem = 7;
        ElectronicServiceTV service = new ElectronicServiceTV(name, color, productCode,
                pricePerItem, quantity,
                screenHeight, screenLength,
                weightPerItem, totalWeight);
        roundPricePerItem = Rounder.roundValue(pricePerItem);
        roundCost = Rounder.roundValue(service.calcCost());
        roundDiscount = Rounder.roundValue(service.calcDiscount());
        roundDiagonal = Rounder.roundDiagonal(service.calcScreenDiagonal());
        roundWeight = Rounder.roundWeight(weightPerItem);
        roundTotalWeight = Rounder.roundWeight(service.calcTotalWeight());
        productData = "Product: " + name + "\nProduct Code : " + productCode
                + "\nProduct quantity : " + quantity
                + "\nPrice per item : " + CURRENCY + " " + roundPricePerItem
                + "\nColor : " + color + "\nDiagonal : " + roundDiagonal + DIAGONAL_MEASURE
                + "\nWeight per item :" + roundWeight + WEIGHT_MEASURE
                + "\nTotal weight : " + roundTotalWeight + WEIGHT_MEASURE
                + "\nTotal cost : " + CURRENCY + " " + roundCost
                + "\nDiscount cost : " + CURRENCY + " " + roundDiscount;
        getOutput(productData);
        section();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }

    public static void section() {
        System.out.println("-------------------------");
    }
}
