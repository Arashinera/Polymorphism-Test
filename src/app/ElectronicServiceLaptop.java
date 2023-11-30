package app;

import java.lang.Math;
public class ElectronicServiceLaptop extends ElectronicService {


    public ElectronicServiceLaptop(String name, String color, int productCode, double pricePerItem, double quantity, double screenHeight, double screenLength) {
        super(name, color, productCode, pricePerItem, quantity, screenHeight, screenLength);
    }

    @Override
    double calcCost() {
        return pricePerItem * quantity;
    }

    @Override
    double calcScreenDiagonal() {
        return Math.sqrt((Math.pow(screenHeight, 2)) + (Math.pow(screenLength, 2)));
    }
}
