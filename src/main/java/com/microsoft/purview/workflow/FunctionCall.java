package com.microsoft.purview.workflow;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionCall implements Expression {
    private final String functionName;
    private final List<Expression> parameters;
    public FunctionCall(String functionName, List<Expression> parameters) {
        this.functionName = functionName;
        this.parameters = parameters;
    }

    @Override
    public String getExpression() {
        return functionName + "(" + parameters.stream().map(Expression::getExpression).collect(Collectors.joining(",")) + ")";
    }
}
