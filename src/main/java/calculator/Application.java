package calculator;

import calculator.controller.CalculatorController;

public class Application {
    static AppConfig appConfig;
    static CalculatorController calculatorController;

    public static void main(String[] args) {
        appConfig = new AppConfig();
        calculatorController = appConfig.calculatorController();

        calculatorController.run();
    }
}
