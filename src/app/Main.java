package app;

public class Main {

    private static final double CONV_K = 1.609344;

    public static void main(String[] args) {
        System.out.println("App for converting units of length.");
        double ml = 3;
        double km = 9;
        double kilometres = convMlToKm(ml);
        double miles = convKmToMl(km);
        System.out.println("Result is " + kilometres + " km and " + miles + " ml.");

    }
    private static double convMlToKm(double ml) {
        return ml * CONV_K;
    }

    private static double convKmToMl(double km) {
        return km / CONV_K;
    }


}
