package calculator.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
}