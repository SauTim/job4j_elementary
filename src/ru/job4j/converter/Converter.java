package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(double value) {
        double rsl = value / 80;
        return rsl;
    }

    public static double rubleToDollar(double value) {
        double rsl = value / 70;
        return rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euros.");
        System.out.println("140 rubles are " + dollar + " dollars.");
    }
}
