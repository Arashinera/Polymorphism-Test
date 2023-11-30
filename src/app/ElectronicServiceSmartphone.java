package app;

import java.lang.Math;
public class ElectronicServiceSmartphone extends ElectronicService {
    static final double BLACK_FRIDAY_DISCOUNT = 15.5;

    public ElectronicServiceSmartphone(String name, String color, int productCode, double pricePerItem, double quantity, double screenHeight, double screenLength) {
        super(name, color, productCode, pricePerItem, quantity, screenHeight, screenLength);
    }

    @Override
    double calcCost() {
        return pricePerItem * quantity;
    }

    double calcDiscount() {
        return calcCost() - (calcCost() * (BLACK_FRIDAY_DISCOUNT / 100));
    }

    @Override
    double calcScreenDiagonal() {
        return Math.sqrt((Math.pow(screenHeight, 2)) + (Math.pow(screenLength, 2)));
    }
}
