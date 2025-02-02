package calculator.utils;

public enum MessageConstants {
    GUIDE_MESSAGE("덧셈할 문자열을 입력해 주세요."),
    RESULT_MESSAGE("결과 : %d");

    private final String message;

    MessageConstants(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
