package app;

abstract class ElectronicService {

    String name;
    String color;
    int productCode;
    double pricePerItem;
    double quantity;
    double screenHeight;
    double screenLength;

    public ElectronicService
            (String name, String color, int productCode,
             double pricePerItem, double quantity,
             double screenHeight, double screenLength) {
        this.name = name;
        this.color = color;
        this.productCode = productCode;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
        this.screenHeight = screenHeight;
        this.screenLength = screenLength;
    }

    abstract double calcCost();

    abstract double calcScreenDiagonal();
}
