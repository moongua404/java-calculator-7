package calculator.controller;

import calculator.model.Expression;
import calculator.service.CalculatorService;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    InputView inputView;
    OutputView outputView;
    CalculatorService calculatorService;
    Expression expression;

    public CalculatorController(
            InputView inputView, OutputView outputView, CalculatorService calculatorService, Expression expression
    ) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.calculatorService = calculatorService;
        this.expression = expression;
    }

    public void run() {
        String line = inputView.getExpression();
        
    }
}
