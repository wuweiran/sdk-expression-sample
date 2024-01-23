package com.microsoft.purview.workflow;

import java.util.Arrays;

public class Functions {
    public static FunctionCall createArray(Expression... expressions) {
        return new FunctionCall("createArray", Arrays.stream(expressions).toList());
    }
}
