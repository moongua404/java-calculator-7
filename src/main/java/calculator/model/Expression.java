package calculator.model;

import calculator.utils.Validator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Expression {
    private HashSet<Character> operators;
    private String expression;

    public static Expression parse(String line) {
        Expression expression = new Expression();

        line = line.trim();
        line = expression.extractOperators(line);
        expression.expression = line;

        return expression;
    }

    public HashSet<Character> getOperators() {
        return operators;
    }

    public String getExpression() {
        return expression;
    }

    public int calculate() {
        List<String> results = Arrays.stream(expression.split(getOperatorsRegex())).toList();
        results.forEach(Validator::validatePositiveInt);
        try {
            return results.stream()
                    .mapToInt(Integer::parseInt)
                    .reduce(0, Math::addExact);
        } catch (Exception exception) {
            throw new IllegalArgumentException("Invalid expression: " + expression, exception);
        }
    }

    private String extractOperators(String line) {
        this.operators = new HashSet<>();
        this.operators.addAll(Arrays.asList(':', ','));
        Matcher matcher = Pattern.compile("^//(.)\\\\n(.*)").matcher(line);
        if (matcher.find()) {
            operators.add(matcher.group(1).charAt(0));
            return matcher.group(2);
        }
        return line;
    }

    private String getOperatorsRegex() {
        return operators.stream()
                .map((ch) -> Pattern.quote(ch.toString())) // \같은 문자 처리
                .collect(Collectors.joining("|"));
    }
}