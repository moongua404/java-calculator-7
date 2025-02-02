package calculator.view;

import calculator.utils.MessageConstants;

public class OutputView {
    public void printResult(int v) {
        System.out.printf((MessageConstants.RESULT_MESSAGE.getMessage()) + "%n", v);
    }
}
