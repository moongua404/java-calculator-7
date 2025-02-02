package calculator;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

import calculator.model.Expression;
import org.junit.jupiter.api.Test;

public class ExpressionTest {
    @Test
    void Extract_Separator() {
        assertSimpleTest(() -> {
            Expression expression = Expression.parse("//*\\n1*2*3");
            assertThat(expression.getOperators()).contains('*');
            assertThat(expression.getExpression()).isEqualTo("1*2*3");
        });
    }

    @Test
    void No_Separator() {
        assertSimpleTest(() -> {
            Expression expression = Expression.parse("1,2,3");
            assertThat(expression.getExpression()).isEqualTo("1,2,3");
        });
    }
}
