package app;

public class ElectronicServiceTV extends ElectronicService {

    double weightPerItem;
    double totalWeight;
    static final double BLACK_FRIDAY_DISCOUNT = 10.2;

    public ElectronicServiceTV(String name, String color, int productCode, double pricePerItem,
                               double quantity, double screenHeight, double screenLength,
                               double weightPerItem, double totalWeight) {
        super(name, color, productCode, pricePerItem, quantity, screenHeight, screenLength);
        this.weightPerItem = weightPerItem;
        this.totalWeight = totalWeight;
    }

    @Override
    double calcCost() {
        return pricePerItem * quantity;
    }

    double calcDiscount() {
        return calcCost() - (calcCost() * (BLACK_FRIDAY_DISCOUNT / 100));
    }

    double calcTotalWeight() {
        return weightPerItem * quantity;
    }

    @Override
    double calcScreenDiagonal() {
        return Math.sqrt((Math.pow(screenHeight, 2)) + (Math.pow(screenLength, 2)));
    }
}
