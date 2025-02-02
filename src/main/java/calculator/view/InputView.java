package calculator.view;

import calculator.utils.MessageConstants;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String getExpression() {
        System.out.println(MessageConstants.GUIDE_MESSAGE.getMessage());
        return Console.readLine();
    }
}
