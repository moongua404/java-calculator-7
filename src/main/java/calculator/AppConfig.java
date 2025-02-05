package calculator;

import calculator.controller.CalculatorController;
import calculator.model.Expression;
import calculator.view.InputView;
import calculator.view.OutputView;

public class AppConfig {
    public InputView inputView() {
        return new InputView();
    }

    public OutputView outputView() {
        return new OutputView();
    }

    public Expression expression() {
        return new Expression();
    }

    public CalculatorController calculatorController() {
        return new CalculatorController(
                this.inputView(),
                this.outputView(),
                this.expression()
        );
    }
}
