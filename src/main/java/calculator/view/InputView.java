package calculator.view;

import calculator.utils.MessageConstants;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String getExpression() {
        try {
            System.out.println(MessageConstants.GUIDE_MESSAGE.getMessage());
            return Console.readLine();
        } catch (Exception exception) {
            throw new IllegalArgumentException("Something went wrong on input process.");
        }
    }
}
