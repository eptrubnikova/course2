package zoo;

public class Validation {

    public static String validateValue(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "некорректные данные" : value;
    }

}
