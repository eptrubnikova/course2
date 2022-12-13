package ralli;

public class Validate {

    public static double validateEngineVolume(double value) {
        return value <= 0 ? 1.5 : value;
    }

    public static int validateSpeed(int value) {
        return value <= 0 ? 60 : value;
    }

    public static int validateValue(int value) {
        return value <= 0 ? 0 : value;
    }

    public static String validateValue(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "некорректные данные" : value;
    }

    public static Float validateFloat(Float value) {
        return value == null ? null : value;
    }

    public static Integer validateInteger(Integer value) {
        return value == null ? null : value;
    }

    public static double validateValue(double value) {
        return value == 0 ? 1 : value;
    }
}
