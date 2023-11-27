package org.example.calculator;

import java.util.List;
import org.example.calculator.calculate.AdditionOperator;
import org.example.calculator.calculate.DivisionOperator;
import org.example.calculator.calculate.MultiplicationOperator;
import org.example.calculator.calculate.NewArithmeticOperator;
import org.example.calculator.calculate.PositiveNumber;
import org.example.calculator.calculate.SubtractionOperator;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(
            new AdditionOperator(),
            new SubtractionOperator(),
            new MultiplicationOperator(),
            new DivisionOperator()
    );

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }
}
