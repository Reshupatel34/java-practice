public class UnitConverterCelsius {

    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kg) {
        double kilograms2pounds = 2.20462;
        return kg * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        System.out.println("100°F in °C: " + convertFarhenheitToCelsius(100));
        System.out.println("0°C in °F: " + convertCelsiusToFarhenheit(0));
        System.out.println("50 pounds in Kg: " + convertPoundsToKilograms(50));
        System.out.println("20 Kg in Pounds: " + convertKilogramsToPounds(20));
        System.out.println("2 Gallons in Liters: " + convertGallonsToLiters(2));
        System.out.println("5 Liters in Gallons: " + convertLitersToGallons(5));
    }
}
