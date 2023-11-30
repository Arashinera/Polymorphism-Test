package app;

import java.text.DecimalFormat;

public class Rounder {

    public static String roundValue(double value){
        return new DecimalFormat("#.00").format(value);
    }

    public static String roundDiagonal(double diag){
        return new DecimalFormat("#.0").format(diag);
    }

    public static String roundWeight(double weight){
        return new DecimalFormat("#.000").format(weight);
    }
}
