package calculator.controller;

import calculator.model.Expression;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    InputView inputView;
    OutputView outputView;
    Expression expression;

    public CalculatorController(
            InputView inputView, OutputView outputView, Expression expression
    ) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.expression = expression;
    }

    public void run() {
        String line = inputView.getExpression();
        expression = Expression.parse(line);
        int result = expression.calculate();
        outputView.printResult(result);
    }
}
