package calculator.utils;

public class Validator {
    public static void validatePositiveInt(String number) {
        try {
            if (Integer.parseInt(number) < 0) {
                throw new NumberFormatException();
            }
        } catch (Exception exception) {
            throw new IllegalArgumentException("Invalid number: " + number);
        }
    }
}
